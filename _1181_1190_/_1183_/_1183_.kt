fun main(){

    val rows = 12
    val cols = 12

    val T = readLine()
    var quantidadeSoma = 0
    var total: Double = 0.0

    var arr = Array(rows) { r -> DoubleArray(cols) { readLine()!!.toDouble() } }

    for (i in 0 until rows) {

        for (j in 0 until cols) {

            if (j > i) {
                total += arr[i][j]
                quantidadeSoma++
            }
        }

    }

    if (T == "S") {
        println("%.1f".format(total))
    } else if (T == "M") {
        println("%.1f".format(total / quantidadeSoma))
    }

}