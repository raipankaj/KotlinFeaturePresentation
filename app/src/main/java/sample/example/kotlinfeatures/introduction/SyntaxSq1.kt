package sample.example.kotlinfeatures.introduction

//Variable
val age = 20 // Immutable object
var name = "Jack" // Mutable object

//Function
fun myFunction() {
    print("Hello world!")
}

// Function with single return statement
fun addToNumber(num1: Int, num2: Int) = num1 + num2

//Function with multi value return
fun getPersonInformation(): Pair<Int, String> = Pair(age, name)

fun appendNameAndAge() {
    val details = getPersonInformation()
    details.first // returns age of person
    details.second // returns name of person

    //Or

    val (age, name) = getPersonInformation()
    age //returns age of person
    name //returns name of person
}


//Class
open class Person(val address:String) {
    open var name: String = ""
    open var age: Int = 0
}

class Child(string: String) : Person(string) {
    override var name: String = ""
    override var age: Int = 0
}

class Employee private constructor() {
    val name: String = ""
    var age: Int = 0
}

class Persons {

    constructor(name:String):super() {

    }
}


