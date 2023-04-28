package beecrowd.iniciante._2500_2599_._2582_

fun main(){

    var musicasParaSelecionar : Int

    var botoesSelecionados : String
    var botoesSelecionadosArray : Array<String>

    var somaBotoes : Int

    fun selecionarMusica(somaBotoes : Int) : String{
        return when(somaBotoes){
            0 -> "PROXYCITY"
            1 -> "P.Y.N.G."
            2 -> "DNSUEY!"
            3 -> "SERVERS"
            4 -> "HOST!"
            5 -> "CRIPTONIZE"
            6 -> "OFFLINE DAY"
            7 -> "SALT"
            8 -> "ANSWER!"
            9 -> "RAR?"
            10 -> "WIFI ANTENNAS"
            else -> ""
        }
    }

    musicasParaSelecionar = readLine()!!.toInt()

    for (i in 0 until musicasParaSelecionar){

        botoesSelecionados = readLine().toString()
        botoesSelecionadosArray = botoesSelecionados.split(" ").toTypedArray()

        somaBotoes = botoesSelecionadosArray[0].toInt() + botoesSelecionadosArray[1].toInt()

        println(selecionarMusica(somaBotoes))

    }




}