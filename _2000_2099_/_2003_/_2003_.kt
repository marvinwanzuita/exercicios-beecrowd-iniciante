package beecrowd.iniciante._2000_2099_._2003_

import java.util.*


fun main(){

    val s = Scanner(System.`in`)
    var horaEMinutoAcordou : String
    var horaArray : Array<String>

    var horas : Int
    var minutos : Int
    var horasEmMinutosAcordou : Int

    var minutosAtrasado : Int

    while(s.hasNext()){

        horaEMinutoAcordou = s.nextLine()
        horaArray = horaEMinutoAcordou.split(":").toTypedArray()

        horas = horaArray[0].toInt()
        minutos = horaArray[1].toInt()

        horasEmMinutosAcordou = ((horas - 5) * 60) + minutos

        minutosAtrasado = horasEmMinutosAcordou - 120

        if (minutosAtrasado < 0){
            minutosAtrasado = 0
        }

        println("Atraso maximo: $minutosAtrasado")

    }


}