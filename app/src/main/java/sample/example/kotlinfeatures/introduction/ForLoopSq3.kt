package sample.example.kotlinfeatures.introduction

class ForLoopSq3 {

    /**
     * For loop with ranges where two dots
     */
    fun forLoopWithRanges() {
        for (counter in 0..100) {
            print(counter)
        }
    }

    /**
     * For loop in decreasing order from 100 to 1 as downTo is 1
     */
    fun forLoopWithDecrement() {
        for (counter in 100 downTo 0) {
            print(counter)
        }
    }

    /**
     * For loop in decreasing order from 100 to 0 in steps 2 eg: 100,98,96,94....0
     */
    fun forLoopWithIncrement() {
        for (counter in 100 downTo 0 step 2) {

        }
    }

    /**
     * For loop with array index
     */
    fun forWithArrayIndices() {
        val array = Array(10){0}

        for (i in array.indices) {
            println(array[i])
        }
    }

    /**
     *  For loop with index and value based on position
     */
    fun forWithValueAndIndices() {
        val array = Array(10){0}

        for ((index, value) in array.withIndex()) {
            println("the element at $index is $value")
        }
    }

    /**
     * For loop with collection
     */
    fun forWithCollections() {
        //Mutable list of integer
        val list = listOf(1,2,3,4,5,6,7,8,9,10)

        //Print the items of a list
        for (item in list) {
            print(item)
        }

        //Print item based and its index
        for ((item, index) in list.withIndex()) {
            print("${item} and ${index}")
        }

        // Run for loop from 0 till list size - 1
        for (counter in 0 until list.size) {
            print(counter)
        }
    }

    /**
     * For with map
     */
    fun forWithMap() {
        var map = hashMapOf<String, Int>()
        map["one"] = 1
        map["two"] = 2

        //Print the key value pair of map
        for ((key, value) in map) {
            println("key = $key, value = $value")
        }
    }

    fun checkForValue() {
        val wordArray = arrayOf("Hey", "Hello", "How")

        if ("Hello" !in wordArray) {
            print("Hello found in word array")
        } else {
            print("Hello not found in word array")
        }
    }
}