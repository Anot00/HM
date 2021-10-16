package HW1

fun main() {
    println("введите 1 и 2 число")
    var num1 = readLine()!!.toInt()// !! – утверждение "это не null"
    var num2 = readLine()!!.toInt()
    var sum = num1+num2
    println("ответ a+b=$sum")
    println("введите 1 и 2 число")
    var num3 = readLine()!!.toInt()
    var num4 = readLine()!!.toInt()
    var sum2 = num3-num4
    println("ответ a-b=$sum2")
}


//fun main() { // ?. – оператор безопасного вызова
//    val b: String = "World"
//    val c: String? = null
//
//    val bL: Int = b.length
//    val cL: Int? = c?.length
//
//    println(bL) // 5
//    println(cL) // null
//}

//fun main() { // ?: – оператор "элвис"
//    val b: String? = readLine()
//    val c: String = b ?: "" //И возвращает значение справа от себя, если то, что слева, – null.
//    println(c.length)
//
//    val a: String = readLine() ?: ""
//    println(a.length)
//
//}
