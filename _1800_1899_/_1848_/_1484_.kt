package beecrowd.iniciante._1800_1899_._1848_

fun main(){

    var piscadas: String
    var totalPiscada: Int

    for (i in 0 until 3){

        totalPiscada = 0

        while (true){

            piscadas = readLine().toString()

            if (piscadas == "caw caw"){
                break
            }

            if (piscadas[0].toChar() == '*') totalPiscada += 4
            if (piscadas[1].toChar() == '*') totalPiscada += 2
            if (piscadas[2].toChar() == '*') totalPiscada += 1

        }

        println(totalPiscada)

    }

}