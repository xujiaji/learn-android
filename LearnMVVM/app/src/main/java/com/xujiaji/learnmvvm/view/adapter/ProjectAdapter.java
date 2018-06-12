package com.xujiaji.learnmvvm.view.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.xujiaji.learnmvvm.R;
import com.xujiaji.learnmvvm.databinding.ProjectListItemBinding;
import com.xujiaji.learnmvvm.service.model.Project;
import com.xujiaji.learnmvvm.util.Utils;
import com.xujiaji.learnmvvm.view.callback.ProjectClickCallback;

import java.util.List;

/**
 * author: xujiaji
 * created on: 2018/6/12 10:06
 * description:
 */
public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>
{
    private List<Project> projectList;

    @Nullable
    private final ProjectClickCallback projectClickCallback;

    public ProjectAdapter(@Nullable ProjectClickCallback projectClickCallback)
    {
        this.projectClickCallback = projectClickCallback;
    }

    public void setProjectList(final List<Project> projectList)
    {
        if (this.projectList == null)
        {
            this.projectList = projectList;
            notifyItemRangeInserted(0, projectList.size());
        } else
        {
            DiffUtil.DiffResult result = DiffUtil.calculateDiff(new DiffUtil.Callback()
            {
                @Override
                public int getOldListSize()
                {
                    return ProjectAdapter.this.projectList.size();
                }

                @Override
                public int getNewListSize()
                {
                    return projectList.size();
                }

                @Override
                public boolean areItemsTheSame(int oldItemPosition, int newItemPosition)
                {
                    return ProjectAdapter.this.projectList.get(oldItemPosition).id ==
                            projectList.get(newItemPosition).id;
                }

                @Override
                public boolean areContentsTheSame(int oldItemPosition, int newItemPosition)
                {
                    Project project = projectList.get(newItemPosition);
                    Project old = ProjectAdapter.this.projectList.get(oldItemPosition);
                    return project.id == old.id
                            && Utils.equals(project.git_url, old.git_url);
                }
            });
            this.projectList = projectList;
            result.dispatchUpdatesTo(this);
        }
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        ProjectListItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.project_list_item,
                parent,
                false);
        binding.setCallback(projectClickCallback);
        return new ProjectViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position)
    {
        holder.binding.setProject(projectList.get(position));
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount()
    {
        return projectList == null ? 0 : projectList.size();
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder
    {
        final ProjectListItemBinding binding;
        public ProjectViewHolder(ProjectListItemBinding binding)
        {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
