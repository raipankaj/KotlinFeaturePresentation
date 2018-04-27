package sample.example.kotlinfeatures.inter

class MethodArgumentSq12 {

    fun namedArgument(state: String, country: String) {
        print("$state and $country")
    }

    fun accessNamedArgumentMethod() {
        namedArgument(state = "Telangana", country = "India")
        namedArgument(country = "IN", state = "TL")
    }

    fun defaultArgument(state: String = "Telangana", country: String = "India") {
        print("$state and $country")
    }

    fun accessDefaultArgument() {
        defaultArgument()
        defaultArgument("Andhra Pradesh")
        defaultArgument("Andhra Pradesh", "India")
    }
}