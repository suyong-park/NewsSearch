package com.yong.newslist.common.base

import androidx.lifecycle.ViewModel
import com.yong.newslist.core.exception.NewsException
import retrofit2.HttpException

abstract class BaseViewModel : ViewModel() {

    protected fun showToast(msg: String) {

    }

    protected fun Throwable.toNewsException() {
        when (this) {
            is HttpException -> NewsException.NetworkException
            else -> NewsException.UnknownException
        }
    }
}