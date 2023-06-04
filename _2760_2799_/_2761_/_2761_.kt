package beecrowd.iniciante._2760_2799_._2761_

fun main(){


    val entrada = readLine().toString()


    val (A, B, C) = entrada.split(" ")

    var tamanho3Strings = A.length + B.length + C.length + 3

    var D = entrada.substring(tamanho3Strings)

    println("$A$B$C$D")
    println("$A\t$B\t$C\t$D")
    println("" +
            "${A.take(10)} " +
            "${B.take(10)} " +
            "${C.take(10)} " +
            "${D.take(10)}")


}