package beecrowd.iniciante._2600_2699_._2635_

fun main(){

    var listaPalavrasPesquisadas  = mutableListOf<String>()
    var listaPalavrasConsultadas = mutableListOf<String>()

    var quantidadePalavrasSugeridas : Int
    var comprimentoMaiorPalavra : Int

    var quantidadePalavrasPesquisadas : Int = readLine()!!.toInt()

    for (i in 0 until quantidadePalavrasPesquisadas){
      listaPalavrasPesquisadas.add(readLine().toString())
    }

    var quantidadePalavrasConsultadas  = readLine()!!.toInt()

    for (i in 0 until quantidadePalavrasConsultadas){
        listaPalavrasConsultadas.add(readLine().toString())

    }


    for (palavraConsultada in listaPalavrasConsultadas){

        quantidadePalavrasSugeridas = 0
        comprimentoMaiorPalavra = 0

        for (palavraPesquisada in listaPalavrasPesquisadas){

            if (palavraPesquisada.startsWith(palavraConsultada)){
                quantidadePalavrasSugeridas++
                if (comprimentoMaiorPalavra == 0){
                    comprimentoMaiorPalavra = palavraPesquisada.length
                    continue
                }

                if (comprimentoMaiorPalavra < palavraPesquisada.length){
                    comprimentoMaiorPalavra = palavraPesquisada.length
                }

            }

        }

        if (quantidadePalavrasSugeridas == 0){
            println(-1)
        } else {
            println("$quantidadePalavrasSugeridas $comprimentoMaiorPalavra")
        }

    }





}