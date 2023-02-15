package beecrowd.iniciante._1900_1999_._1914_

fun main(){

    val QT = readLine()?.toInt()

    var entradaJogadores: String
    var entradaJogadoresArray: Array<String>

    var nomeJogador1: String
    var escolhaJogador1: String

    var nomeJogador2: String
    var escolhaJogador2: String

    var entradaNumeros: String
    var entradaNumerosArray: Array<String>

    var numeroEscolhidoJ1: Int
    var numeroEscolhidoJ2: Int

    var somaNumerosEscolhidos: Int
    var escolhaGanhadora: String


    for (i in 0 until QT!!) {

        entradaJogadores = readLine().toString()
        entradaJogadoresArray = entradaJogadores.split(" ").toTypedArray()

        nomeJogador1 = entradaJogadoresArray[0]
        escolhaJogador1 = entradaJogadoresArray[1]
        nomeJogador2 = entradaJogadoresArray[2]
        escolhaJogador2 = entradaJogadoresArray[3]

        entradaNumeros = readLine().toString()
        entradaNumerosArray = entradaNumeros.split(" ").toTypedArray()

        numeroEscolhidoJ1 = entradaNumerosArray[0].toInt()
        numeroEscolhidoJ2 = entradaNumerosArray[1].toInt()

        somaNumerosEscolhidos = numeroEscolhidoJ1 + numeroEscolhidoJ2

        if (somaNumerosEscolhidos % 2 == 0) escolhaGanhadora = "PAR" else escolhaGanhadora = "IMPAR"

        if (escolhaJogador1 == escolhaGanhadora) println(nomeJogador1) else println(nomeJogador2)

    }



}