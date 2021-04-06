package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.FUNCTION)
annotation class PATCH(
    val path: String = "",
)