package com.xujiaji.learnmvvm.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.support.annotation.NonNull;

import com.xujiaji.learnmvvm.service.model.Project;
import com.xujiaji.learnmvvm.service.repository.Net;

import java.util.List;

import javax.inject.Inject;

/**
 * author: xujiaji
 * created on: 2018/6/11 22:11
 * description:
 */
public class ProjectListViewModel extends AndroidViewModel
{
    private final LiveData<List<Project>> projectListObservable;

    public final ObservableList<Project> items = new ObservableArrayList<>();

    @Inject
    public ProjectListViewModel(@NonNull Net net, @NonNull Application application)
    {
        super(application);
        projectListObservable = net.getProjectList("xujiaji");
    }

    public LiveData<List<Project>> getProjectListObservable()
    {
        return projectListObservable;
    }
}
