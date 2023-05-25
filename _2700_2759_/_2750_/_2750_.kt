package beecrowd.iniciante._2700_2759_._2750_

fun main(){

    tracejado()
    println("|  decimal  |  octal  |  Hexadecimal  |")
    tracejado()
    escreverNumeros()
    tracejado()

}


fun tracejado(){
    for (linha in 1 until 40){
        print("-")
    }
    println()
}

fun escreverNumeros() {
    var decimais = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    for (i in 0 until 16) {

        var decimal = decimais[i]
        var octal = decimal.toString(8)
        var hexadecimal = decimal.toString(16).toUpperCase()
        var decimalString = decimal.toString()

        if (decimalString.length < 2 && octal.length < 2 && hexadecimal.length < 2) {
            println("|      $decimalString    |    $octal    |       $hexadecimal       |")
        } else if (decimalString.length < 2 && octal.length < 3 && hexadecimal.length < 2) {
            println("|      $decimalString    |   $octal    |       $hexadecimal       |")
        } else {
            println("|     $decimalString    |   $octal    |       $hexadecimal       |")
        }


    }


}