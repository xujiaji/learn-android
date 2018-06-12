package com.xujiaji.learnmvvm.di;

import android.arch.lifecycle.ViewModelProvider;

import com.xujiaji.learnmvvm.service.repository.Api;
import com.xujiaji.learnmvvm.service.repository.NetRepository;
import com.xujiaji.learnmvvm.viewmodel.ProjectViewModelFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author: xujiaji
 * created on: 2018/6/12 11:51
 * description:
 */
@Module(subcomponents = ViewModelSubComponent.class)
public class AppModule
{
    @Singleton
    @Provides
    Api provideApi()
    {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        return new Retrofit.Builder()
                .baseUrl(Api.URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Api.class);
    }

    @Singleton
    @Provides
    ViewModelProvider.Factory provideViewModelFactory(ViewModelSubComponent.Builder viewModelSubComponent)
    {
        return new ProjectViewModelFactory(viewModelSubComponent.build());
    }
}
