package beecrowd.iniciante._1800_1899_._1837_

fun main(){

    val abString = readLine().toString()
    val abStringArray = abString.split(" ")

    var a = abStringArray[0].toInt()
    var b = abStringArray[1].toInt()

    var totalMultiplicacaoB = 1
    var qMultiplicadoB = 1

    var aPositivo: Int

    val q = a / b
    var r = a - (b * q)

    if(r < 0){

        if (a < 0 && b > 0){
            a *= -1
            while (true){
                totalMultiplicacaoB = b * qMultiplicadoB
                if (totalMultiplicacaoB > a){
                    break
                }
                qMultiplicadoB++
            }

            qMultiplicadoB *= -1

            r = (a * -1) - (b * qMultiplicadoB)

            println("$qMultiplicadoB $r")
        }

        if (a < 0 && b < 0){

            a *= -1
            b *= -1

            while (true){
                totalMultiplicacaoB = b * qMultiplicadoB
                if (totalMultiplicacaoB > a){
                    break
                }
                qMultiplicadoB++
            }

            r = (a * -1) - (b * qMultiplicadoB * -1)

            println("$qMultiplicadoB $r")
        }

    } else {
        println("$q $r")
    }






}