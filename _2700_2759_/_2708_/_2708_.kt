package beecrowd.iniciante._2700_2759_._2708_

fun main(){

    var jipesPassageiros : String
    var jipesPassageirosArray : Array<String>

    var jipes : String
    var passageiros : Int

    var passageirosQueFaltamRetornar = 0
    var jipesQueFaltamRetornar = 0

    while (true){

        jipesPassageiros = readLine().toString()
        if (jipesPassageiros == "ABEND") break

        jipesPassageirosArray = jipesPassageiros.split(" ").toTypedArray()

        jipes = jipesPassageirosArray[0]
        passageiros = jipesPassageirosArray[1].toInt()

        if (jipes == "SALIDA"){
            jipesQueFaltamRetornar++
            passageirosQueFaltamRetornar += passageiros
        }
        if (jipes == "VUELTA") {
            jipesQueFaltamRetornar--
            passageirosQueFaltamRetornar -= passageiros
        }

    }

    println(passageirosQueFaltamRetornar)
    println(jipesQueFaltamRetornar)


}