package beecrowd.iniciante._2100_2199_._2139_

import java.util.*

fun main(){

    var s = Scanner(System.`in`)

    var entradas = mutableListOf<String>()
    var mesDia : Array<String>
    var dia : Int
    var mes : Int

//    for (i in 0 until 19){
//        entradas.add(readLine().toString())
//    }

    while(s.hasNext()) {
        entradas.add(readLine().toString())
    }

    for (i in 0 until entradas.size){

        mesDia = entradas[i].split(" ").toTypedArray()
        mes = mesDia[0].toInt()
        dia = mesDia[1].toInt()

        if (dia == 25 && mes == 12){
            println("E natal!")
        } else if (dia == 24 && mes == 12){
            println("E vespera de natal!")
        } else if (mes == 12 && dia > 25){
            println("Ja passou!")
        } else {
            println("Faltam ${calcularDiasProNatal(dia, mes)} dias para o natal!")
        }

    }

    s.close()

}

fun calcularDiasProNatal(dia: Int, mes: Int): Int{

    return when(mes){
        12 -> (25 - dia)
        11 -> (30 - dia) + 25
        10 -> (31 - dia) + 55
         9 -> (30 - dia) + 86
         8 -> (31 - dia) + 116
         7 -> (31 - dia) + 147
         6 -> (30 - dia) + 178
         5 -> (31 - dia) + 208
         4 -> (30 - dia) + 239
         3 -> (31 - dia) + 269
         2 -> (29 - dia) + 300
         1 -> (31 - dia) + 329
        else -> 0
    }

}