fun main() {

    val rows = 12
    val cols = 12

    val L = readLine()!!.toInt()
    val T = readLine()
    var total: Double = 0.0

    var arr = Array(rows) { r -> DoubleArray(cols) { readLine()!!.toDouble() } }

    for (i in 0 until rows) {

        for (j in 0 until cols) {

            if (j == L) {

                total += arr[i][j]

            }
        }

    }

    if (T == "S") {
        println("%.1f".format(total))
    } else {
        println("%.1f".format(total / cols))
    }

}

