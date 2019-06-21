import sun.security.util.Password

class data : Login() {


}

fun main(args: Array<String>) {
    var Stephanie = Login()

    println("Enter your username: ")

    val fName = readLine()

    println("Enter your password: ")

    val Password = readLine()

    if (fName == "Steph" && Password == "123") {

        println("Login Successful")
    }else{
        println("Invalid username and password")
    }
}