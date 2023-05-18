package beecrowd.iniciante._2700_2759_._2721_

fun main(){

    var quantidadeBolas : String? = readLine()
    var quantidadeBolasArray = quantidadeBolas!!.split(" ").toTypedArray()

    var totalBolas = 0

    quantidadeBolasArray.forEach { totalBolas += it.toInt() }

    var posicaoDecidida = totalBolas % 9

    var renaVencedora = when(posicaoDecidida.toInt()){
        1 -> "Dasher"
        2 -> "Dancer"
        3 -> "Prancer"
        4 -> "Vixen"
        5 -> "Comet"
        6 -> "Cupid"
        7 -> "Donner"
        8 -> "Blitzen"
        9, 0 -> "Rudolph"
        else -> ""
    }

    println(renaVencedora)



}

