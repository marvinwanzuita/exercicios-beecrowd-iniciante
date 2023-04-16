package beecrowd.iniciante._2500_2599_._2534_

import java.util.*

fun main() {

    val sc = Scanner(System.`in`)

    var habitantesConsultas: String
    var habitantesConsultasArray: Array<String>

    var quantidadeHabitantes: Int
    var quantidadeConsultas: Int

    var listaNotas = mutableListOf<Int>()
    var listaNotasMaiorMenor = mutableListOf<Int>()

    var listaResulado = mutableListOf<Int>()

//    var i = 0
//    while(i < 1) {
    while(sc.hasNext()) {

        habitantesConsultas = sc.nextLine()
        habitantesConsultasArray = habitantesConsultas.split(" ").toTypedArray()

        quantidadeHabitantes = habitantesConsultasArray[0].toInt()
        quantidadeConsultas = habitantesConsultasArray[1].toInt()

        for (i in 0 until quantidadeHabitantes){
            listaNotas.add(sc.nextInt())
        }

        listaNotasMaiorMenor = listaNotas.sortedDescending() as MutableList<Int>

        for (i in 0 until quantidadeConsultas){
            listaResulado.add(listaNotasMaiorMenor[sc.nextInt() - 1])
        }
        sc.nextLine()
        listaNotas.clear()

//        i++
    }

    listaResulado.forEach { l -> println(l) }

}