package beecrowd.iniciante._2200_2499_._2313_

fun main(){

    var (l1String, l2String, l3String) = readLine()!!.split(" ")

    var l1 = l1String.toInt()
    var l2 = l2String.toInt()
    var l3 = l3String.toInt()

    var resultado = ""

    if ((l1 + l2 > l3) && (l2 + l3 > l1) && (l1 + l3 > l2)){

        if (l1 == l2 && l2 == l3) resultado = "Valido-Equilatero"
        if (l1 != l2 && l2 != l3 && l1 != l3) resultado = "Valido-Escaleno"
        if (l1 == l2 && l1 != l3) resultado = "Valido-Isoceles"
        if (l1 == l3 && l1 != l2) resultado = "Valido-Isoceles"
        if (l2 == l3 && l2 != l1) resultado = "Valido-Isoceles"

        var maiorLado = maxOf(l1, l2, l3)
        var menorLado = minOf(l1, l2, l3)
        var medioLado = l1 + l2 + l3 - maiorLado - menorLado

        var trianguloRetangulo = (maiorLado * maiorLado) == ((medioLado * medioLado) + (menorLado * menorLado))

        println(resultado)
        if (trianguloRetangulo) println("Retangulo: S") else print("Retangulo: N" )

    } else {
        println("Invalido")
    }


}