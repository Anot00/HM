package HW3

fun main(){
    var number = readLine()!!.toInt()
    val numberOtvet = number
    var count: Int
    if(number == 0)
        count = 1
    else
        count = 0
    while (number != 0){
        count++
        number /= 10
    }
    println("число $numberOtvet содержит $count цифр(у,ы)")
}