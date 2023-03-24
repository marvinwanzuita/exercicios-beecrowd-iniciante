package beecrowd.iniciante._2100_2199_._2164_

fun main(){

    val n = readLine()!!.toLong()
    val fibonacciNumber = fibonacci(n)
    println(String.format("%.1f", fibonacciNumber))


}

fun fibonacci(n: Long): Double {
    val sqrt5 = Math.sqrt(5.0)
    val phi = (1 + sqrt5) / 2
    return ((Math.pow(phi, n.toDouble()) - Math.pow(1 - phi, n.toDouble())) / sqrt5).toDouble()
}
