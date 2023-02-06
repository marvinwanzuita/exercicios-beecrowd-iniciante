package beecrowd.iniciante._1400_1789_._1789_

import java.util.*

fun main(){


    val sc = Scanner(System.`in`)
    var L : Int

    var nivel1: Boolean
    var nivel2: Boolean
    var nivel3: Boolean

    var VString: String
    var V: Array<String>

    while (sc.hasNext()) {

        L = sc.nextInt()

        nivel1 = false
        nivel2 = false
        nivel3 = false

        VString = readLine().toString()
        V = VString.split(" ").toTypedArray()

        for (i in 0 until L){

            if (V[i].toInt() < 10){
                nivel1 = true
            } else if (V[i].toInt() <= 19) {
                nivel2 = true
            } else {
                nivel3 = true
            }

        }

        if (nivel3 == true){
            println(3)
        } else if (nivel2 == true){
            println(2)
        } else {
            println(1)
        }

    }



}