package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.FUNCTION)
annotation class HEAD(
    val path: String = "",
)