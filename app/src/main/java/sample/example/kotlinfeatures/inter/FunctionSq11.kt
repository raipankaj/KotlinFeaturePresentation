package sample.example.kotlinfeatures.inter

class FunctionSq11 {

    fun simpleFunction() {
        print("Hello world!")
    }

    fun returnValueFunction(): String {
        print("Hey, how are you?")
        return "Message"
    }

    fun singleLineReturnExplicitTypeInfer(): String = "Message"

    fun singleLineReturnImplicitTypeInfer() = "Message"

    fun multiValueReturn(state: String, country: String): Pair<String, String> {
        return Pair(state, country)
    }

    fun destructuringFromFunction() {
        val (state, country) = multiValueReturn("Telangana", "India")
    }

}