package HW3

fun main(){
    val a = intArrayOf(1,2,3)
    val b = intArrayOf(4,5,6)
    val c = IntArray(a.size)
    for(i in c.indices){
        c[i]=a[i]+b[i]
    }
    for (i in c.indices){
        print("${c[i]} ")
    }
}