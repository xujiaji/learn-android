package com.xujiaji.learnmvvm.view.binding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

import com.xujiaji.learnmvvm.service.model.Project;
import com.xujiaji.learnmvvm.view.adapter.ProjectAdapter;

import java.util.List;

/**
 * author: xujiaji
 * created on: 2018/6/13 16:21
 * description:
 */
public class ProjectListBindings
{
    @BindingAdapter("app:items")
    public static void setItems(RecyclerView recyclerView, List<Project> items)
    {
        ProjectAdapter adapter = (ProjectAdapter) recyclerView.getAdapter();
        if (adapter != null)
        {
            adapter.setProjectList(items);
        }
    }
}

