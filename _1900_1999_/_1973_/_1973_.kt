package beecrowd.iniciante._1900_1999_._1973_

fun main(){

    var N = readLine()!!.toInt()

    var estrela = readLine().toString()
    var estrelaArray = estrela.split(" ")
    var estrelaInt = LongArray(N)
    var estrelaAtacadasArray = LongArray(N)

    var estrelaAtual = 0
    var totalCarneiros = 0L
    var estrelaAtacadas = 0

    for (i in 0 until N){
        estrelaInt[i] = estrelaArray[i].toLong()
        estrelaAtacadasArray[i] = 0
    }

    while (true){

        if (estrelaInt[estrelaAtual] % 2 != 0L){
            if (estrelaInt[estrelaAtual] > 0){
                estrelaInt[estrelaAtual]--
            }

            estrelaAtacadasArray[estrelaAtual] = 1
            estrelaAtual++

        } else {
            if (estrelaInt[estrelaAtual] > 0){
                estrelaInt[estrelaAtual]--
            }

            estrelaAtacadasArray[estrelaAtual] = 1
            estrelaAtual--

        }

        if (estrelaAtual >= estrelaInt.size || estrelaAtual < 0){
            break
        }

    }

    for (carneiro in estrelaInt){
        totalCarneiros += carneiro
    }

    for (estrelaAtacada in estrelaAtacadasArray){
        if (estrelaAtacada == 1L){
            estrelaAtacadas++
        }
    }

    println("$estrelaAtacadas $totalCarneiros")


}


