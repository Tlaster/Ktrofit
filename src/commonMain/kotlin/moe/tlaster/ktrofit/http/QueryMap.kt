package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class QueryMap(
    val encoded: Boolean = false,
)