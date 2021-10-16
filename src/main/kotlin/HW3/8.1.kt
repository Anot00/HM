package HW3

fun main(){
    println("Массив: ")
    val mas1 = intArrayOf(5, -3, 15, 61, 29, -2, 7)
    for(i in mas1.indices){
        print(mas1[i].toString() + " ")
    }
    var max1 = mas1[0]
    for(i in mas1.indices){
        if(mas1[i]>max1){
            max1 = mas1[i]
        }
    }
    println()
    println("Максимальное значение в масиве $max1")
}