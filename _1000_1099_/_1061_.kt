package beecrowd.iniciante._1000_1099_

fun main(){

    var inicio = readLine().toString()
    var inicioArray = inicio.split(" ")

    var diaInicio = inicioArray[1].toInt()
    var horarioInicio = readLine().toString()
    var horarioInicioArray = horarioInicio.split(" ")

    var horaInicio = horarioInicioArray[0].toInt()
    var minutoInicio = horarioInicioArray[2].toInt()
    var segundoInicio = horarioInicioArray[4].toInt()

    var final = readLine().toString()
    var finalArray = final.split(" ")
    var diaFinal = finalArray[1].toInt()

    var horarioFinal = readLine().toString()
    var horarioFinalArray = horarioFinal.split(" ")

    var horaFinal = horarioFinalArray[0].toInt()
    var minutoFinal = horarioFinalArray[2].toInt()
    var segundoFinal = horarioFinalArray[4].toInt()

    var diasDuracao = 0
    var horasDuracao = 0
    var minutosDuracao = 0
    var segundosDuracao = 0


    if (segundoInicio <= segundoFinal){
        segundosDuracao = segundoFinal - segundoInicio
    } else {
        segundosDuracao = (60 - segundoInicio) + segundoFinal
        minutoInicio++
    }

    if (minutoInicio <= minutoFinal){
        minutosDuracao += minutoFinal - minutoInicio
    } else {
        minutosDuracao += (60 - minutoInicio ) + minutoFinal
        horaInicio++
    }

    if (horaInicio <= horaFinal){
        horasDuracao += horaFinal - horaInicio

    } else {
        horasDuracao += (24 - horaInicio) + horaFinal
        diaInicio++
    }

    diasDuracao += diaFinal - diaInicio

    println("$diasDuracao dia(s)")
    println("$horasDuracao hora(s)")
    println("$minutosDuracao minuto(s)")
    println("$segundosDuracao segundo(s)")

}