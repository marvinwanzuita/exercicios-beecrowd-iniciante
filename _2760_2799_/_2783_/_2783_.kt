package beecrowd.iniciante._2760_2799_._2783_

fun main(){

    var (totalFigurinhasString, figurinhasCarimbadasString, figurinhasCompradasString) = readLine()!!.split(" ")

    var numerosFigurinhasCarimbadasString = readLine()
    var numerosFigurinhasCarimbadasArray = numerosFigurinhasCarimbadasString!!.split(" ")

    numerosFigurinhasCarimbadasArray.forEach { it.toInt() }

    var numerosFigurinhasCompradasString = readLine()
    var numerosFigurinhasCompradasArray = numerosFigurinhasCompradasString!!.split(" ")

    var figurinhasCarimbadasFaltantes = 0

    numerosFigurinhasCarimbadasArray.forEach {
        if (!numerosFigurinhasCompradasArray.contains(it)){
            figurinhasCarimbadasFaltantes++
        }
    }

    println(figurinhasCarimbadasFaltantes)

}