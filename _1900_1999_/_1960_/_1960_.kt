package beecrowd.iniciante._1900_1999_._1960_

fun main(){

    var N = readLine().toString()
    val NArray = N.split("").toTypedArray()

    val NArrayLimpo = NArray.filter{it != ""}.reversed()

    var numeroRomano = ""


    for (i in NArrayLimpo.size - 1 downTo 0){

        if (i == 2){
            numeroRomano += centenaRomano(NArrayLimpo[i].toString())
        }
        if (i == 1){
            numeroRomano += dezenaRomano(NArrayLimpo[i].toString())
        }
        if (i == 0){
            numeroRomano += unidadeRomano(NArrayLimpo[i].toString())
        }

    }

    println(numeroRomano)

}


fun centenaRomano(N: String): String{
    return when(N.toInt()){
        1 -> "C"
        2 -> "CC"
        3 -> "CCC"
        4 -> "CD"
        5 -> "D"
        6 -> "DC"
        7 -> "DCC"
        8 -> "DCCC"
        9 -> "CM"
        else -> ""
    }
}
fun dezenaRomano(N: String): String{
    return when(N.toInt()){
        1 -> "X"
        2 -> "XX"
        3 -> "XXX"
        4 -> "XL"
        5 -> "L"
        6 -> "LX"
        7 -> "LXX"
        8 -> "LXXX"
        9 -> "XC"
        else -> ""
    }
}
fun unidadeRomano(N: String): String{
    return when(N.toInt()){
        1 -> "I"
        2 -> "II"
        3 -> "III"
        4 -> "IV"
        5 -> "V"
        6 -> "VI"
        7 -> "VII"
        8 -> "VIII"
        9 -> "IX"
        else -> ""
    }
}