package sample.example.kotlinfeatures.introduction

class NullSafetySq6 {

    var name: String = ""
    var age: Int? = null

    fun operationOnNullableObject() {
        print(age?.inc())
        print(name.length)
    }

    fun nullHandlingWithExtensionFunction() {
        age?.let {
            it.div(10)
            it.plus(10)
        }
    }

    /**
     * Null handling does not work with if condition when an object is mutable
     */
    fun cautionWithNullHandling() {

        //Smart cast not possible because value may change at runtime before inside if condition execute
        if (age != null) {
            print(age?.plus(10))
        }


        age?.let {
            print(it.plus(10))
        }
    }
}