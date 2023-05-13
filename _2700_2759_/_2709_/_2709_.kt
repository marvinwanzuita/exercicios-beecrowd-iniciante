package beecrowd.iniciante._2700_2759_._2709_

import java.util.*

fun main() {

    val sc = Scanner(System.`in`)

    var quantidadeMoedas: Int
    var listaValoresMoedas: MutableList<Int>
    var listaValoresMoedasInvertidas: MutableList<Int>
    var saltoEscolhido: Int
    var proximoSalto : Int
    var resultadosSaltos: Int


    while (sc.hasNext()) {

        quantidadeMoedas = sc.nextInt()
        sc.nextLine()

        listaValoresMoedas = mutableListOf()

        for (i in 0 until quantidadeMoedas) {
            listaValoresMoedas.add(sc.nextInt())
            sc.nextLine()
        }

        saltoEscolhido = sc.nextInt()
        sc.nextLine()

        listaValoresMoedasInvertidas = listaValoresMoedas.asReversed()

        resultadosSaltos = 0
        proximoSalto = 0

        for (i in 0 until listaValoresMoedasInvertidas.size) {

            if (proximoSalto == 0){
                resultadosSaltos += listaValoresMoedasInvertidas[i]
                if ((proximoSalto + saltoEscolhido) >= listaValoresMoedasInvertidas.size){
                    proximoSalto++
                } else {
                    proximoSalto += saltoEscolhido
                }

            } else if (proximoSalto == i){
                resultadosSaltos += listaValoresMoedasInvertidas[i]
                if ((proximoSalto + saltoEscolhido) >= listaValoresMoedasInvertidas.size){
                    proximoSalto++
                } else {
                    proximoSalto += saltoEscolhido
                }
            }

        }

        if (resultadosSaltos % 2 != 0) {
            println("Bad boy! I’ll hit you.")
        } else {
            println("You’re a coastal aircraft, Robbie, a large silver aircraft.")
        }

    }


}