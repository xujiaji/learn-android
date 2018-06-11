package com.xujiaji.learnmvvm.view.ui;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xujiaji.learnmvvm.R;
import com.xujiaji.learnmvvm.databinding.FragmentProjectListBinding;
import com.xujiaji.learnmvvm.service.model.Project;
import com.xujiaji.learnmvvm.viewmodel.ProjectListViewModel;

import java.util.List;

/**
 * author: xujiaji
 * created on: 2018/6/11 22:30
 * description:
 */
public class ProjectListFragment extends Fragment
{
    public static final String TAG = "ProjectListFragment";
    private FragmentProjectListBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_project_list, container, false);
        binding.setIsLoading(true);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        final ProjectListViewModel viewModel =
                ViewModelProviders.of(this).get(ProjectListViewModel.class);
        observeViewModel(viewModel);
    }

    private void observeViewModel(ProjectListViewModel viewModel)
    {
        viewModel.getProjectListObservable().observe(this, new Observer<List<Project>>()
        {
            @Override
            public void onChanged(@Nullable List<Project> projects)
            {
                if (projects != null)
                {
                    binding.setIsLoading(false);
                }
            }
        });
    }
}
