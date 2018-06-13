package com.xujiaji.learnmvvm.view.ui;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xujiaji.learnmvvm.R;
import com.xujiaji.learnmvvm.service.model.Project;
import com.xujiaji.learnmvvm.util.ActivityUtils;
import com.xujiaji.learnmvvm.util.FragmentUtils;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

import static com.xujiaji.learnmvvm.view.ui.ProjectFragment.KEY_PROJECT_ID;


public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector
{

    @Inject
    DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector;

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
    public AndroidInjector<Fragment> supportFragmentInjector()
    {
        return dispatchingAndroidInjector;
    }
}
