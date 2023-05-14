package beecrowd.iniciante._2700_2759_._2712_

fun main() {

    var quantidadePlacas = readLine()!!.toInt()
    var placa: String

    fun diaRodizioPlaca(placa: String): String {
        val ultimoChar = placa.last().toString()
        return when (ultimoChar.toInt()) {
            1, 2 -> "MONDAY"
            3, 4 -> "TUESDAY"
            5, 6 -> "WEDNESDAY"
            7, 8 -> "THURSDAY"
            9, 0 -> "FRIDAY"
            else -> "FAILURE"
        }
    }

    for (i in 0 until quantidadePlacas) {

        placa = readLine().toString()

        if (placa.length > 8) {
            println("FAILURE")
            continue
        }

        try {
            if (placa.take(3).all { it.isUpperCase() }) {

                if (placa[3] == '-') {

                    if (placa.substring(4, 8).all { it.isDigit() }) {
                        println(diaRodizioPlaca(placa))
                    } else {
                        println("FAILURE")
                        continue
                    }

                } else {
                    println("FAILURE")
                    continue
                }

            } else {
                println("FAILURE")
                continue
            }
        } catch (e: java.lang.Exception){
            println("FAILURE")
            continue
        }


    }


}