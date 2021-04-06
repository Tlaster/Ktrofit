package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class Part(
    val value: String = "",
    val encoding: String = "binary",
)