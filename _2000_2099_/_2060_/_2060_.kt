package beecrowd.iniciante._2000_2099_._2060_

fun main(){

    val N = readLine()!!.toInt()
    var L = readLine().toString()
    var LArray = L.split(" ")

    var multiplo2 = 0
    var multiplo3 = 0
    var multiplo4 = 0
    var multiplo5 = 0

    for (i in 0 until LArray.size){

        if ((LArray[i].toInt() % 2) == 0) multiplo2++
        if ((LArray[i].toInt() % 3) == 0) multiplo3++
        if ((LArray[i].toInt() % 4) == 0) multiplo4++
        if ((LArray[i].toInt() % 5) == 0) multiplo5++

    }

    println("$multiplo2 Multiplo(s) de 2")
    println("$multiplo3 Multiplo(s) de 3")
    println("$multiplo4 Multiplo(s) de 4")
    println("$multiplo5 Multiplo(s) de 5")


}