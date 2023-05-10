package beecrowd.iniciante._2600_2699_._2686_

import java.util.*

fun main(){

    val sc = Scanner(System.`in`)
    var grauSolLua : Double
    var saudacao : String
    var horarioConvertido : String

    fun converterAnguloParaHoraMinutoSegundo(angulo: Double): String {
        val totalSegundos = (angulo * 240).toInt()
        var horas = totalSegundos / 3600 + 6
        val minutos = (totalSegundos % 3600) / 60
        val segundos = (totalSegundos % 3600) % 60

        if (horas >= 24){
            horas -= 24
        }

        return String.format("%02d:%02d:%02d", horas, minutos, segundos)
    }

    while (sc.hasNext()){

        grauSolLua = sc.nextLine().toDouble()

        saudacao = when(grauSolLua){
            in 0.0..89.9 -> "Bom Dia!!"
            in 90.0..179.9 -> "Boa Tarde!!"
            in 180.0..269.9 -> "Boa Noite!!"
            in 270.0..359.9 -> "De Madrugada!!"
            360.0 -> "Bom Dia!!"
            else -> "Entrada Inválida!!"
        }

        horarioConvertido = converterAnguloParaHoraMinutoSegundo(grauSolLua)

        println(saudacao)
        println(horarioConvertido)

    }



}