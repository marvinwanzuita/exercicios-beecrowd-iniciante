package beecrowd.iniciante._1900_1999_._1957_

fun main(){

    val V = readLine()!!.toInt()

    var quociente = 0
    var auxQuociente = 0
    var resto = 0
    var hexadecimal = ""


    do {

        if (quociente == 0){
            quociente = V / 16
            resto = V % 16
        } else {
            auxQuociente = quociente
            quociente /= 16
            resto = auxQuociente % 16
        }

        hexadecimal += converterHexacimal(resto)

        if (quociente < 16){
            if (V < 16){
                break
            }
            hexadecimal += converterHexacimal(quociente)
            break
        }


    } while (true)

    println(hexadecimal.reversed())


}


fun converterHexacimal(n: Int) : String {

    return when(n){
        0 -> 0.toString()
        1 -> 1.toString()
        2 -> 2.toString()
        3 -> 3.toString()
        4 -> 4.toString()
        5 -> 5.toString()
        6 -> 6.toString()
        7 -> 7.toString()
        8 -> 8.toString()
        9 -> 9.toString()
        10 -> "A"
        11 -> "B"
        12 -> "C"
        13 -> "D"
        14 -> "E"
        15 -> "F"
        else -> "0"
    }

}