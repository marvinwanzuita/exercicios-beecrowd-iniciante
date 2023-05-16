package beecrowd.iniciante._2700_2759_._2717_

fun main(){

    var minutosRestantes = readLine()!!.toInt()
    var minutosNecessarios = readLine()

    var (minutosPresente1, minutosPresente2) = minutosNecessarios!!.split(" ")

    var totalMinutosNecessarios = minutosPresente1.toInt() + minutosPresente2.toInt()

    if (totalMinutosNecessarios <= minutosRestantes){
        println("Farei hoje!")
    } else {
        println("Deixa para amanha!")
    }

}