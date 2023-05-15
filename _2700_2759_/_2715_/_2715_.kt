package beecrowd.iniciante._2700_2759_._2715_

import java.util.*

fun main(){

    val sc = Scanner(System.`in`)
    var trabalhosASeremFeitos : Long
    var quantidadeTrabalhos : String
    var quantidadeTrabalhosArray : Array<String>
    var quantidadeTrabalhosArrayInt : Array<Long>
    var totalTrabalhos : Long

    while (sc.hasNext()){

        trabalhosASeremFeitos = sc.nextLong()
        sc.nextLine()

        quantidadeTrabalhos = sc.nextLine()
        quantidadeTrabalhosArray = quantidadeTrabalhos.split(" ").toTypedArray()

        quantidadeTrabalhosArrayInt = quantidadeTrabalhosArray.map {
            it.toLong()
        }.toTypedArray()

        totalTrabalhos = 0

        quantidadeTrabalhosArrayInt.forEach { totalTrabalhos += it }

        println(totalTrabalhos % 2)

    }


}