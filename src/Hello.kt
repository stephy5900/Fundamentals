    fun main(args: Array<String>){

        println("Hello World!")

            //immutable or unchangeable variable
        val a: Int = 200
        val c = 12.22f

            //mutable or changeable variable
        var d: Double = 12.2222
        var name= "Steph"
        var names = arrayOf("Abigail","Efus","Nancy","James")

        println(names[2])
        println(name[0])
        println("Sum: " + (a+c))


            //string interpolation($):
            println("The value of a is: $a")

            //to perform arithmetic calculations using string interpolation, put the vafrables in curly braces
            println("Sum of a + d = ${a+d}")

            //char or characters are surrounded by single digits

            //casting is done in the following
            //casting double to int

            val r = 12.2222
            println("Casting from double to integer: " + r.toInt())

            //Casting from float to double
            val s = 34.1234f
            println("Float to double: $s = " + s.toDouble() )

            //Casting from int to string

            var t = 123
            println("Int to String: $t = " + "${t.toString()}")

            //Casting from String to Int is not possible the commented code below shows that
//            var u = "Stephy"
//            println("String to Int: $u = " + u.toInt())


            //Char to Int

            var u = 'S'
            println("Char to Int: $u = " + u.toInt())


            //Int to char conversion also works

            //Strings
            //String lenght = varName.length
            //Comparing Strings str1.equals(str2) Alterantively, you can do A.compareTo()b

            //to get a substring
            var fullName = "Nii Lante Bannerman"
            println("Obtaining a substring : " +  fullName.subSequence(0,9))

            //To check if it contains a random number
            println("Checking for a random string  " +fullName.contains("ante"))


            //Arrays
            //Creating Arrays
            var myArray = arrayOf(1,2,3,4,5)
            //Arrays can contain mutliple data types
            var array2 = arrayOf("Steph", 10, "May", 59.00)

            //Accessing elements of an array
            println(myArray[4])
            //Changing elements in an array
            array2[1] = "Afia"
            //finding the number of elements in an array use .size innstead of .length for strings
            var aLength = array2.size
            println(aLength)

            //to get array elements as another array, use whats stated below
            var partArray = myArray.copyOfRange(1,4)
            //print(partArray)


            //Letting the ide creare an array of square numbers
            var squares= Array(5, { x -> x*x})

            println(squares[2])

            //type specific arrays, below are a few examples
            var num: Array<Int>
            var fname: Array<String>

            //Creating ranges
            val one2ten = 1..10
            val atof = "a".."f"

        //functions
        //single line functions
        fun add(num1: Int, num2: Int ) : Int = num1 + num2

        //single line finction without the return data type
        fun singleLine (num1: Int, num2: Double ) = num1 * num2

        //Use UNIT if the function does not have a return type
        fun Hello(Name: String) : Unit = println("Hello $Name")

        //function to receive a number and return the next 2 in line
        //Pair is used to rerurn two values of the same or different data types. It's an inbuilt function in Kotlin
        fun nextTwo(num: Int) : Pair<Int, Int> {
            return Pair(num+1,num+2)
        }

        //to pass a variable number of parameters in the function, use varargs and give it a name.
        fun multipleParams(vararg names: String) {


        }

        //higher order function is a function that either accepts or rejects another function


        //Collection Operators


        //try and catch exceptions in kotlin
        val divisor = 2
        try {
            if(divisor == 0){
                throw IllegalArgumentException("Can't divide by 0")

            }else{
                println("The division is possible")
            }
        }catch (e: java.lang.IllegalArgumentException){
            println(e.message)
        }



        //Creating lists
        //Mutable lists
        var mutable: MutableList<Int> = mutableListOf(1,2,3,4,5)
        var mutable2 = mutableListOf<String>("Steph", "Kofi", "Afia")

        //immutable lists
        val immutable: List<Int> = listOf(1,2,3,4,5)
        val immutable2 = listOf<Int>(9,8,7)


    }

    //primary constructor in kotlin is used to initialize the class
    class Person(val firstName: String, var age: Int) {

        //secondary constructor
        //constructor(name1: String) : this(name1) {
        //}
    }


