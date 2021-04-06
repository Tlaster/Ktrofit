package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class Path(
    val value: String,
    val encoded: Boolean = false,
)