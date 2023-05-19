package beecrowd.iniciante._2700_2759_._2724_

import java.util.Scanner

fun main(){

    val sc = Scanner(System.`in`)

    var casosTeste = sc.nextInt()
    sc.nextLine()

    var quantidadeElementosPerigosos : Int
    var listaElementosPerigosos : List<String>

    var quantidadeExperimentos : Int
    var listaExperimentos : List<String>

    var listaResultados : List<String>

    var verificarExperimento : String


    for (i in 0 until casosTeste){

        quantidadeElementosPerigosos = sc.nextInt()
        sc.nextLine()
        listaElementosPerigosos = mutableListOf()

        for (i in 0 until quantidadeElementosPerigosos){

            listaElementosPerigosos.add(sc.nextLine())


        }

        quantidadeExperimentos = sc.nextInt()
        sc.nextLine()
        listaExperimentos = mutableListOf()

        for (i in 0 until quantidadeExperimentos){
            listaExperimentos.add(sc.nextLine())
        }

        listaResultados = mutableListOf()


        for (experimento in listaExperimentos){

            verificarExperimento = experimento.replace("0", "O")

            for (elemento in listaElementosPerigosos){

                if (experimento.contains(elemento)){
                    elemento.replace("0", "O")
                    verificarExperimento = verificarExperimento.replace(elemento, "")
                }

            }

            if (verificarExperimento.isEmpty()) {
                listaResultados.add("Abortar")
            } else {
                listaResultados.add("Prossiga")
            }

        }

        listaResultados.forEach { println(it) }
        println()


    }




}


