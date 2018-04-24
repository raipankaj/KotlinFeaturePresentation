package sample.example.kotlinfeatures.inital

class DataTypes {

    /**
     * Set of most commonly used data type.
     * All the data types are object in kotlin
     */
    fun listOfDataTypes() {
        val name: String
        val age: Int
        val mobileNumber: Any
        val Address: String?
    }

    /**
     * Type can be inferred by the type of data assigned to the variable.
     * Unlike java here type declaration of variable is optional
     */
    fun typeInference() {
        val name = "Srikanth" // Type of name is string
        val age = 10 // Type of age is integer
    }

    /**
     * Two ways of specifier
     */
    fun specifiers() {

        // variable defined with var are immutable
        var name = "Srikanth"
        name = "Jack"

        // variable defined with val are mutable
        val age = 10
//        age = 10
    }
}