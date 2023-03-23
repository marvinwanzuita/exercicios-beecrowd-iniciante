package beecrowd.iniciante._2100_2199_._2163_

fun main(){

    var tamanhoMatriz = readLine().toString()
    var tamanhoMatrizArray = tamanhoMatriz.split(" ")

    var ladoX = tamanhoMatrizArray[0].toInt()
    var ladoY = tamanhoMatrizArray[1].toInt()

    val matriz = Array(ladoX) { arrayOfNulls<Int>(ladoY) }

    var coordenadaX : Int
    var coordenadaY : Int
    var coordenadaSabre = "0 0"

    var entradasMatriz : String
    var entradasMatrizArray : Array<String>

    for (i in 0 until ladoX){
        entradasMatriz = readLine().toString()
        entradasMatrizArray = entradasMatriz.split(" ").toTypedArray()
        for (j in 0 until ladoY){
            matriz[i][j] = entradasMatrizArray[j].toInt()
        }
    }

    for (i in 0 until ladoX){
        for (j in 0 until ladoY){
           if (matriz[i][j] == 42){

               try {
                   if (matriz[i-1][j-1]!!.toInt() != 7) continue
                   if (matriz[i-1][j]!!.toInt() != 7) continue
                   if (matriz[i-1][j+1]!!.toInt() != 7) continue
                   if (matriz[i][j-1]!!.toInt() != 7) continue
                   if (matriz[i][j+1]!!.toInt() != 7) continue
                   if (matriz[i+1][j-1]!!.toInt() != 7) continue
                   if (matriz[i+1][j]!!.toInt() != 7) continue
                   if (matriz[i+1][j+1]!!.toInt() != 7) continue
               } catch (e: ArrayIndexOutOfBoundsException){
                   continue
               }

               coordenadaX = i + 1
               coordenadaY = j + 1
               coordenadaSabre = "$coordenadaX $coordenadaY"
               break

           }
        }
        if (coordenadaSabre != "0 0"){
            break
        }
    }

    println(coordenadaSabre)



}

