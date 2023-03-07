package beecrowd.iniciante._2000_2099_._2029_

import java.text.DecimalFormat
import java.util.*
import kotlin.math.floor

fun main(){

    var s = Scanner(System.`in`)
    var medidasEntrada = mutableListOf<Double>()

    val PI = 3.14
    var volume : Double
    var diametro : Double
    var altura : Double
    var raio : Double
    var areaBocaCilindro : Double

    var df = DecimalFormat("#0.00")

    var contadorEntradas = 0

    while(s.hasNext()) {
        medidasEntrada.add(s.nextDouble())
    }

    for (i in 0 until medidasEntrada.size step 2){


        volume = medidasEntrada[contadorEntradas]
        contadorEntradas++
        diametro = medidasEntrada[contadorEntradas]
        contadorEntradas++

        raio = diametro / 2

        altura = volume / (PI * (raio * raio))
        areaBocaCilindro = PI * (raio * raio)

        var dfAreaBocaCilindro = df.format(areaBocaCilindro)

        println("ALTURA = " + String.format("%.2f", altura))
        println("AREA = $dfAreaBocaCilindro")


    }


}