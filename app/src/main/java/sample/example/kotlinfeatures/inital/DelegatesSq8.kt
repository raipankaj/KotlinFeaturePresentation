package sample.example.kotlinfeatures.inital

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class DelegatesSq8 {

    // Only last line is return rest all are just executed.
    val name by lazy {
        print("Name value is initialized")
        "James"
    }

    val age by lazy {
        20
    }

    //Delegate with map
    class Person(map: Map<String, Any>) {
        val name: String by map
        val age: Int by map
    }

    fun accessPerson() {
        val person = Person(mapOf(
                "name" to "James",
                "age" to 10
        ))

        print(person.name)
        print(person.age)
    }

    //Delegate with observable
    var nameObserver: String by Delegates.observable("null"){
        property, oldValue, newValue ->  print("${oldValue} and ${newValue}")
    }

    var nameVetoableObserver: String by Delegates.vetoable("null") {
        property, oldValue, newValue -> newValue.length > oldValue.length
    }

    //Custom delegates
    class Delegate(var value: String) {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
            return "$${value}"
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
            this.value = value
        }
    }

    fun accessCustomDelegate() {
        var obj: String by Delegate("0")
        obj = "100"
        print(obj)
    }

    //Generic delegate
    class GenericDelegate<T: Any>(var value: T) {
        operator fun getValue(thisRef: Any?, property: KProperty<*>) = "$${value}"

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
            this.value = value
        }
    }

    fun accessCustomGenericDelegate() {
        var obj: String by GenericDelegate("10")
        obj = "100"
        print(obj)
    }

}