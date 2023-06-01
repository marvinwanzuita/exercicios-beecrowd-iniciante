package beecrowd.iniciante._2700_2759_._2758_

fun main(){

    var (nA, nB) = readLine()!!.split(" ")
    var (nC, nD) = readLine()!!.split(" ")

    var nAD = nA.toDouble()
    var nBD = nB.toDouble()
    var nCD = nC.toDouble()
    var nDD = nD.toDouble()

    println("A = " + String.format("%.6f", nAD) + ", B = " + String.format("%.6f", nBD))
    println("C = " + String.format("%.6f", nCD) + ", D = " + String.format("%.6f", nDD))

    println("A = " + String.format("%.1f", nAD) + ", B = " + String.format("%.1f", nBD))
    println("C = " + String.format("%.1f", nCD) + ", D = " + String.format("%.1f", nDD))

    println("A = " + String.format("%.2f", nAD) + ", B = " + String.format("%.2f", nBD))
    println("C = " + String.format("%.2f", nCD) + ", D = " + String.format("%.2f", nDD))

    println("A = " + String.format("%.3f", nAD) + ", B = " + String.format("%.3f", nBD))
    println("C = " + String.format("%.3f", nCD) + ", D = " + String.format("%.3f", nDD))

    println("A = " + String.format("%.3e", nAD) + ", B = " + String.format("%.3e", nBD))
    println("C = " + String.format("%.3e", nCD) + ", D = " + String.format("%.3e", nDD))

    println("A = " + String.format("%.0f", nAD) + ", B = " + String.format("%.0f", nBD))
    println("C = " + String.format("%.0f", nCD) + ", D = " + String.format("%.0f", nDD))




}