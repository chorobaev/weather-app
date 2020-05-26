package io.aikosoft.weatherapp.base

interface OnErrorListener {
    fun onError(error: Throwable)
    fun setErrorMessage(msg: String)
    fun setErrorMessage(msgRes: Int)
}