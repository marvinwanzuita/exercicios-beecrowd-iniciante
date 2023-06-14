package beecrowd.iniciante._2760_2799_._2780_

fun main(){

    var distancia = readLine()!!.toInt()

    var pontos = when(distancia){
        in 0..800 -> 1
        in 801..1400 -> 2
        in 1401..2000 -> 3
        else -> 0
    }

    println(pontos)
}