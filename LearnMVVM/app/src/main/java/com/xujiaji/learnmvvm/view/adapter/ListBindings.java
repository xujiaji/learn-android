package com.xujiaji.learnmvvm.view.adapter;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.xujiaji.learnmvvm.service.model.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * author: xujiaji
 * created on: 2018/6/13 16:21
 * description:
 */
public class ListBindings
{
    @BindingAdapter("app:items")
    public static void setItems(RecyclerView recyclerView, List<Project> items)
    {
        ProjectAdapter adapter = (ProjectAdapter) recyclerView.getAdapter();
        if (adapter != null)
        {
            Log.e("ListBindings", "items = " + items);
            if (items == null)
                items = new ArrayList<>();
            adapter.setProjectList(items);
        }
    }
}

