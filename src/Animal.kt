 open class Animal{

     //creating parameters
     var legs: Int = 4
     var eyes: Int = 2
     var head: Int = 1


}

fun main(args: Array<String>){

    //creating objects in kotlin
    val object1 = Animal() //creating an intance of a class or an object of that class

    println(object1.legs)

}

 //inheritance in kotlin uses : , the example is shown below
 class Dog: Animal() {

     //overiding a method, rewrite the class but start witb the keyword overide



 }

 //interfaces in Kotlin

 interface firstInterface{

     var myvar: String //abstract attribute

     fun absMethod() //abstract method
 }

 class interface2 : firstInterface {

     override var myvar: String = "Names"
     override fun absMethod() {"Easy to understand " }


 }

 //kotlin allows the implementation of two or more interfaces ie interfaceName: A,B