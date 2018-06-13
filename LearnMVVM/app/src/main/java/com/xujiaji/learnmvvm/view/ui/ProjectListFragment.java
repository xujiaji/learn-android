package com.xujiaji.learnmvvm.view.ui;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
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
import com.xujiaji.learnmvvm.di.Injectable;
import com.xujiaji.learnmvvm.service.model.Project;
import com.xujiaji.learnmvvm.view.adapter.ProjectAdapter;
import com.xujiaji.learnmvvm.callback.ProjectClickCallback;
import com.xujiaji.learnmvvm.viewmodel.ProjectListViewModel;

import java.util.List;

import javax.inject.Inject;

/**
 * author: xujiaji
 * created on: 2018/6/11 22:30
 * description:
 */
public class ProjectListFragment extends Fragment implements Injectable
{
    public static final String TAG = "ProjectListFragment";
    private ProjectAdapter projectAdapter;
    private FragmentProjectListBinding binding;

    @Inject
    ViewModelProvider.Factory viewModelFactory;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_project_list, container, false);
        projectAdapter = new ProjectAdapter(projectClickCallback);
        binding.projectList.setAdapter(projectAdapter);
        binding.setIsLoading(true);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        final ProjectListViewModel viewModel =
                ViewModelProviders.of(this, viewModelFactory).get(ProjectListViewModel.class);
        observeViewModel(viewModel);
    }

    private void observeViewModel(ProjectListViewModel viewModel)
    {
        viewModel.getProjectListObservable().observe(this, projects ->
        {
            if (projects != null)
            {
                binding.setIsLoading(false);
                projectAdapter.setProjectList(projects);
            }
        });
    }

    private final ProjectClickCallback projectClickCallback = project ->
    {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) && getActivity() instanceof MainActivity)
        {
            ((MainActivity) getActivity()).show(project);
        }
    };
}
