package beecrowd.iniciante._2500_2599_._2542_

import java.util.*

fun main(){

    val sc = Scanner(System.`in`)

    var numeroAtributos : Int

    var quantidadeCartasMarcosLeonardo : String
    var quantidadeCartasMarcosLeonardoArray : Array<String>

    var marcosQuantidadeCartas : Int
    var leonardoQuantidadeCartas : Int

    var marcosColecaoCartas : String
    var marcosColecaoCartasArrayString : Array<String>
    var marcosColecaoCartasArray : Array<String>

    var leonardoColecaoCartas : String
    var leonardoColecaoCartasArrayString : Array<String>
    var leonardoColecaoCartasArray : Array<String>

    var marcosCarta : Int
    var leonardoCarta : Int

    var cartasEscolhidas : String
    var cartasEscolhidasArray : Array<String>

    var marcosCartaEAtributoSelecionado : Int
    var leonardoCartaEAtributoSelecionado : Int

    var atributoSelecionado : Int

//    while (sc.hasNext()) {

    numeroAtributos = sc.nextInt()
    sc.nextLine()

    quantidadeCartasMarcosLeonardo = sc.nextLine()
    quantidadeCartasMarcosLeonardoArray = quantidadeCartasMarcosLeonardo.split(" ").toTypedArray()

    marcosQuantidadeCartas = quantidadeCartasMarcosLeonardoArray[0].toInt()
    leonardoQuantidadeCartas = quantidadeCartasMarcosLeonardoArray[1].toInt()

    marcosColecaoCartasArray = Array(quantidadeCartasMarcosLeonardoArray[0].toInt()) { "" }
    leonardoColecaoCartasArray = Array(quantidadeCartasMarcosLeonardoArray[1].toInt()) { "" }

    for (i in 0 until marcosQuantidadeCartas){
        marcosColecaoCartas = sc.nextLine()
        marcosColecaoCartasArrayString[i] = marcosColecaoCartas.split(" ").toTypedArray().toString()
    }

    for (i in 0 until leonardoQuantidadeCartas){
        leonardoColecaoCartas = sc.nextLine()
        leonardoColecaoCartasArrayString[i] = leonardoColecaoCartas.split(" ").toTypedArray().toString()
    }

    cartasEscolhidas = sc.nextLine()
    cartasEscolhidasArray = cartasEscolhidas.split(" ").toTypedArray()

    marcosCarta = cartasEscolhidasArray[0].toInt() - 1
    leonardoCarta = cartasEscolhidasArray[1].toInt() - 1

    atributoSelecionado = sc.nextInt()
    atributoSelecionado--
    sc.nextLine()

    marcosCartaEAtributoSelecionado = marcosColecaoCartasArray[marcosCarta][atributoSelecionado].toInt()
    leonardoCartaEAtributoSelecionado = leonardoColecaoCartasArray[leonardoCarta][atributoSelecionado].toInt()

    if (marcosCartaEAtributoSelecionado > leonardoCartaEAtributoSelecionado){
        println("Leonardo")
    } else if (marcosCartaEAtributoSelecionado < leonardoCartaEAtributoSelecionado){
        println("Marcos")
    } else {
        println("Empate")
    }

    // ate aqui esta certo

}