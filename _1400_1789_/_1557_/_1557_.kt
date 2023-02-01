package beecrowd.iniciante._1400_1789_._1557_

fun main() {

    var N: Int
    var T: Int
    var entradaArray = mutableListOf<Int>()
    var indiceArray = 0
    var valorColuna: Int
    var valorLinha: Int
    var maiorValor: Int
    var maiorValorString = ""
    var arr = Array(0) { r -> IntArray(0) }

    do {
        T = readLine()?.toInt()!!
        if (T != 0){
            entradaArray.add(T)
        } else {
            break
        }

    } while (true)

    do {

        N = entradaArray[indiceArray]

        arr = Array(N) { r -> IntArray(N) }

        valorLinha = 1

        for (i in 0 until N) {

            valorColuna = valorLinha

            for (j in 0 until N) {
                arr[i][j] = valorColuna
                valorColuna *= 2
                if (i == j){
                    maiorValorString = arr[i][j].toString()
                }
            }

            valorLinha *= 2
        }

        maiorValor = maiorValorString.length


        for (i in 0 until N) {
            for (j in 0 until N) {
                if (j == N - 1) {
                    System.out.format("%" + maiorValor + "d",arr[i][j] )
                } else {
                    System.out.format("%" + maiorValor + "d ",arr[i][j] )
                }
            }
            println()
        }

        println()
        indiceArray++

        if (indiceArray >= entradaArray.size){
            break
        }
    } while (true)


}


