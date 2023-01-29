fun main() {

    var N: Int
    var entradaArray = mutableListOf<Int>()
    var arr: Array<IntArray>
    var indiceArray = 0
    var valorMatriz: Int
    var iMatriz: Int
    var iMatrizFinal: Int
    var jMatriz: Int
    var jMatrizFinal: Int
    var metadeMatriz: Int

    do {
        N = readLine()?.toInt()!!
        if (N != 0){
            entradaArray.add(N)
        } else {
            break
        }

    } while (true)


    do {

        arr = Array(entradaArray[indiceArray]) { r -> IntArray(entradaArray[indiceArray]) }


        valorMatriz = 1
        iMatriz = 0
        jMatriz = 0
        iMatrizFinal = entradaArray[indiceArray]
        jMatrizFinal = entradaArray[indiceArray]
        metadeMatriz = entradaArray[indiceArray] / 2 + 1

        do {

            for (i in iMatriz until iMatrizFinal) {

                for (j in jMatriz until jMatrizFinal) {

                    arr[i][j] = valorMatriz

                }

            }

            valorMatriz++
            iMatriz++
            jMatriz++
            iMatrizFinal--
            jMatrizFinal--

        } while (valorMatriz <= metadeMatriz)


        for (i in 0 until entradaArray[indiceArray]) {
            print("  ")
            for (j in 0 until entradaArray[indiceArray]) {
                if (j == entradaArray[indiceArray] - 1) {
                    print("${arr[i][j]}")
                } else {
                    print("${arr[i][j]}   ")
                }
            }
            println()
        }

        indiceArray++
        println()

    } while (indiceArray < entradaArray.size)

}

