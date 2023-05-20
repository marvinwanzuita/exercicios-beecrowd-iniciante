package beecrowd.iniciante._2700_2759_._2727_

import java.util.*

fun main() {

    val sc = Scanner(System.`in`)

    var casosTeste: Int
    var codigoLetra: String

    while (sc.hasNext()) {


        casosTeste = sc.nextInt()
        sc.nextLine()

        for (i in 0 until casosTeste) {

            codigoLetra = sc.nextLine()
            println(decifrarLetra(codigoLetra))
        }

    }

}


fun decifrarLetra(codigo: String): String {

    return when (codigo) {
        "." -> "a"
        ".." -> "b"
        "..." -> "c"
        ". ." -> "d"
        ".. .." -> "e"
        "... ..." -> "f"
        ". . ." -> "g"
        ".. .. .." -> "h"
        "... ... ..." -> "i"
        ". . . ." -> "j"
        ".. .. .. .." -> "k"
        "... ... ... ..." -> "l"
        ". . . . ." -> "m"
        ".. .. .. .. .." -> "n"
        "... ... ... ... ..." -> "o"
        ". . . . . ." -> "p"
        ".. .. .. .. .. .." -> "q"
        "... ... ... ... ... ..." -> "r"
        ". . . . . . ." -> "s"
        ".. .. .. .. .. .. .." -> "t"
        "... ... ... ... ... ... ..." -> "u"
        ". . . . . . . ." -> "v"
        ".. .. .. .. .. .. .. .." -> "w"
        "... ... ... ... ... ... ... ..." -> "x"
        ". . . . . . . . ." -> "y"
        ".. .. .. .. .. .. .. .. .." -> "z"
        else -> ""
    }

}