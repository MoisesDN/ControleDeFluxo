//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

// BREAK
//    var i = 0
//    while (i < 10000000000) {
//        if (i == 50) {
//            break
//        }
//         print("$i ")
//
//        i++
//    }

//    CONTINUE
    var i = 0
    while (i < 80) {
        if (i < 50) {
            i++
            continue
        }
        print("$i ")

        i++
    }

}