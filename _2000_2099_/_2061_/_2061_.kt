package beecrowd.iniciante._2000_2099_._2061_

fun main(){

    val abasAcoesEntrada = readLine().toString()
    val abasAcoesEntradaArray = abasAcoesEntrada.split(" ")

    var abas = abasAcoesEntradaArray[0].toInt()
    var acoes = abasAcoesEntradaArray[1].toInt()

    var acao : String

    for (i in 0 until acoes){

        acao = readLine().toString()

        if (acao == "clicou"){
            abas--
        } else {
            abas++
        }

    }

    println(abas)




}