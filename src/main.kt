import com.rsk.Person
import java.util.*

fun main(args: Array<String>) {
    println("Hello, World!")

//    val sam = Person("sam")
//
//    sam.displayName()
//
//    println("Name is ${sam.Name}")
//
//    sam.Name = "Samantha"
//
//    println("Name is ${sam.Name}")
//
//    sam.displyWithLambda(::printName)

    // ? means value can be either null or not null
    val q:Question? = Question()

    q?.Answer = "Four"

    q?.display()

    println("The answer to the question '${q?.Question}' is ${q?.Answer}")

    val message = if (q?.Answer == q?.CorrectAnswer) {
        "You were correct"
    } else {
        "Try again"
    }

    println(message)

    q?.printResult()

    val number:Int? = try {
        Integer.parseInt(q?.Answer)
    } catch(e:NumberFormatException) {
        null
    }

    println("Number is $number")

    for (i in 10 downTo 1 step 2) {
        print("$i, ")
    }

    println()

    for (i in 1 until 10) {
        print("$i, ")
    }

    println()

    var numbers = listOf(1,2,3,4,5)

    for (i in numbers) {
        print("$i, ")
    }

    println()

    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Sam"] = 24
    ages["Alex"] = 24
    ages["Harry"] = 26

    for ((name, age) in ages) {
        println("$name is $age")
    }

    for ((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }
}

//fun printName(name: String) {
//    println(name)
//}

class Question {
    // mutable
    var Answer:String = ""
    // immutable
    val Question:String = "What is the meaning of life?"
    val CorrectAnswer = "42"

    fun display() {
        println("You said $Answer")
    }

    fun printResult() {
        when (Answer) {
            CorrectAnswer -> println("You were correct")
            else -> println("Try again")
        }
    }
}