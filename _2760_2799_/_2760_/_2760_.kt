package beecrowd.iniciante._2760_2799_._2760_

fun main(){

    var sA = readLine().toString()
    var sB = readLine().toString()
    var sC = readLine().toString()

    println("$sA$sB$sC")
    println("$sB$sC$sA")
    println("$sC$sA$sB")
    println("${sA.take(10)}${sB.take(10)}${sC.take(10)}")

}