package beecrowd.iniciante._2760_2799_._2786_

fun main(){

    var largura = readLine()!!.toInt()
    var comprimento = readLine()!!.toInt()

    var totalLajotas1 = 0
    var totalLajotas2 = 0


    totalLajotas1 = largura * comprimento + ((largura - 1) * (comprimento - 1))
    totalLajotas2 = ((largura - 1) * 2) + ((comprimento - 1) * 2)

    println(totalLajotas1)
    println(totalLajotas2)

}