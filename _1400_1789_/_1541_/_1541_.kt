package beecrowd.iniciante._1400_1789_._1541_

import kotlin.math.sqrt

fun main(){

    var entrada: String
    var array: List<String>
    var A : Int
    var B : Int
    var C : Int

    var area: Double

    while (true) {

        entrada = readLine().toString()
        array = entrada.split(" ")

        A = array[0].toInt()

        if (A == 0){
            break
        }

        B = array[1].toInt()
        C = array[2].toInt()

        area = sqrt((((A * B) * 100).toDouble()) / C.toDouble())

        println(area.toInt())

    }



}