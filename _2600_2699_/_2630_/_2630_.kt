package beecrowd.iniciante._2600_2699_._2630_

fun main(){

    var casosTeste = readLine()!!.toInt()

    var conversao : String?

    var rgbEntrada : String?
    var rgbArray : Array<String>

    var r : Int?
    var g : Int?
    var b : Int?

    var resultado : Int?

    for (i in 1..casosTeste){

        conversao = readLine()!!.toString()
        rgbEntrada = readLine()!!.toString()
        rgbArray = rgbEntrada.split(" ").toTypedArray()

        r = rgbArray[0].toInt()
        g = rgbArray[1].toInt()
        b = rgbArray[2].toInt()

        resultado = when(conversao){
            "min" -> minOf(r, g, b)
            "max" -> maxOf(r, g, b)
            "mean" -> (r + g + b) / 3
            "eye" -> ((0.30 * r) + (0.59 * g) + (0.11 * b)).toInt()
            else -> 0
        }

        println("Caso #$i: $resultado")

    }



}