package HW2

fun main(){
    var age = readLine()!!.toInt()
    if(age >= 1 && age <=100){ //age in 1..200
        var lastD: Int = age % 10
        println(lastD)
        var ageStr = " "
        if(age - lastD == 10 || age - lastD == 100){ //10-19 лет, 100 лет
            ageStr = "лет"
        }else if(lastD == 1){
            ageStr = "год"
        } else if (lastD <=4){
            ageStr = "года"
        } else{
            ageStr = "лет"
        }
        println("Вывод: $age - $ageStr")
    }else{
        println("число не может быть больше 200 или меньше 1")
    }
}