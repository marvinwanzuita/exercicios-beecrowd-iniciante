package beecrowd.iniciante._2000_2099_._2031_

fun main(){

    val N = readLine()!!.toInt()

    var jogador1 : String
    var jogador2 : String

    for (i in 0 until N){

        jogador1 = readLine().toString()
        jogador2 = readLine().toString()

        println(pedraPapelAtaqueAereo(jogador1, jogador2))

    }


}


fun pedraPapelAtaqueAereo(j1: String, j2 : String): String{

    var ataque= "ataque"
    var pedra = "pedra"
    var papel = "papel"

    return if (j1 == ataque && j2 == pedra){
        "Jogador 1 venceu"
    } else if (j1 == pedra && j2 == ataque){
        "Jogador 2 venceu"
    } else if (j1 == papel && j2 == ataque){
        "Jogador 2 venceu"
    } else if (j1 == ataque && j2 == papel){
        "Jogador 1 venceu"
    } else if (j1 == pedra && j2 == papel){
        "Jogador 1 venceu"
    } else if (j1 == papel && j2 == pedra){
        "Jogador 2 venceu"
    } else if (j1 == papel && j2 == papel){
        "Ambos venceram"
    } else if (j1 == pedra && j2 == pedra){
        "Sem ganhador"
    } else if (j1 == ataque && j2 == ataque){
        "Aniquilacao mutua"
    } else {
        "Sem ganhador"
    }

}