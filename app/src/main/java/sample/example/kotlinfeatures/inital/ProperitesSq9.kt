package sample.example.kotlinfeatures.inital

class ProperitesSq9 {

    class User {
        var firstName: String = ""
        var lastName: String = ""

        var fullName: String = ""
            get() = "$firstName $lastName"
            private set
    }

    fun accessUserModel() {
        val user = User()
        user.firstName = "First Name"
        user.lastName = "Last Name"

        print(user.fullName)
    }

    data class MyUser(val firstName: String, val lastName: String) {
        val isFullNameAvailable: Boolean
            get() = (firstName.isNotEmpty()) and (lastName.isNotEmpty())
    }

    fun accessDataModelUser() {
        val user = MyUser("First", "Last")
        print(user.isFullNameAvailable)
    }


    class Students {
        var firstName: String = ""
            set(value) {
                field = value.capitalize()
            }

        var lastName: String = ""
            set(value) {
                field = value.capitalize()
            }

        var age: Any = ""
            set(value) {
                field = if (value.equals(60)) value else "You are not a senior citizen"
            }

        val fullName: String
            get() = "$firstName $lastName"
    }

    fun accessCustomSetters() {
        val user = Students()
        user.firstName = "pankaj"
        user.lastName = "rai"


        print(user.fullName)
    }
}