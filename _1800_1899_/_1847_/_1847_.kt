package beecrowd.iniciante._1800_1899_._1847_

fun main(){

    val ABCString = readLine().toString()
    val ABCStringArray = ABCString.split(" ")

    var A = ABCStringArray[0].toInt()
    var B = ABCStringArray[1].toInt()
    var C = ABCStringArray[2].toInt()


    if (A > B && B <= C){
        println(":)")
    } else if (A < B && B >= C){
        println(":(")
    } else if (A < B && B < C && (B - A > C - B)){
        println(":(")
    } else if (A < B && B < C && (B - A <= C - B)){
        println(":)")
    } else if (A > B && B > C && (A - B > B - C)){
        println(":)")
    } else if (A > B && B > C && (A - B <= B - C)){
        println(":(")
    } else if (A == B && B < C){
        println(":)")
    } else if (A == B && B > C){
        println(":(")
    } else {
        println(":(")
    }



}