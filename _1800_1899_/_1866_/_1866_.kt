package beecrowd.iniciante._1800_1899_._1866_

fun main(){


    val C = readLine()?.toInt()
    var N: Int
    var S: Int

    for (i in 0 until C!!) {
        S = 0
        N = readLine()?.toInt()!!
        for (j in 0 until  N){
            if (j % 2 != 0) S-- else S++
        }

        println(S)
    }


}