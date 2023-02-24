package beecrowd.iniciante._1900_1999_._1961_

fun main(){

    var PN = readLine().toString()
    val PNArray = PN.split(" ")

    var P = PNArray[0].toInt()
    var N = PNArray[1].toInt()

    var canos = readLine().toString()
    var canosArray = canos.split(" ")

    var canoAnterior: Int
    var canoAtual: Int

    var resultado = "YOU WIN"

    for (i in 1 until N){

        canoAnterior = canosArray[i - 1].toInt()
        canoAtual = canosArray[i].toInt()

        if (canoAnterior > canoAtual){
            val aux = canoAnterior
            canoAnterior = canoAtual
            canoAtual = aux
        }

        if ((canoAtual - canoAnterior) > P){
            resultado = "GAME OVER"
            break
        }

    }

    println(resultado)

}