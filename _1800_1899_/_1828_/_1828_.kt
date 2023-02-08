package beecrowd.iniciante._1800_1899_._1828_

fun main(){

    val T = readLine()?.toInt()!!

    var escolhas: String
    var escolhasArray: Array<String>

    var escolhaSheldon: String
    var escolhaRaj: String

    var resultadoSheldon: String
    var resultadoRaj: String

    var reacaoSheldon: String


    for (i in 0 until T){

        escolhas = readLine().toString()

        escolhasArray = escolhas.split(" ").toTypedArray()

        escolhaSheldon = escolhasArray[0]
        escolhaRaj = escolhasArray[1]

        resultadoSheldon = pedraPapelTesouraLagartoSpock(escolhaSheldon, escolhaRaj)
        resultadoRaj = pedraPapelTesouraLagartoSpock(escolhaRaj, escolhaSheldon)

        if (resultadoSheldon == escolhaSheldon){
            reacaoSheldon = "Bazinga!"
        } else if (resultadoRaj == escolhaRaj){
            reacaoSheldon = "Raj trapaceou!"
        } else {
            reacaoSheldon = "De novo!"
        }

        println("Caso #${i+1}: $reacaoSheldon")

    }

}

fun pedraPapelTesouraLagartoSpock(escolha1: String, escolha2: String ): String{

    return if (escolha1 == "tesoura" && escolha2 == "papel"){
        "tesoura"
    } else if (escolha1 == "papel" && escolha2 == "pedra"){
        "papel"
    } else if (escolha1 == "pedra" && escolha2 == "lagarto") {
        "pedra"
    } else if (escolha1 == "lagarto" && escolha2 == "Spock") {
        "lagarto"
    } else if (escolha1 == "Spock" && escolha2 == "tesoura"){
        "Spock"
    } else if (escolha1 == "tesoura" && escolha2 == "lagarto"){
        "tesoura"
    } else if (escolha1 == "lagarto" && escolha2 == "papel"){
        "lagarto"
    } else if (escolha1 == "papel" && escolha2 == "Spock"){
        "papel"
    } else if (escolha1 == "Spock" && escolha2 == "pedra"){
        "Spock"
    } else if (escolha1 == "pedra" && escolha2 == "tesoura"){
        "pedra"
    } else {
        "De novo!"
    }

}