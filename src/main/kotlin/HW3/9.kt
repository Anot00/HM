package HW3

fun main(){
    for(i in 0..3){ //куб
        for (j in 0..4){
            print("* ")
        }
        println()
    }
    val n: Int = 5
    for (i in 0..n){
        for(j in i downTo 1){ // 54321
            print("* ")
        }
        println()
    }
}

//fun main() {
//    for (i in 4 downTo 1) print(i) // 4321
//}