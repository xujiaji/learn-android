package com.xujiaji.learnmvvm.service.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.xujiaji.learnmvvm.service.model.Project;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author: xujiaji
 * created on: 2018/6/11 21:50
 * description:
 */
public class NetRepository
{
    private Api mApi;
    private static NetRepository mInstance;

    private NetRepository()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mApi = retrofit.create(Api.class);
    }

    public static NetRepository getInstance()
    {
        if (mInstance == null)
        {
            synchronized (NetRepository.class)
            {
                if (mInstance != null) return mInstance;
                mInstance = new NetRepository();
            }
        }

        return mInstance;
    }

    public LiveData<List<Project>> getProjectList(String userId)
    {
        final MutableLiveData<List<Project>> data = new MutableLiveData<>();
        mApi.getProjectList(userId).enqueue(new Callback<List<Project>>()
        {
            @Override
            public void onResponse(Call<List<Project>> call, Response<List<Project>> response)
            {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Project>> call, Throwable t)
            {
                data.setValue(null);
            }
        });
        return data;
    }

    public LiveData<Project> getProjectDetails(String userId, String projectName)
    {
        final MutableLiveData<Project> data = new MutableLiveData<>();
        mApi.getProjectDetails(userId, projectName).enqueue(new Callback<Project>()
        {
            @Override
            public void onResponse(Call<Project> call, Response<Project> response)
            {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<Project> call, Throwable t)
            {
                data.setValue(null);
            }
        });
        return data;
    }

    private void simulateDelay()
    {
        try
        {
            Thread.sleep(10);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
