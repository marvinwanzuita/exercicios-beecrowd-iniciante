package beecrowd.iniciante._1400_1789_._1589_

fun main(){

    var T: Int

    var R1R2String: String
    var R1R2StringArray: Array<String>

    var R1: Int
    var R2: Int

    var conduinte: Int

    T = readLine()?.toInt()!!

    var i = 0

    while (i < T){

        R1R2String = readLine().toString()
        R1R2StringArray = R1R2String.split(" ").toTypedArray()

        R1 = R1R2StringArray[0].toInt()
        R2 = R1R2StringArray[1].toInt()

        conduinte = R1 + R2

        println(conduinte)

        i++
    }

}