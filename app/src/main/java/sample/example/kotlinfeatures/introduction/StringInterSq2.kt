package sample.example.kotlinfeatures.introduction

class StringInterSq2 {

    /**
     * String interpolation
     */
    fun playWithString() {
        val longMultiLineText = """ Hey
            | this
            | looks
            | so
            | cool
        """.trimMargin()
    }

    /**
     * String template
     */
    fun addString() {
        val kotlinVersion = 1.2

        val kotlinInfo = "The current version of kotlin is ${kotlinVersion}"
    }

    fun powerOfAlso() {
        val message = "Hello, how are you?".also(::print)
    }
}