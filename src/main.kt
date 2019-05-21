import com.rsk.Person

fun main(args: Array<String>) {
    println("Hello, World!")

    val sam = Person("sam")

    sam.displayName()

    println("Name is ${sam.Name}")

    sam.Name = "Samantha"

    println("Name is ${sam.Name}")

    sam.displyWithLambda(::printName)
}

fun printName(name: String) {
    println(name)
}