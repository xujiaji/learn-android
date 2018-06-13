package com.xujiaji.learnmvvm.util;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import static dagger.internal.Preconditions.checkNotNull;

/**
 * Activity 工具类
 */
public class ActivityUtils
{

    public static void replaceFragmentInActivity(@NonNull FragmentManager fragmentManager,
                                                 @NonNull Fragment fragment,
                                                 int frameId) {
        replaceFragmentInActivity(fragmentManager, fragment, frameId, null, null);
    }

    /**
     * 用replace向Activity中添加Fragment
     * @param fragmentManager FragmentManger
     * @param fragment Fragment
     * @param frameId 添加到View容器的id
     * @param tag fragment tag
     * @param toBackStackStr 添加到返回堆栈
     */
    public static void replaceFragmentInActivity(@NonNull FragmentManager fragmentManager,
                                                 @NonNull Fragment fragment,
                                                 int frameId,
                                                 String tag,
                                                 String toBackStackStr) {
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (TextUtils.isEmpty(tag))
        {
            transaction.replace(frameId, fragment);
        } else
        {
            transaction.replace(frameId, fragment, tag);
        }

        if (!TextUtils.isEmpty(toBackStackStr))
        {
            transaction.addToBackStack(toBackStackStr);
        }
        transaction.commit();

    }

    /**
     * 用add将Fragment添加到Activity
     * @param fragmentManager FragmentManger
     * @param fragment Fragment
     * @param frameId 添加到View容器的id
     * @param tag fragment tag
     */
    public static void addFragmentInActivity(@NonNull FragmentManager fragmentManager,
                                                 @NonNull Fragment fragment, int frameId, String tag) {
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment, tag);
        transaction.commit();
    }

}
