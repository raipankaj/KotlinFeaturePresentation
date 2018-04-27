package sample.example.kotlinfeatures.inter

data class UserModel2(val place:String, val shop: String, val zipcode:Int)

data class User(val id: Int, val name: String)


fun accessUser() {
    val user = User(10,"Tom")
    val changedUser = user.copy(name = "Thomas")
}