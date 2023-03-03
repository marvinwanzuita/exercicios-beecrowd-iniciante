package beecrowd.iniciante._1900_1999_._1985_

fun main(){

    var quantidadeProdutos = readLine()!!.toInt()

    var codigoQuantidade : String
    var codigoQuantidadeArray : Array<String>
    var codigo : Int
    var quantidade : Int
    var total = 0.0

    for (i in 0 until quantidadeProdutos){

        codigoQuantidade = readLine().toString()
        codigoQuantidadeArray = codigoQuantidade.split(" ").toTypedArray()

        codigo = codigoQuantidadeArray[0].toInt()
        quantidade = codigoQuantidadeArray[1].toInt()

        total += calcularPreco(codigo, quantidade)

    }

    println(String.format("%.2f", total))

}

fun calcularPreco(codigo: Int, quantidade: Int) : Double{

    var precoProduto = when(codigo){
        1001 -> 1.50
        1002 -> 2.50
        1003 -> 3.50
        1004 -> 4.50
        1005 -> 5.50
        else -> 0.0
    }

    return precoProduto * quantidade

}