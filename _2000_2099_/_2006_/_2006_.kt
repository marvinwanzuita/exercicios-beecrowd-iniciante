package beecrowd.iniciante._2000_2099_._2006_

fun main(){

    var chaServido = readLine()!!.toInt()

    var respostaCompetidores = readLine().toString()
    var respostaCompetidoresArray = respostaCompetidores.split(" ")

    var respostasCertas = 0

    for (i in respostaCompetidoresArray.indices){

        if (chaServido == respostaCompetidoresArray[i].toInt()){
            respostasCertas++
        }

    }

    println(respostasCertas)

}