package beecrowd.iniciante._2200_2499_._2344_

fun main(){

    var nota = readLine()!!.toInt()

    var notaConvertida = when(nota){
        0 -> 'E'
        in 1..35 -> 'D'
        in 36..60 -> 'C'
        in 61..85 -> 'B'
        in 86..100 -> 'A'
        else -> {'F'}
    }

    println(notaConvertida)

}