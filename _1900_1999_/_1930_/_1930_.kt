package beecrowd.iniciante._1900_1999_._1930_

fun main(){

    val T1T2T3T4 = readLine()
    val T1T2T3T4Array = T1T2T3T4!!.split(" ").toTypedArray()

    var T1 = T1T2T3T4Array[0].toInt()
    var T2 = T1T2T3T4Array[1].toInt()
    var T3 = T1T2T3T4Array[2].toInt()
    var T4 = T1T2T3T4Array[3].toInt()

    val totalTomadas = (--T1) + (--T2) + (--T3) + T4

    println(totalTomadas)


}