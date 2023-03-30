package beecrowd.iniciante._2100_2199_._2176_

fun main(){

    var bits = readLine().toString()
    var quantidadeBit1  = 0

    var bitsArray = bits.toCharArray()

    for (b in bitsArray){
        if (b == '1') quantidadeBit1++
    }

    bits += if (quantidadeBit1 % 2 == 0) "0" else "1"

    println(bits)

}