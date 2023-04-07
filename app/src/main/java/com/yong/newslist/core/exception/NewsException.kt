package com.yong.newslist.core.exception

sealed class NewsException(
    errorMsg: String,
    cause: Throwable?
) : Exception(errorMsg, cause) {
    object NetworkException : NewsException("NetworkException", null)
    object UnknownException : NewsException("UnknownException", null)
}