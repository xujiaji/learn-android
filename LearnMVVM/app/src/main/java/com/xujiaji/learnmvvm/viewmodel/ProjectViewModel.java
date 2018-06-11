package com.xujiaji.learnmvvm.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import com.xujiaji.learnmvvm.service.model.Project;
import com.xujiaji.learnmvvm.service.repository.NetRepository;

/**
 * author: xujiaji
 * created on: 2018/6/11 22:12
 * description:
 */
public class ProjectViewModel extends AndroidViewModel
{
    private final LiveData<Project> projectObservable;
    private final String projectID;

    public ObservableField<Project> project = new ObservableField<>();

    public ProjectViewModel(@NonNull Application application, final String projectID)
    {
        super(application);
        this.projectID = projectID;
        this.projectObservable = NetRepository.getInstance()
                .getProjectDetails("xujiaji", projectID);
    }


    public LiveData<Project> getProjectObservable()
    {
        return projectObservable;
    }

    public void setProject(Project project)
    {
        this.project.set(project);
    }

    /**
     * 创建ViewModel工厂类：用于将项目id注入ViewModel
     */
    public static class Factory extends ViewModelProvider.NewInstanceFactory
    {
        @NonNull
        private final Application application;
        private final String projectID;

        public Factory(@NonNull Application application, String projectID)
        {
            this.application = application;
            this.projectID = projectID;
        }

        @NonNull
        @Override
        public <T extends ViewModel> T create(@NonNull Class<T> modelClass)
        {
            //noinspection unchecked
            return (T) new ProjectViewModel(application, projectID);
        }
    }
}
