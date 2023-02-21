package beecrowd.iniciante._1900_1999_._1958_


fun main(){

    var N = readLine()!!.toString()
    var NDouble: Double

    var totalNumeros: Int
    val NFormatado: String


    if (N.contains(".")){
        NDouble = N.toDouble()
    } else {
        totalNumeros = N.length - 1
        NDouble = N.toDouble()
        NDouble /= totalNumeros
        NFormatado = String.format("%.4f", NDouble)
        println("+${NFormatado}E+$totalNumeros")
    }


}

