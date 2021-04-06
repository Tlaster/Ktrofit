package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class Query(
    val value: String,
    val encoded: Boolean = false,
)