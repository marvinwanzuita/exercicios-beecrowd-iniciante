package beecrowd.iniciante._2200_2499_._2334_

import java.math.BigInteger

fun main(){

    var quantidadePatos : BigInteger
    val patos = mutableListOf<BigInteger>()
    val zero = BigInteger("0")
    val um = BigInteger("1")
    val menos1 = BigInteger("-1")

    while (true){
        quantidadePatos = BigInteger(readLine().toString())
        if (quantidadePatos == menos1) break
        patos.add(quantidadePatos)
    }

    for (p in patos){
        if (p == zero) println(0) else println(p - um)
    }



}