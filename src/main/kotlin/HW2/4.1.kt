package HW2


//fun main(){
//    var a = readLine()!!.toInt()
//    var b = readLine()!!.toInt()
//    var c: Int
//    println("a=$a ,b=$b")
//    c = a
//    a = b
//    b = c
//    println("a=$a ,b=$b")
//}

fun main(){
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    println("a=$a ,b=$b")
    a = a + b
    b = a - b
    a = a - b
    println("a=$a ,b=$b")
}