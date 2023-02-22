package beecrowd.iniciante._1900_1999_._1959_

fun main(){

    val NL = readLine()
    val NLArray = NL!!.split(" ").toTypedArray()

    val N = NLArray[0].toLong()
    val L = NLArray[1].toLong()

    println(N * L)


}