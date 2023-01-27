
fun main(){

    val rows = 12
    val cols = 12

    val T = readLine()
    var quantidadeSoma = 0
    var total: Double = 0.0

    val arr = Array(rows) { r -> DoubleArray(cols) { readLine()!!.toDouble() } }

    var metadeColuna: Int  = (arr.size / 2) - 1
    var posicaoMatrix = 11

    for (i in 0 until rows) {
        for (j in 0 until cols) {

            if (j > posicaoMatrix){
                total += arr[i][j]
                quantidadeSoma++
            }

        }

        if (i > metadeColuna ) {
            posicaoMatrix++
        } else if (i < metadeColuna) {
            posicaoMatrix--
        }

    }

    if (T == "S") {
        println("%.1f".format(total))
    } else if (T == "M") {
        println("%.1f".format(total / quantidadeSoma))
    }

}