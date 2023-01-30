package beecrowd.iniciante._1400_1789_._1534_

import java.util.*

fun main(){

    val s = Scanner(System.`in`)
    var N : Int

    while (s.hasNext()){

        N = s.nextInt()

        val rows = N
        val cols = N

        var finalArray = N - 1

        val arr = Array(rows) { r -> IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {


                if (j == finalArray){
                    arr[i][j] = 2
                    finalArray--
                } else if (i == j){
                    arr[i][j] = 1
                } else {
                    arr[i][j] = 3
                }

            }
        }

        for (i in 0 until N) {
            for (j in 0 until N) {
                print("${arr[i][j]}")
            }
            println()
        }

    }





}