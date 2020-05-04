package com.orangedusk.mytemplate.common.vo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static com.orangedusk.mytemplate.common.vo.Status.ERROR;
import static com.orangedusk.mytemplate.common.vo.Status.LOADING;
import static com.orangedusk.mytemplate.common.vo.Status.SUCCESS;

public class Resource<T> {
    @NonNull
    public final Status status;

    @Nullable
    public final String message;

    @Nullable
    public final T data;

    public Resource(@NonNull Status status, @Nullable String message, @Nullable T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static <T> Resource<T> success(@Nullable T data){
        return new Resource<>(SUCCESS,null,data);
    }

    public static <T> Resource<T> loading(@Nullable T data){
        return new Resource<>(LOADING,null,data);
    }

    public static <T> Resource<T> error(String msg, @Nullable T data){
        return new Resource<>(ERROR,msg,data);
    }


}
