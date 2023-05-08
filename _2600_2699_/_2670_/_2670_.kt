package beecrowd.iniciante._2600_2699_._2670_

fun main(){

    var andar1Funcionarios = readLine()!!.toInt()
    var andar2Funcionarios = readLine()!!.toInt()
    var andar3Funcionarios = readLine()!!.toInt()

    var listaResultados  = mutableListOf<Int>()

    listaResultados.add((andar2Funcionarios * 2) + (andar3Funcionarios * 4))
    listaResultados.add((andar1Funcionarios * 2) + (andar3Funcionarios * 2))
    listaResultados.add((andar1Funcionarios * 4) + (andar2Funcionarios * 2))

    println(listaResultados.min())


}