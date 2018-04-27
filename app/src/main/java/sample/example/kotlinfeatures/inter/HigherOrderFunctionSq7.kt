package sample.example.kotlinfeatures.inter

/**
 * An higher order function which accepts any function as a parameter
 */
fun higherOrderExample1(func: () -> Unit) {
    func()
}

/**
 * An higher order function which accepts one parameter and function
 */
fun higherOrderExample2(param: String, funcName: () -> Unit) {

}

inline fun higherOrderExample3(value: Int, crossinline func: Int.() -> String) {
    value.func().plus("It's an example").also(::print)
}
