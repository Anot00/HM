fun main() {
    var sum = 0
    //for rectangle
    for (row in 0 until 8) {
        if (row % 2 == 0) {
            println("* * * * *")
            continue
        }
    }
    println()

    for (row in 0 until 8) {
        for (column in row downTo 0) {
            print("* ")
        }
        println()
    }


}