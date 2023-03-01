package beecrowd.iniciante._1900_1999_._1983_

fun main(){

    var N = readLine()!!.toInt()

    var alunosNotas : String
    var alunosNotasArray : Array<String>

    var nota : Double

    var matriculaAlunoMaiorNota = "Minimum note not reached"
    var maiorNota = 0.0


    for (i in 0 until N){

        alunosNotas = readLine().toString()
        alunosNotasArray = alunosNotas.split(" ").toTypedArray()

        nota = alunosNotasArray[1].toDouble()

        if (nota >= 8){

            if (nota > maiorNota){
                maiorNota = nota
                matriculaAlunoMaiorNota = alunosNotasArray[0]
            }

        }

    }

    println(matriculaAlunoMaiorNota)


}