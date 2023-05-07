package beecrowd.iniciante._2600_2699_._2663_

fun main(){

    var numeroCompetidores = readLine()!!.toInt()
    var numeroMinimoClassificados = readLine()!!.toInt()
    var listaPontuacoes = mutableListOf<Int>()
    var listaPontuacoesDecrescente = mutableListOf<Int>()
    var listaMaioresPontuacoes = mutableListOf<Int>()

    for (i in 0 until numeroCompetidores){
        listaPontuacoes.add(readLine()!!.toInt())
    }

    listaPontuacoesDecrescente = listaPontuacoes.sortedDescending() as MutableList<Int>

    for (i in 0 until listaPontuacoesDecrescente.size){

        if (listaMaioresPontuacoes.size < numeroMinimoClassificados){
            listaMaioresPontuacoes.add(listaPontuacoesDecrescente[i])
        } else if (listaMaioresPontuacoes.size >= numeroMinimoClassificados && listaPontuacoesDecrescente[i] == listaMaioresPontuacoes[i-1]){
            listaMaioresPontuacoes.add(listaPontuacoesDecrescente[i])
        } else {
            break
        }

    }

    println(listaMaioresPontuacoes.size)


}