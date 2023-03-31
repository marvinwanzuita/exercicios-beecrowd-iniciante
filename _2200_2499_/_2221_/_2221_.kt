package beecrowd.iniciante._2200_2499_._2221_

fun main(){

    var instancias = readLine()!!.toInt()

    var bonus : Int
    var ataqueDefesaLevelTreinador : String
    var ataqueDefesaLevelTreinadorArray : Array<String>

    var ataque : Int
    var defesa : Int
    var levelTreinador : Int

    var valorGolpeDabriel = 0.0
    var valorGolpeGuarte = 0.0

    for (i in 0 until instancias){
        bonus = readLine()!!.toInt()

        for (i in 0 until 2){

            ataqueDefesaLevelTreinador = readLine().toString()
            ataqueDefesaLevelTreinadorArray = ataqueDefesaLevelTreinador.split(" ").toTypedArray()
            ataque = ataqueDefesaLevelTreinadorArray[0].toInt()
            defesa = ataqueDefesaLevelTreinadorArray[1].toInt()
            levelTreinador = ataqueDefesaLevelTreinadorArray[2].toInt()
            if (i == 0) {
                valorGolpeDabriel = calcularValorGolpe(ataque, defesa, levelTreinador, bonus)
            } else {
                valorGolpeGuarte = calcularValorGolpe(ataque, defesa, levelTreinador, bonus)
            }

        }

        if (valorGolpeDabriel > valorGolpeGuarte){
            println("Dabriel")
        } else if (valorGolpeDabriel < valorGolpeGuarte){
            println("Guarte")
        } else {
            println("Empate")
        }

    }

}

fun calcularValorGolpe(ataque: Int, defesa: Int, levelTreinador: Int, bonus: Int) : Double {
    return if (levelTreinador % 2 == 0){
        ((ataque + defesa) / 2.0) + bonus
    } else {
        (ataque + defesa) / 2.0
    }
}