import com.rsk.Person

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

    val q = Question()

    q.Answer = "42"

    q.display()

    println("The answer to the question '${q.Question}' is ${q.Answer}")

    val message = if (q.Answer == q.CorrectAnswer) {
        "You were correct"
    } else {
        "Try again"
    }

    println(message)
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
}