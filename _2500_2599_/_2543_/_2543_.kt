package beecrowd.iniciante._2500_2599_._2543_

import java.util.*

fun main(){

    val sc = Scanner(System.`in`)

    var gameplaysIdentificador : String
    var gameplaysIdentificadorArray : Array<String>

    var numeroGameplays: Int
    var identificadorUniversidade : Int

    var gameplaysPublicadosEIdentificador : String
    var gameplaysPublicadosEIdentificadorArray : Array<String>

    var identificadorGameplayPublicado : Int
    var gamePublicado : Int

    var totalGameplaysPublicados : Int

    while (sc.hasNext()) {

        gameplaysIdentificador = sc.nextLine()
        gameplaysIdentificadorArray = gameplaysIdentificador.split(" ").toTypedArray()
        numeroGameplays = gameplaysIdentificadorArray[0].toInt()
        identificadorUniversidade = gameplaysIdentificadorArray[1].toInt()

        totalGameplaysPublicados = 0

        for (i in 0 until numeroGameplays) {

            gameplaysPublicadosEIdentificador = sc.nextLine()
            gameplaysPublicadosEIdentificadorArray = gameplaysPublicadosEIdentificador.split(" ").toTypedArray()

            identificadorGameplayPublicado = gameplaysPublicadosEIdentificadorArray[0].toInt()
            gamePublicado = gameplaysPublicadosEIdentificadorArray[1].toInt()


            if (identificadorGameplayPublicado == identificadorUniversidade && gamePublicado == 0) totalGameplaysPublicados++

        }

        println(totalGameplaysPublicados)

    }

}