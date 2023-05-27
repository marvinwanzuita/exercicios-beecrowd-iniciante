package beecrowd.iniciante._2700_2759_._2753_

fun main(){

    var numero = 97
    val alfabeto = arrayOf(
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    )

    for (i in alfabeto.indices){
        println("$numero e ${alfabeto[i]}")
        numero++
    }



}