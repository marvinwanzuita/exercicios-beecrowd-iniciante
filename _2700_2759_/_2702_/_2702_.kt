package beecrowd.iniciante._2700_2759_._2702_

fun main(){

    val (frangoDisponivel, bifeDisponivel, massaDisponivel) = readLine()!!.split(" ")
    val (frangoRequisitado, bifeRequisitado, massaRequisitado) = readLine()!!.split(" ")

    var frangoFaltante = frangoRequisitado.toInt() - frangoDisponivel.toInt()
    var bifeFaltante = bifeRequisitado.toInt() - bifeDisponivel.toInt()
    var massaFaltante = massaRequisitado.toInt() - massaDisponivel.toInt()

    var naoReceberaoRefeicao = 0

    if (frangoFaltante >= 0) naoReceberaoRefeicao += frangoFaltante
    if (bifeFaltante >= 0) naoReceberaoRefeicao += bifeFaltante
    if (massaFaltante >= 0) naoReceberaoRefeicao += massaFaltante

    println(naoReceberaoRefeicao)

}

