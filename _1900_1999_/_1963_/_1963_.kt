package beecrowd.iniciante._1900_1999_._1963_

fun main(){

    var AB = readLine().toString()
    val ABArray = AB.split(" ")

    var A = ABArray[0].toDouble()
    var B = ABArray[1].toDouble()

    var diferencaAB = B - A
    var resultado = (diferencaAB * 100) / A

    println(String.format("%.2f", resultado) + "%")

}