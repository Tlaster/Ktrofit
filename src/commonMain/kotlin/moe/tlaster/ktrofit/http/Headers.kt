package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.FUNCTION)
annotation class Headers(
    val value: Array<String>,
)