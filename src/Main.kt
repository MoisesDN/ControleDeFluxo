//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    While
//    val s = "Kotlin"
//    var i = 100
//
//    while (i > 0) {
//        println(i)
//
//        i--
//    }

//    Do While
//    var i = 0
//    do {
//
//        print("$i ")
//
//        i++
//    } while (i < 10)

    do {
        print("Qual seu nome: ")

        val value = readlnOrNull()
    } while (value == "")
}