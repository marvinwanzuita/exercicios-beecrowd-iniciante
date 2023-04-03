package beecrowd.iniciante._2200_2499_._2310_

fun main(){

    var quantidadeJogadores = readLine()!!.toInt()

    var nomeJogador : String
    var saqueBloqueioAtaque : String
    var saqueBloqueioAtaqueArray : Array<String>

    var saqueBloqueioAtaqueSucesso : String
    var saqueBloqueioAtaqueSucessoArray : Array<String>

    var saqueTotal = 0
    var bloqueioTotal = 0
    var ataqueTotal = 0

    var saqueSucessoTotal = 0
    var bloqueioSucessoTotal = 0
    var ataqueSucessoTotal = 0

    for (i in 0 until quantidadeJogadores){

        nomeJogador = readLine().toString()

        saqueBloqueioAtaque = readLine().toString()
        saqueBloqueioAtaqueArray = saqueBloqueioAtaque.split(" ").toTypedArray()
        saqueTotal += saqueBloqueioAtaqueArray[0].toInt()
        bloqueioTotal += saqueBloqueioAtaqueArray[1].toInt()
        ataqueTotal += saqueBloqueioAtaqueArray[2].toInt()

        saqueBloqueioAtaqueSucesso = readLine().toString()
        saqueBloqueioAtaqueSucessoArray = saqueBloqueioAtaqueSucesso.split(" ").toTypedArray()
        saqueSucessoTotal += saqueBloqueioAtaqueSucessoArray[0].toInt()
        bloqueioSucessoTotal += saqueBloqueioAtaqueSucessoArray[1].toInt()
        ataqueSucessoTotal += saqueBloqueioAtaqueSucessoArray[2].toInt()

    }

    var porcentagemSucessoSaque = (saqueSucessoTotal * 100) / saqueTotal.toDouble()
    var porcentagemSucessoBloqueio = (bloqueioSucessoTotal * 100) / bloqueioTotal.toDouble()
    var porcentagemSucessoAtaque = (ataqueSucessoTotal * 100) / ataqueTotal.toDouble()

    println("Pontos de Saque: ${String.format("%.2f", porcentagemSucessoSaque)} %.")
    println("Pontos de Bloqueio: ${String.format("%.2f", porcentagemSucessoBloqueio)} %.")
    println("Pontos de Ataque: ${String.format("%.2f", porcentagemSucessoAtaque)} %.")



}