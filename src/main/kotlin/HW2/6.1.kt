package HW2

import kotlin.math.sqrt

fun main(){
    println("Введите параметры окружности")
    val x = readLine()!!.toDouble()
    val y = readLine()!!.toDouble()
    val r = readLine()!!.toDouble()
    val h = sqrt(x*x + y*y)
    when{
        h>r -> println("точка за пределами окружности")
        h<r -> println("точка принадлежит окружности")
    }
}
