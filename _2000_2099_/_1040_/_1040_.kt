package beecrowd.iniciante._2000_2099_._1040_

import java.text.DecimalFormat

fun main(){

    var alunoNotas = readLine().toString()
    var alunoNotasArray = alunoNotas.split(" ")

    var nota1 = alunoNotasArray[0].toDouble()
    var nota2 = alunoNotasArray[1].toDouble()
    var nota3 = alunoNotasArray[2].toDouble()
    var nota4 = alunoNotasArray[3].toDouble()

    var notaExame : Double

    var pesoNota1 = 2
    var pesoNota2 = 3
    var pesoNota3 = 4
    var pesoNota4 = 1

    var totalNotasComPeso = (nota1 * pesoNota1) + (nota2 * pesoNota2) + (nota3 * pesoNota3) + (nota4 * pesoNota4)
    var somaPesos = (pesoNota1 + pesoNota2 + pesoNota3 + pesoNota4)

    var media = totalNotasComPeso / somaPesos

    var df = DecimalFormat("#0.0")

    var mediaFormatado = df.format(media)

    println("Media: $mediaFormatado")

    if (media >= 7){
        println("Aluno aprovado.")
    } else if (media < 5){
        println("Aluno reprovado.")
    } else {
        println("Aluno em exame.")
        notaExame = readLine()!!.toDouble()
        println("Nota do exame: $notaExame")
        media = (media + notaExame) / 2
        if (media >= 5){
            println("Aluno aprovado.")
        } else {
            println("Aluno aprovado.")
        }
        mediaFormatado = df.format(media)
        println("Media final: $media")
    }


}