package beecrowd.iniciante._2760_2799_._2763_

fun main(){

    var cpf = readLine().toString()

    var (cpf1, cpf2, cpf3) = cpf.split(".")

    var (cpf31, cpf32) = cpf3.split("-")

    println(cpf1)
    println(cpf2)
    println(cpf31)
    println(cpf32)


}