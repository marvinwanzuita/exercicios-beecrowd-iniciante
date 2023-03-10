package beecrowd.iniciante._2000_2099_._2059_

fun main(){

    val entrada = readLine().toString()
    val entradaArray = entrada.split(" ")

    val p = entradaArray[0].toInt()
    val j1 = entradaArray[1].toInt()
    val j2 = entradaArray[2].toInt()
    val r = entradaArray[3].toInt()
    val a = entradaArray[4].toInt()

    val ganhador : String
    val j1Ganhou = "Jogador 1 ganha!"
    val j2Ganhou = "Jogador 2 ganha!"

    val total = j1 + j2

    ganhador = if (r == 1 && a == 1){
        j2Ganhou
    } else if (r == 1 && a == 0){
        j1Ganhou
    } else if (r == 0 && j2 == 1){
        j1Ganhou
    } else {
        if (total % 2 == 0 && p == 1 || total % 2 != 0 && p == 0){
            j1Ganhou
        } else {
            j2Ganhou
        }
    }

    println(ganhador)


}