package beecrowd.iniciante._2700_2759_._2757_


fun main(){

    var n1 = readLine().toString()
    var n2 = readLine().toString()
    var n3 = readLine().toString()

    var n1I = n1.toInt()
    var n2I = n2.toInt()
    var n3I = n3.toInt()

    n1 = n1I.toString()
    n2 = n2I.toString()
    n3 = n3I.toString()


    println("A = $n1, B = $n2, C = $n3")
    println("A = ${n1.padStart(10)}, B = ${n2.padStart(10)}, C = ${n3.padStart(10)}")

    if (n1I < 0){
        var n1Negativo = Math.abs(n1I).toString()
        println("A = -${n1Negativo.padStart(9, '0')}, B = ${n2.padStart(10, '0')}, C = ${n3.padStart(10,'0')}")

    } else {
        println("A = ${n1.padStart(10, '0')}, B = ${n2.padStart(10, '0')}, C = ${n3.padStart(10,'0')}")
    }


    println("A = ${n1.padEnd(10)}, B = ${n2.padEnd(10)}, C = ${n3.padEnd(10)}")


}

