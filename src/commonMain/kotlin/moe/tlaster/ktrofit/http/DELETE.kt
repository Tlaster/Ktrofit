package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.FUNCTION)
annotation class DELETE(
    val path: String = "",
)