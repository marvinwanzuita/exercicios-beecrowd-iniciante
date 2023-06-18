package beecrowd.iniciante._2760_2799_._2787_

fun main(){


    var linhas = readLine()!!.toInt()
    var colunas = readLine()!!.toInt()

    var casaInferiorDireita : Int

    var linhasPar = (linhas % 2) == 0
    var linhasImpar = (linhas % 2) != 0
    var colunasPar = (colunas % 2) == 0
    var colunasImpar = (colunas % 2) != 0

    if (linhasPar && colunasPar){
        casaInferiorDireita = 1
    } else if (linhasPar && colunasImpar) {
        casaInferiorDireita = 0
    } else if (linhasImpar && colunasImpar){
        casaInferiorDireita = 1
    } else if (linhasImpar && colunasPar){
        casaInferiorDireita = 0
    } else {
        casaInferiorDireita = -1
    }

    println(casaInferiorDireita)

}