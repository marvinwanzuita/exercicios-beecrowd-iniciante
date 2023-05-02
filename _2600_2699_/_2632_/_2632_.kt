package beecrowd.iniciante._2600_2699_._2632_

import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    var casosTeste = readLine()!!.toInt()

    var dimensoesCoordenadas : String
    var dimensoesCoordenadasArray : Array<String>

    var larguraRetangulo : Int
    var alturaRetangulo : Int
    var x0Retangulo : Int
    var y0Retangulo : Int
    var coordenadasRetangulo : List<Int>

    var magiaIdentificadorNivel : String
    var magiaIdentificadorNivelArray : Array<String>

    var magiaIdentificador : String
    var magiaNivel : Int
    var cxMagia : Int
    var cyMagia : Int
    var raioMagia : Int

    var menorDistancia : Double?

    for (i in 0 until casosTeste){

        dimensoesCoordenadas = readLine().toString()
        dimensoesCoordenadasArray = dimensoesCoordenadas.split(" ").toTypedArray()

        larguraRetangulo = dimensoesCoordenadasArray[0].toInt()
        alturaRetangulo = dimensoesCoordenadasArray[1].toInt()
        x0Retangulo = dimensoesCoordenadasArray[2].toInt()
        y0Retangulo = dimensoesCoordenadasArray[3].toInt()

        coordenadasRetangulo = mutableListOf()

        // A
        coordenadasRetangulo.add(x0Retangulo)
        coordenadasRetangulo.add(y0Retangulo)
        // B
        coordenadasRetangulo.add(x0Retangulo)
        coordenadasRetangulo.add(y0Retangulo + alturaRetangulo)
        // C
        coordenadasRetangulo.add(x0Retangulo + larguraRetangulo)
        coordenadasRetangulo.add(y0Retangulo + alturaRetangulo)
        // D
        coordenadasRetangulo.add(x0Retangulo + larguraRetangulo)
        coordenadasRetangulo.add(y0Retangulo)

        magiaIdentificadorNivel = readLine().toString()
        magiaIdentificadorNivelArray = magiaIdentificadorNivel.split(" ").toTypedArray()

        magiaIdentificador = magiaIdentificadorNivelArray[0]
        magiaNivel = magiaIdentificadorNivelArray[1].toInt()
        cxMagia = magiaIdentificadorNivelArray[2].toInt()
        cyMagia = magiaIdentificadorNivelArray[3].toInt()

        raioMagia = raioMagia(magiaIdentificador, magiaNivel)

        menorDistancia = menorDistanciaCirculoRetangulo(coordenadasRetangulo, cxMagia, cyMagia)

        if (menorDistancia != null) {
            if (raioMagia >= menorDistancia) {
                println(danoMagia(magiaIdentificador))
            } else {
                println(0)
            }
        }

    }

}

fun danoMagia(magia: String) : Int{
    return when(magia){
        "fire" -> 200
        "water" -> 300
        "earth" -> 400
        "air" -> 100
        else -> 0
    }

}

fun raioMagia(magia: String, nivelMagia: Int): Int {

    var raioMagia = 0

    if (magia == "fire"){
        raioMagia = when(nivelMagia){
            1 -> 20
            2 -> 30
            3 -> 50
            else -> 0
        }
    } else if (magia == "water"){
        raioMagia = when(nivelMagia){
            1 -> 10
            2 -> 25
            3 -> 40
            else -> 0
        }
    } else if (magia == "earth"){
        raioMagia = when(nivelMagia){
            1 -> 25
            2 -> 55
            3 -> 70
            else -> 0
        }
    } else if (magia == "air"){
        raioMagia = when(nivelMagia){
            1 -> 18
            2 -> 38
            3 -> 60
            else -> 0
        }
    }

    return raioMagia
}

fun menorDistanciaCirculoRetangulo(listaCoordenadasRetangulo: List<Int>, cxMagia: Int, cyMagia: Int): Double? {

    var menorDistancia: Double? = null
    var distanciaRetanguloCirculo : Double
    var xRetangulo : Int
    var yRetangulo : Int

    for (i in 0..7 step 2){

        xRetangulo = listaCoordenadasRetangulo[i]
        yRetangulo = listaCoordenadasRetangulo[i + 1]

        distanciaRetanguloCirculo = sqrt((xRetangulo - cxMagia).toDouble().pow(2) + (yRetangulo - cyMagia).toDouble().pow(2))

        if (menorDistancia == null){
            menorDistancia = distanciaRetanguloCirculo
        } else {
            if (distanciaRetanguloCirculo < menorDistancia){
                menorDistancia = distanciaRetanguloCirculo
            }
        }

    }

    return menorDistancia

}