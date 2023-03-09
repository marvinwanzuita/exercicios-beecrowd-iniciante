package beecrowd.iniciante._2000_2099_._2057_

fun main(){

    val entrada = readLine().toString()
    val entradaArray = entrada.split(" ")

    val horaSaida = entradaArray[0].toInt()
    val tempoViagem = entradaArray[1].toInt()
    val fusoHorario = entradaArray[2].toInt()

    var horaChegada = horaSaida + tempoViagem + fusoHorario

    if (horaChegada >= 24){
        horaChegada -= 24
    }
    if (horaChegada < 0){
        horaChegada += 24
    }

    println(horaChegada)

}