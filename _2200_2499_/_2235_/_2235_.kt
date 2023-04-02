package beecrowd.iniciante._2200_2499_._2235_

fun main(){

    var entradas = readLine().toString()
    var entradasArray = entradas.split(" ")

    var c1 = entradasArray[0].toInt()
    var c2 = entradasArray[1].toInt()
    var c3 = entradasArray[2].toInt()

    var possivelVoltarAoPresente = 'S'

    while (true){

        if (c1 - c2 == 0) break
        if (c2 - c3 == 0) break
        if (c1 - c3 == 0) break

        if ((c1 + c2 - c3) == 0) break

        if ((c1 + c3 - c2) == 0) break

        if ((c2 + c3 - c1) == 0) break

        possivelVoltarAoPresente = 'N'
        break
    }

    println(possivelVoltarAoPresente)


}