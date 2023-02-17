package beecrowd.iniciante._1900_1999_._1929_

fun main(){

    val ABCDEntrada = readLine()
    val ABCDEntradaArray = ABCDEntrada!!.split(" ").toTypedArray()

    val A = ABCDEntradaArray[0].toInt()
    val B = ABCDEntradaArray[1].toInt()
    val C = ABCDEntradaArray[2].toInt()
    val D = ABCDEntradaArray[3].toInt()

    val ABC = ((A + B) > C) && ((A + C) > B) && ((B + C) > A)
    val ABD = ((A + B) > D) && ((A + D) > B) && ((B + D) > A)
    val ACD = ((A + C) > D) && ((A + D) > C) && ((C + D) > A)
    val BCD = ((B + C) > D) && ((B + D) > C) && ((C + D) > B)

    if (ABC || ABD || ACD || BCD){
        println("S")
    } else {
        println("N")
    }

}