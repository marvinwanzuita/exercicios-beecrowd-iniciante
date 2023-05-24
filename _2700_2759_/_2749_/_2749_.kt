package beecrowd.iniciante._2700_2759_._2749_

fun main(){

    for(linha in 1 until 8){

        for (coluna in 1 until 40){

            if (linha == 1 || linha == 7) {
                print("-")
            } else if (coluna == 1 || coluna == 39) {
                print("|")
            } else if (linha == 2 && coluna == 2) {
                print("x = 35")
            }  else if (linha == 2 && (coluna in 3..7)) {
                continue
            } else if (linha == 4 && coluna == 17) {
                print("x = 35")
            }  else if (linha == 4 && (coluna in 18..22)) {
                continue
            } else if (linha == 6 && coluna == 33) {
                print("x = 35")
            }  else if (linha == 6 && (coluna in 34..38)) {
                continue
            } else {
                print(" ")
            }

        }
        println()
    }

}