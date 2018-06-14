package com.xujiaji.learnmvvm.view.ui;

import android.os.Bundle;
import android.util.Log;

import com.xujiaji.learnmvvm.R;
import com.xujiaji.learnmvvm.base.BaseViewModelActivity;
import com.xujiaji.learnmvvm.service.model.Project;
import com.xujiaji.learnmvvm.util.ActivityUtils;
import com.xujiaji.learnmvvm.util.FragmentUtils;
import com.xujiaji.learnmvvm.viewmodel.ProjectListViewModel;

import static com.xujiaji.learnmvvm.view.ui.ProjectFragment.KEY_PROJECT_ID;


public class MainActivity extends BaseViewModelActivity<ProjectListViewModel>
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null)
        {
            ActivityUtils.addFragmentInActivity(
                    getSupportFragmentManager(),
                    FragmentUtils.create(ProjectListFragment.class),
                    R.id.fragment_container,
                    ProjectListFragment.class.getSimpleName());

        }
    }


    public void show(Project project)
    {
        ActivityUtils.replaceFragmentInActivity(
                getSupportFragmentManager(),
                FragmentUtils.create(ProjectFragment.class, new String[]{KEY_PROJECT_ID}, new String[]{project.name}),
                R.id.fragment_container,
                null,
                "project");
    }

    @Override
    protected void onObserveViewModel(ProjectListViewModel viewModel)
    {
        Log.e("ViewModel", "MainActivity viewModel:" + viewModel.hashCode());
    }
}
