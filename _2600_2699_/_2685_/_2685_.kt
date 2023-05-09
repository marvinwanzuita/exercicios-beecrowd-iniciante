package beecrowd.iniciante._2600_2699_._2685_

import java.util.*

fun main(){

    val sc = Scanner(System.`in`)
    var grauSolLua : Int
    var saudacao : String

    while (sc.hasNext()){

        grauSolLua = sc.nextLine().toInt()

        saudacao = when(grauSolLua){
            in 0..89 -> "Bom Dia!!"
            in 90..179 -> "Boa Tarde!!"
            in 180..269 -> "Boa Noite!!"
            in 270..359 -> "De Madrugada!!"
            360 -> "Bom Dia!!"
            else -> "Entrada Inválida!!"
        }

        println(saudacao)

    }


}