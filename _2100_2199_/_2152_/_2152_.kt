package beecrowd.iniciante._2100_2199_._2152_

fun main(){

    var casosTeste = readLine()!!.toInt()
    var entradaValores : String
    var entradaValoresArray: Array<String>
    var estadoPorta : String
    var saidaValores = mutableListOf<String>()

    var hora : String
    var minuto : String
    var porta : String

    for (i in 0 until casosTeste){

        entradaValores = readLine().toString()
        entradaValoresArray = entradaValores.split(" ").toTypedArray()

        hora = entradaValoresArray[0]
        minuto = entradaValoresArray[1]
        porta = entradaValoresArray[2]


        if (hora.toInt() < 10){
            hora = "0$hora"
        }

        if (minuto.toInt() < 10){
            minuto = "0$minuto"
        }

        if (porta == "1"){
            estadoPorta = "A porta abriu!"
        } else {
            estadoPorta = "A porta fechou!"
        }

        saidaValores.add("$hora:$minuto - $estadoPorta")

    }

    for (saida in saidaValores){
        println(saida)
    }


}