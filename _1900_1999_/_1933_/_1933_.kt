package beecrowd.iniciante._1900_1999_._1933_

fun main(){

    val AB = readLine()
    val ABArray = AB!!.split(" ").toTypedArray()

    val A = ABArray[0].toInt()
    val B = ABArray[1].toInt()

    if (A == B){
        println(A)
    } else if (A > B){
        println(A)
    } else {
        println(B)
    }



}