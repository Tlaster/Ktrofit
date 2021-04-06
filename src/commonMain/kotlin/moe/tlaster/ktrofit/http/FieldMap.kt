package moe.tlaster.ktrofit.http

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class FieldMap(
    val encoded: Boolean = false,
)