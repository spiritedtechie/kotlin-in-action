fun translate(obj: Any): String = when (obj) {
    1 -> "One"
    "two" -> "Two"
    is Number -> "A number"
    else -> "Unknown"
}

println(translate(1))
println(translate("two"))
println(translate(3))
println(translate("abc"))