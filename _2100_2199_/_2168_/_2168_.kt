package beecrowd.iniciante._2100_2199_._2168_

fun main(){

    var quantidadeQuadras = readLine()!!.toInt()
    var quadrasString : String
    var quadrasArray: Array<String>
    var quadras = Array(quantidadeQuadras + 1) { Array(quantidadeQuadras + 1) { 0 } }

    var cameras : Int
    var quadraSeguraInsegura : String

    for (i in 0..quantidadeQuadras){
        quadrasString = readLine().toString()
        quadrasArray = quadrasString.split(" ").toTypedArray()
        for (j in 0 .. quantidadeQuadras){
            quadras[i][j] = quadrasArray[j].toInt()
        }
    }

    for (i in 0 until quantidadeQuadras){

        quadraSeguraInsegura = ""
        for (j in 0 until quantidadeQuadras){
            cameras = 0
            if (quadras[i][j] == 1) cameras++
            if (quadras[i][j+1] == 1) cameras++
            if (quadras[i+1][j] == 1) cameras++
            if (quadras[i+1][j+1] == 1) cameras++

            quadraSeguraInsegura += if (cameras >= 2) "S" else "U"


        }
        println(quadraSeguraInsegura)
    }

}
