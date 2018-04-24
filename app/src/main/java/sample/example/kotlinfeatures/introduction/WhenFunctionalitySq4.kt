package sample.example.kotlinfeatures.introduction

class WhenFunctionalitySq4 {

    /**
     * When with only one type, String
     */
    fun whenInPlaceOfSwitch() {
        val countryCode = "IN"

        when (countryCode) {
            "IN" -> print("India")
            "AU" -> print("Australia")
            "RU" -> print("Russia")
            "US" -> print("United States of America")
        }
    }

    /**
     * When with multiple type.
     * When works with condition check, ranges and equality check
     */
    fun whenWithSuperPower() {
        val obj: Any = 20

        when(obj) {
            in 0..100 -> print("It's integer in the range of 0 to 100, excluding 10-20")
            !in 10..20 -> print("It's not in 10 to 20")
            1000,2000 -> print("I found integer with value 1000 or 2000")
            is Int -> print("It's integer greater than 100")
            is String -> print("It's string")
            !is Double -> print("It's not a double")

        }
    }

    /**
     * When as an expression including else branch.
     */
    fun whenAsExpression() {
        var obj: Any = 10

        val result = when(obj) {
            is Int -> "Integer"
            is String -> "String"
            else -> "N/A"
        }
    }
}