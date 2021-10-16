package HW2

fun main(){
    println("ax2 + bx + c = 0")
    println("введите a, b и с")
    //val (a, b, c) = readLine()!!.split(' ').map(String::toDouble)
    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()
    var c = readLine()!!.toDouble()
    var D: Double = b * b - 4 * a - c
    if(D > 0){
        var x1: Double = (-b - Math.sqrt(D))/ (2*a)
        var x2: Double = (-b + Math.sqrt(D))/ (2*a)
        println("Корни уравнения x1 = $x1, x2 = $x2")
    } else if(D==0.0){
        var x: Double = -b / (2 * a)
        println("Уравнение имеет один корень х = $x")
    } else{
        println("Уравнение не имеет корней!")
    }
}