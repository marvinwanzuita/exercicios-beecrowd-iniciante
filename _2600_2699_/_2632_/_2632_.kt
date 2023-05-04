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

        menorDistancia = menorDistanciaCirculoRetangulo(coordenadasRetangulo, cxMagia, cyMagia, raioMagia)

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

fun menorDistanciaCirculoRetangulo(listaCoordenadasRetangulo: List<Int>, cxMagia: Int, cyMagia: Int, raioMagia: Int): Double? {

    var xRetangulo : Int
    var yRetangulo : Int

    var AxRetangulo = listaCoordenadasRetangulo[0]
    var AyRetangulo = listaCoordenadasRetangulo[1]
    var BxRetangulo = listaCoordenadasRetangulo[2]
    var ByRetangulo = listaCoordenadasRetangulo[3]
    var CxRetangulo = listaCoordenadasRetangulo[4]
    var CyRetangulo = listaCoordenadasRetangulo[5]
    var DxRetangulo = listaCoordenadasRetangulo[6]
    var DyRetangulo = listaCoordenadasRetangulo[7]

    if (cxMagia <= AxRetangulo && (cyMagia >= AyRetangulo && cyMagia <= ByRetangulo)){
        xRetangulo = AxRetangulo
        yRetangulo = cyMagia
    } else if (cxMagia >= DxRetangulo && (cyMagia >= DyRetangulo && cyMagia <= CyRetangulo)){
        xRetangulo = DxRetangulo
        yRetangulo = cyMagia
    } else if (cyMagia <= AyRetangulo && (cxMagia >= AxRetangulo && cxMagia <= DxRetangulo)){
        xRetangulo = cxMagia
        yRetangulo = AyRetangulo
    } else if (cyMagia >= ByRetangulo && (cxMagia >= AxRetangulo && cxMagia <= DxRetangulo)){
        xRetangulo = cxMagia
        yRetangulo = ByRetangulo
    } else if (cxMagia <= AxRetangulo && cyMagia <= AyRetangulo){
        xRetangulo = AxRetangulo
        yRetangulo = AyRetangulo
    } else if (cxMagia <= BxRetangulo && cyMagia >= ByRetangulo){
        xRetangulo = BxRetangulo
        yRetangulo = ByRetangulo
    } else if (cxMagia >= CxRetangulo && cyMagia >= CyRetangulo){
        xRetangulo = CxRetangulo
        yRetangulo = CyRetangulo
    } else if (cxMagia >= DxRetangulo && cyMagia <= DyRetangulo){
        xRetangulo = DxRetangulo
        yRetangulo = DyRetangulo
    } else {
        return raioMagia.toDouble()
    }

    return sqrt((xRetangulo - cxMagia).toDouble().pow(2) + (yRetangulo - cyMagia).toDouble().pow(2))

}
