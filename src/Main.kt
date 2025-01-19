//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var i = 1
    while (i <= 50) {
        print("$i ")
        i++
    }

    println()
    println("For")
    for (n in 1 .. 50) {
        print("$n ")
    }
    println()
    println("Segundo teste")
    var j = 50
    while (j >= 1) {
        print("$j ")
        j--
    }

    println()
    println("For")
    for (i in 50 downTo 1) {
        print("$i ")
    }

    println()
    println("Divisao por 5")
    for (n in 1 .. 50) {
        if (n % 5 == 0) {
            continue
        }
        print("$n ")
    }

    println()
    println("Soma")
    var soma = 0;
    for (i in 1 .. 500) {
        soma += i
    }
    print("$soma ")

    println()
    ex5(5)

}

fun ex5(n: Int) {
    for(i in 1..n) {
        for (j in 1..i){
            print("#")
        }
        println()
    }
}