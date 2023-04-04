package beecrowd.iniciante._2200_2499_._2311_

fun main(){

    var quantidadeAtletas = readLine()!!.toInt()

    var nomeAtleta : String
    var notaPartida : Double
    var notas : String
    var notasLista : MutableList<String>
    var notasDouble : MutableList<Double>

    var notaMaxima : Double?
    var notaMinima : Double?
    var totalNotas : Double
    var notaFinal : Double

    for (i in 0 until quantidadeAtletas){

        totalNotas = 0.0

        nomeAtleta = readLine().toString()
        notaPartida = readLine()!!.toDouble()

        notas = readLine().toString()
        notasLista = notas.split(" ") as MutableList<String>

        notasDouble = notasLista.map { it.toDouble() } as MutableList<Double>

        notaMaxima = notasDouble.max()
        notasDouble.remove(notaMaxima)

        notaMinima = notasDouble.min()
        notasDouble.remove(notaMinima)

        for (n in notasDouble){
            totalNotas += n
        }

        notaFinal = totalNotas * notaPartida

        println("$nomeAtleta ${String.format("%.2f", notaFinal)}")

    }

}