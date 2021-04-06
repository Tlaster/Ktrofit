package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.FUNCTION)
annotation class GET(
    val path: String = "",
)
