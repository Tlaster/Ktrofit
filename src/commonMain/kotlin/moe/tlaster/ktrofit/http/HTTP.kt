package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.FUNCTION)
annotation class HTTP(
    val path: String = "",
    val hasBody: Boolean = false,
)