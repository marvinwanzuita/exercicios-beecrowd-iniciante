fun main(){

    val rows = 12
    val cols = 12

    val T = readLine()
    var quantidadeSoma = 0
    var total: Double = 0.0
    var indicarColuna: Int

    val arr = Array(rows) { r -> DoubleArray(cols) { readLine()!!.toDouble() } }

    indicarColuna = arr.size - 1

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            if (j < indicarColuna) {
                total += arr[i][j]
                quantidadeSoma++
            }
        }
        indicarColuna--
    }

    if (T == "S") {
        println("%.1f".format(total))
    } else if (T == "M") {
        println("%.1f".format(total / quantidadeSoma))
    }

}