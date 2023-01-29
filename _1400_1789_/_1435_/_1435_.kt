fun main() {

    var N: Int
    var arr: Array<IntArray>
    var valorMatriz: Int
    var iMatriz: Int
    var iMatrizFinal: Int
    var jMatriz: Int
    var jMatrizFinal: Int
    var metadeMatriz: Int


    do {

        N = readLine()?.toInt()!!
        arr = Array(N) { r -> IntArray(N) }

        if (N == 0) {
            break
        }

        valorMatriz = 1
        iMatriz = 0
        jMatriz = 0
        iMatrizFinal = N
        jMatrizFinal = N
        metadeMatriz = N / 2 + 1

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


        for (i in 0 until N) {
            print("   ")
            for (j in 0 until N) {
                if (j == N - 1) {
                    print("${arr[i][j]}")
                } else {
                    print("${arr[i][j]} ")
                }
            }
            println()
        }

        println()

    } while (true)

}

