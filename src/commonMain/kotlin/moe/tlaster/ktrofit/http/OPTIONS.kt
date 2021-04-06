package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.FUNCTION)
annotation class OPTIONS(
    val path: String = "",
)