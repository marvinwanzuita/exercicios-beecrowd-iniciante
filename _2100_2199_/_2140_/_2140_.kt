package beecrowd.iniciante._2100_2199_._2140_

fun main(){

    var entrada: String
    var entradaArray: Array<String>
    val notas = arrayOf(100, 50, 20, 10, 5, 2)

    var valorCompra : Int
    var valorPago : Int
    var valorTroco : Int
    var quantidadeNotas : Int

    while (true){

        entrada = readLine().toString()

        if (entrada == "0 0") break

        entradaArray = entrada.split(" ").toTypedArray()

        valorCompra = entradaArray[0].toInt()
        valorPago = entradaArray[1].toInt()

        quantidadeNotas = 0
        valorTroco = valorPago - valorCompra

        for (i in notas.indices){
            if (valorTroco - notas[i] >= 0){

                valorTroco -= notas[i]
                quantidadeNotas++

                if (valorTroco <= 0){
                    break
                }
            }

        }

        if (quantidadeNotas == 2){
            println("possible")
        } else {
            println("impossible")
        }

    }


}