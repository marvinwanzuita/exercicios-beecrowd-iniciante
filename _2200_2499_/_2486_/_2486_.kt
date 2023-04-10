package beecrowd.iniciante._2200_2499_._2486_

fun main(){

    var quantidadeFrutasTotais : Int

    var quantidadeTipoFrutas : String
    var quantidadeTipoFrutasArray : Array<String>

    var quantidadeFrutas : Int
    var tipoFrutaArray : Array<String>
    var tipoFruta : String

    var totalVitaminaC : Int
    var resultadoVitaminaC : Int

    var listaResultado = mutableListOf<String>()


    while (true){

        quantidadeFrutasTotais = readLine()!!.toInt()
        if (quantidadeFrutasTotais == 0) break

        totalVitaminaC = 0

        for (i in 0 until quantidadeFrutasTotais){

            quantidadeTipoFrutas = readLine().toString()
            quantidadeTipoFrutasArray = quantidadeTipoFrutas.split(" ").toTypedArray()

            quantidadeFrutas = quantidadeTipoFrutasArray[0].toInt()
            tipoFrutaArray = quantidadeTipoFrutasArray.sliceArray(1 until quantidadeTipoFrutasArray.size)

            tipoFruta = tipoFrutaArray.joinToString(separator = " ")

            totalVitaminaC += quantidadeVitaminaC(quantidadeFrutas, tipoFruta)

        }

        if (totalVitaminaC < 110){
            resultadoVitaminaC = 110 - totalVitaminaC
            listaResultado.add("Mais $resultadoVitaminaC mg")
        } else if (totalVitaminaC > 130){
            resultadoVitaminaC = totalVitaminaC - 130
            listaResultado.add("Menos $resultadoVitaminaC mg")
        } else {
            listaResultado.add("$totalVitaminaC mg")
        }

    }

    for (resultado in listaResultado){
        println(resultado)
    }

}

fun quantidadeVitaminaC(quantidadeFrutas: Int, tipoFruta: String): Int{

    val quantidadeVitaminaC = when(tipoFruta){
        "suco de laranja" -> 120
        "morango fresco" -> 85
        "mamao" -> 85
        "goiaba vermelha" -> 70
        "manga" -> 56
        "laranja" ->  50
        "brocolis" -> 34
        else -> 1
    }

    return quantidadeVitaminaC * quantidadeFrutas
}