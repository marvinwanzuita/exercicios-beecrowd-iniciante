package beecrowd.iniciante._2100_2199_._2162_

fun main(){

    var numeroMedidas = readLine()
    var alturas = readLine().toString()
    var alturasArray = alturas.split(" ")

    var medidaAtual : Int
    var medidaAnterior : Int

    var pico = "pico"
    var vale = "vale"

    var relevo = mutableListOf<String>()

    var padraoNlogonia = 0

    var j = 1

    for (i in alturasArray.indices){

        if (i == 0) {
            padraoNlogonia = 1
            continue
        }

        medidaAtual = alturasArray[i].toInt()
        medidaAnterior = alturasArray[i - 1].toInt()

        if (i == 1){
            if (medidaAtual < medidaAnterior){
                padraoNlogonia = 1
                relevo.add(vale)
                continue
            } else if (medidaAtual > medidaAnterior) {
                relevo.add(pico)
                padraoNlogonia = 1
                continue
            } else {
                padraoNlogonia = 0
                break
            }
        }



        if (medidaAtual < medidaAnterior){
            padraoNlogonia = 1
            relevo.add(vale)
            if (relevo[j] == relevo[j - 1]){
                padraoNlogonia = 0
                break
            }
            j++
        } else if (medidaAtual > medidaAnterior) {
            relevo.add(pico)
            padraoNlogonia = 1
            if (relevo[j] == relevo[j - 1]){
                padraoNlogonia = 0
                break
            }
            j++
        } else {
            padraoNlogonia = 0
            break
        }

    }

    println(padraoNlogonia)


}