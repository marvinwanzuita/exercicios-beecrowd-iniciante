package beecrowd.iniciante._2100_2199_._2172_

fun main(){

    var entrada : String
    var entradaArray : Array<String>
    var multiplicador : Int
    var experiencia : Long

    while (true){

        entrada = readLine().toString()
        entradaArray = entrada.split(" ").toTypedArray()
        multiplicador = entradaArray[0].toInt()
        experiencia = entradaArray[1].toLong()

        if (multiplicador == 0 && experiencia == 0L) break

        println(multiplicador * experiencia)

    }


}