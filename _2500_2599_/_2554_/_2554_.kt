package beecrowd.iniciante._2500_2599_._2554_

import java.util.*

fun main(){

    val sc = Scanner(System.`in`)

    var quantidadeDatasPessoas : String
    var quantidadeDatasPessoasArray : Array<String>

    var quantidadePessoas : Int
    var datasParaEscolher : Int

    var dataEPessoasPodemComparecer : String
    var dataEPessoasPodemComparecerArray : Array<String>

    var dataEscolhida : String
    var pessoasPodemComparecerDataEscolhida : Int

    var datasDefinidas : List<String>

    while (sc.hasNext()) {

        quantidadeDatasPessoas = sc.nextLine()
        quantidadeDatasPessoasArray = quantidadeDatasPessoas.split(" ").toTypedArray()

        quantidadePessoas = quantidadeDatasPessoasArray[0].toInt()
        datasParaEscolher = quantidadeDatasPessoasArray[1].toInt()

        pessoasPodemComparecerDataEscolhida = 0

        dataEscolhida = ""
        datasDefinidas = mutableListOf()


        for (i in 0 until datasParaEscolher) {

            dataEPessoasPodemComparecer = sc.nextLine()
            dataEPessoasPodemComparecerArray = dataEPessoasPodemComparecer.split(" ").toTypedArray()

            pessoasPodemComparecerDataEscolhida = 0

            for (j in 0..quantidadePessoas) {

                if (j == 0) {
                    dataEscolhida = dataEPessoasPodemComparecerArray[0]
                    continue
                }
                if (dataEPessoasPodemComparecerArray[j].toInt() == 1) pessoasPodemComparecerDataEscolhida++

            }

            if (pessoasPodemComparecerDataEscolhida == quantidadePessoas) {
                datasDefinidas.add(dataEscolhida)
            }

        }

        if (datasDefinidas.isEmpty()) {
            println("Pizza antes de FdI")
        } else {
            println(datasDefinidas[0])
        }

    }

}