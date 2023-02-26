package beecrowd.iniciante._1900_1999_._1962_

fun main(){

    var N = readLine()!!.toInt()
    var T : Int

    for (i in 0 until N){

        T = readLine()!!.toInt()

        if (T < 2015){
            println("${2015 - T } D.C.")
        } else {
            println("${T  - 2014} A.C.")
        }

    }

}