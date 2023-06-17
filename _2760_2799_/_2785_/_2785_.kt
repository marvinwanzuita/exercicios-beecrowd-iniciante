package beecrowd.iniciante._2760_2799_._2785_

fun main(){

    var tamanhoMatriz = readLine()!!.toInt()

    var numerosMatrizString : String
    var numerosMatrizArray : Array<String>

    var matriz = Array(tamanhoMatriz) { IntArray(tamanhoMatriz) }

    for (i in 0 until tamanhoMatriz){
        numerosMatrizString = readLine().toString()
        numerosMatrizArray = numerosMatrizString.split(" ").toTypedArray()

        for (j in 0 until tamanhoMatriz){
            matriz[i][j] = numerosMatrizArray[j].toInt()
        }
    }

    var listaResultados = mutableListOf<Int>()
    var totalPeso : Int
    var indiceTentativa : Int
    var indiceCaixaAcima : Int
    var caixasParaSomar : Int

    for (tentativas in 0 until tamanhoMatriz){

        totalPeso = 0
        caixasParaSomar = 1
        indiceTentativa = 0
        indiceCaixaAcima = 0

        for (i in 0 until tamanhoMatriz){

            for (j in 0 until tamanhoMatriz){

                if (indiceTentativa == j && i == 0){
                    totalPeso += matriz[i][j]
                    indiceCaixaAcima = i
                    caixasParaSomar++
                    continue
                }








            }
        }

    }






}