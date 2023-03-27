package beecrowd.iniciante._2100_2199_._2167_

fun main(){

    var numeroVelocidades = readLine()!!.toInt()
    var rotacoes = readLine().toString()
    var rotacoesArray = rotacoes.split(" ")
    var indiceQuedaRotacao = 0

    for (i in 0 until numeroVelocidades){

        if (i == 0) continue
        if (rotacoesArray[i].toInt() < rotacoesArray[i - 1].toInt()){
            indiceQuedaRotacao = i + 1
            break
        }

    }

    println(indiceQuedaRotacao)


}