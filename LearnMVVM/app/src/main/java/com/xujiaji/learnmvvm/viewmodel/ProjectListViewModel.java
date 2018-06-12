package com.xujiaji.learnmvvm.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.xujiaji.learnmvvm.service.model.Project;
import com.xujiaji.learnmvvm.service.repository.NetRepository;

import java.util.List;

/**
 * author: xujiaji
 * created on: 2018/6/11 22:11
 * description:
 */
public class ProjectListViewModel extends AndroidViewModel
{
    private final LiveData<List<Project>> projectListObservable;

    public ProjectListViewModel(@NonNull Application application)
    {
        super(application);
        projectListObservable = NetRepository.getInstance()
                .getProjectList("xujiaji");
    }

    public LiveData<List<Project>> getProjectListObservable()
    {
        return projectListObservable;
    }
}
