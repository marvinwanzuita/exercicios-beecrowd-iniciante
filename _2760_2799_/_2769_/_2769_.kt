package beecrowd.iniciante._2760_2799_._2769_

import java.awt.image.AreaAveragingScaleFilter
import java.util.Scanner

fun main(){

    var sc = Scanner(System.`in`)

    var N : Int

    var eString : String
    var eArray : Array<String>
    var e1 : Int
    var e2 : Int

    var a1string : String
    var a1list : Array<String>
    var a1 : MutableList<Int>

    var a2string : String
    var a2list : Array<String>
    var a2 : MutableList<Int>

    var t1 : MutableList<Int>
    var t1Array : Array<String>

    var t2 : MutableList<Int>
    var t2Array : Array<String>

    var xString : String
    var xArray : Array<String>
    var x1 : Int
    var x2 : Int

    var a1Proximo : Int
    var t1Proximo : Int
    var t1ProximoProximo : Int
    var a2Proximo : Int
    var t2Proximo : Int

    var soma1 : Int
    var soma2 : Int

    var listaAtual1 : String
    var listaAtual2 : String

    var resultados = mutableListOf<Int>()

    var indice = 0
    while (indice < 1){
//    while (sc.hasNext()){

        N = sc.nextInt()
        sc.nextLine()

        eString = sc.nextLine()
        eArray = eString.split(" ").toTypedArray()

        e1 = eArray[0].toInt()
        e2 = eArray[1].toInt()

        a1string = sc.nextLine()
        a1list = a1string.split(" ").toTypedArray()

        a1 = mutableListOf<Int>()
        a1list.forEach { a1.add(it.toInt()) }

        a2string = sc.nextLine()
        a2list = a2string.split(" ").toTypedArray()

        a2 = mutableListOf<Int>()
        a2list.forEach { a2.add(it.toInt()) }

        t1 = mutableListOf<Int>()
        t2 = mutableListOf<Int>()

        t1Array = sc.nextLine().split(" ").toTypedArray()
        t2Array = sc.nextLine().split(" ").toTypedArray()

        t1Array.forEach { t1.add(it.toInt()) }
        t2Array.forEach { t2.add(it.toInt()) }

        xString = sc.nextLine()
        xArray = xString.split(" ").toTypedArray()

        x1 = eArray[0].toInt()
        x2 = eArray[1].toInt()

        soma1 = e1 + a1[0]
        soma2 = e2 + a2[0]
        listaAtual1 = "a1"
        listaAtual2 = "a2"

        for (i in 1 until a1.size){

            a1Proximo = a1[i]
            a2Proximo = a2[i]
            t1Proximo = t1[i-1]
            t2Proximo = t2[i-1]

            if (a1Proximo <= t1Proximo && listaAtual1 == "a1"){
                soma1 += a1Proximo
                listaAtual1 = "a1"
            } else if (t1Proximo < a1Proximo && listaAtual1 == "a1") {
                soma1 += t1Proximo + a2Proximo
                listaAtual1 = "a2"
            } else if (a2Proximo <= t2Proximo && listaAtual1 == "a2"){
                soma1 += a2Proximo
                listaAtual1 = "a2"
            } else if (t2Proximo < a2Proximo && listaAtual1 == "a2"){
                soma1 += t2Proximo + a2Proximo
                listaAtual1 = "a1"
            }

        }

        if (listaAtual1 == "a1"){
            soma1 += x1
        } else {
            soma1 += x2
        }

        for (i in 1 until a1.size){

            a1Proximo = a1[i]
            a2Proximo = a2[i]
            t1Proximo = t1[i-1]
            t2Proximo = t2[i-1]

            if (a1Proximo <= t1Proximo && listaAtual2 == "a1"){
                soma2 += a1Proximo
                listaAtual2 = "a1"
            } else if (t1Proximo < a1Proximo && listaAtual2 == "a1") {
                soma2 += t1Proximo + a2Proximo
                listaAtual2 = "a2"
            } else if (a2Proximo <= t2Proximo && listaAtual2 == "a2"){
                soma2 += a2Proximo
                listaAtual2 = "a2"
            } else if (t2Proximo < a2Proximo && listaAtual2 == "a2"){
                soma2 += t2Proximo + a2Proximo
                listaAtual2 = "a1"
            }

        }

        if (listaAtual2 == "a1"){
            soma2 += x1
        } else {
            soma2 += x2
        }


        if (soma1 < soma2) resultados.add(soma1) else resultados.add(soma2)

        a1.clear()
        a2.clear()
        t1.clear()
        t2.clear()

        indice++
    }

    resultados.forEach { println(it) }


}