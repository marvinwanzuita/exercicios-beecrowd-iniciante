package beecrowd.iniciante._2500_2599_._2544_

import java.util.*

fun main() {

    val sc = Scanner(System.`in`)

    var quantidadeClones: Int
    var multiplicacoesClones : Int

    while (sc.hasNext()) {

        quantidadeClones = sc.nextInt()
        sc.nextLine()
        multiplicacoesClones = 0

        while (true){

            if (quantidadeClones == 1) break

            quantidadeClones /= 2
            multiplicacoesClones++

            if (quantidadeClones < 1){
                break
            }


        }
        println(multiplicacoesClones)

    }

}