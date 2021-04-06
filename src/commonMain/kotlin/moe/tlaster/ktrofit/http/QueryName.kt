package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class QueryName(
    val encoded: Boolean = false,
)