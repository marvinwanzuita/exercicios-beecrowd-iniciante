package beecrowd.iniciante._2600_2699_

import java.util.*

fun main(){

    val sc = Scanner(System.`in`)

    var entrada : String
    var entradaArray : Array<String>

    var dodoJogada : String
    var leoJogada : String
    var pepperJogada : String

    var resultadoPedraPapelTesoura : String

    var pedra = "pedra"
    var papel = "papel"
    var tesoura = "tesoura"

    fun pedraPapelTesoura(e1: String, e2: String, e3: String) : String{

        return if (e1 == pedra && e2 == tesoura && e3 == tesoura){ // pedra
            pedra
        } else if (e1 == tesoura && e2 == pedra && e3 == tesoura){ // pedra
            pedra
        } else if (e1 == tesoura && e2 == tesoura && e3 == pedra){ // pedra
            pedra
        } else if (e1 == papel && e2 == pedra && e3 == pedra){ // papel
            papel
        } else if (e1 == pedra && e2 == papel && e3 == pedra){ // papel
            papel
        } else if (e1 == pedra && e2 == pedra && e3 == papel){ // papel
            papel
        } else if (e1 == tesoura && e2 == papel && e3 == papel){ // tesoura
            tesoura
        } else if (e1 == papel && e2 == tesoura && e3 == papel){ // tesoura
            tesoura
        } else if (e1 == papel && e2 == papel && e3 == tesoura){ // tesoura
            tesoura
        } else {
            "empate"
        }

    }

    while (sc.hasNext()) {

        entrada = sc.nextLine()
        entradaArray = entrada.split(" ").toTypedArray()

        dodoJogada = entradaArray[0]
        leoJogada = entradaArray[1]
        pepperJogada = entradaArray[2]

        resultadoPedraPapelTesoura = pedraPapelTesoura(dodoJogada, leoJogada, pepperJogada)

        if (dodoJogada == resultadoPedraPapelTesoura) {
            println("Os atributos dos monstros vao ser inteligencia, sabedoria...")
        } else if (leoJogada == resultadoPedraPapelTesoura) {
            println("Iron Maiden's gonna get you, no matter how far!")
        } else if (pepperJogada == resultadoPedraPapelTesoura) {
            println("Urano perdeu algo muito precioso...")
        } else {
            println("Putz vei, o Leo ta demorando muito pra jogar...")
        }

    }
}