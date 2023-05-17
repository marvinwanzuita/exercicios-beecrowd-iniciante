package beecrowd.iniciante._2700_2759_._2718_

fun main(){

    var gruposLampadas = readLine()!!.toInt()
    var equivalenteDecimal : Long
    var binario : String
    var resultados  = mutableListOf<Int?>()

    for (i in 0 until gruposLampadas){

        equivalenteDecimal = readLine()!!.toLong()

        if (equivalenteDecimal == 0L){
            resultados.add(0)
        } else {
            binario = decimalParaBinario(equivalenteDecimal)
            resultados.add(encontrarMaiorSequencia(binario))
        }

    }

    resultados.forEach { println(it) }

}

fun encontrarMaiorSequencia(string: String): Int {
    val padrao = "(\\w)\\1+".toRegex()
    val sequenciasIguais = mutableListOf<String>()
    val matchResult = padrao.findAll(string)
    var maiorString: String? = null

    for (match in matchResult) {
        sequenciasIguais.add(match.value)
    }

    for (str in sequenciasIguais) {
        if (str.contains("1")) {
            if (maiorString == null || str.length > maiorString.length) {
                maiorString = str
            }
        }
    }

    return maiorString!!.length
}

fun decimalParaBinario(decimal: Long): String {
    var numeroDecimal = decimal
    var binario = ""

    if (numeroDecimal == 0L) {
        return "0"
    }

    while (numeroDecimal > 0) {
        val digito = numeroDecimal % 2
        binario = digito.toString() + binario
        numeroDecimal /= 2
    }

    return binario
}