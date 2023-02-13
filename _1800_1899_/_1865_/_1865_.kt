package beecrowd.iniciante._1800_1899_._1865_

fun main(){

    val C = readLine()?.toInt()

    var nomesForca: String
    var nomesForcaArray: Array<String>

    var nome: String
    var forca: Int

    for (i in 0 until C!!){

        nomesForca = readLine().toString()
        nomesForcaArray = nomesForca.split(" ").toTypedArray()

        nome = nomesForcaArray[0]
        forca = nomesForcaArray[1].toInt()

        if (nome == "Thor"){
            println("Y")
        } else {
            println("N")
        }

    }



}

