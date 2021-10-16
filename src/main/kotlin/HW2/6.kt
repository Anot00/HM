package HW2

fun main(){
    val num = readLine()!!.toInt()
    var str: String = " "
    when(num){
        1,3,5,7,8,10,12 -> str="31"
        2 -> str="28"
        4,6,9,11 -> str= "30"
        else -> str="нету такого месяца "
    }
    println("Месяц $num - дней $str")
}