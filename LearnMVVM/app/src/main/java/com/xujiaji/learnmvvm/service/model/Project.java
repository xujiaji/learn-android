package com.xujiaji.learnmvvm.service.model;

import java.util.Date;

/**
 * author: xujiaji
 * created on: 2018/6/11 21:49
 * description:
 */
public class Project
{
    public long id;
    public String name;
    public String description;
    public Date created_at;
    public Date updated_at;
    public String git_url;
    public String clone_url;
    public int open_issues;
    public int watchers;
}
