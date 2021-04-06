package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.FUNCTION)
annotation class POST(
    val path: String = "",
)