package beecrowd.iniciante._2200_2499_._2493_

import java.util.Scanner

fun main(){

    val sc = Scanner(System.`in`)

    var quantidadeExpressoesJogadores : Int

    var expressoes = mutableListOf<String>()
    var palpitesJogadores = mutableListOf<String>()

    var expressoesArray : Array<String>
    var palpitesJogadoresArray : Array<String>

    var operando1 : Int
    var operando2 : Int
    var totalExpressao : Int

    var jogador : String
    var indiceOperacao : Int
    var sinalOperacao : String

    var listaErraram = mutableListOf<String>()

//        var i = 1
//        while (i <= 1){
    while (sc.hasNext()){

        quantidadeExpressoesJogadores = sc.nextInt()
        sc.nextLine()

        for (i in 0 until  quantidadeExpressoesJogadores){
            expressoes.add(sc.nextLine())
        }

        for (i in 0 until  quantidadeExpressoesJogadores){
            palpitesJogadores.add(sc.nextLine())
        }

        for (i in 0 until expressoes.size){

            palpitesJogadoresArray = palpitesJogadores[i].split(" ").toTypedArray()
            jogador = palpitesJogadoresArray[0]
            indiceOperacao = palpitesJogadoresArray[1].toInt() - 1
            sinalOperacao = palpitesJogadoresArray[2]

            expressoesArray = expressoes[indiceOperacao].split("[ ]+|=".toRegex()).toTypedArray()

            operando1 = expressoesArray[0].toInt()
            operando2 = expressoesArray[1].toInt()
            totalExpressao = expressoesArray[2].toInt()

            if (!verificarPalpite(operando1, operando2, totalExpressao, sinalOperacao)){
                listaErraram.add(jogador)
            }


        }

        if (listaErraram.size == quantidadeExpressoesJogadores){
            println("None Shall Pass!")
        } else if (listaErraram.isEmpty()){
            println("You Shall All Pass!")
        } else {
            listaErraram.sorted().forEachIndexed {i , errou ->
                if (i == listaErraram.lastIndex){
                    print(errou)
                    println()
                } else {
                    print("$errou ")
                }
            }
        }

        listaErraram.clear()
        expressoes.clear()
        palpitesJogadores.clear()

//        i++
    }

}


fun verificarPalpite(n1: Int, n2: Int, resultado: Int, operador: String): Boolean{

    var resultadoAdicao = n1 + n2
    var resultadoSubtracao = n1 - n2
    var resultadoMultiplicacao = n1 * n2

    var resultadoOperacao = if (resultadoAdicao == resultado){
        resultadoAdicao
    } else if (resultadoSubtracao == resultado){
        resultadoSubtracao
    } else if (resultadoMultiplicacao == resultado){
        resultadoMultiplicacao
    } else {
        false
    }

    var resultadoOperacaoPalpite = when(operador){
        "+" -> n1 + n2
        "-" -> n1 - n2
        "*" -> n1 * n2
        "I" -> false
        else -> true
    }

    return resultadoOperacao == resultadoOperacaoPalpite


}