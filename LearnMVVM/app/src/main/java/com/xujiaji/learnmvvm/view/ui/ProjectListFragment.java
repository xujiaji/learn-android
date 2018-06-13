package com.xujiaji.learnmvvm.view.ui;

import android.arch.lifecycle.Lifecycle;

import com.xujiaji.learnmvvm.base.BaseFragment;
import com.xujiaji.learnmvvm.callback.ProjectClickCallback;
import com.xujiaji.learnmvvm.databinding.FragmentProjectListBinding;
import com.xujiaji.learnmvvm.view.adapter.ProjectAdapter;
import com.xujiaji.learnmvvm.viewmodel.ProjectListViewModel;

/**
 * author: xujiaji
 * created on: 2018/6/11 22:30
 * description:
 */
public class ProjectListFragment extends BaseFragment<FragmentProjectListBinding, ProjectListViewModel>
{
    @Override
    protected void onBinding(FragmentProjectListBinding binding)
    {
        binding.projectList.setAdapter(new ProjectAdapter(projectClickCallback));
        binding.setIsLoading(true);
    }

    @Override
    protected void onObserveViewModel(ProjectListViewModel viewModel)
    {
        binding.setProjectListViewModel(viewModel);
        viewModel.getProjectListObservable().observe(this, projects ->
        {
            if (projects != null)
            {
                binding.setIsLoading(false);
                viewModel.items.clear();
                viewModel.items.addAll(projects);
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
