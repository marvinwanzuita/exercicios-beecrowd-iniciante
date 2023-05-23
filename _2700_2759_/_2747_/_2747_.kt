package beecrowd.iniciante._2700_2759_._2747_

fun main(){

    for(i in 1 until 8){

        for (j in 1 until 40){

            if (i == 1 || i == 7) {
                print("-")
            } else if (j == 1 || j == 39) {
                print("|")
            } else if (i == 2 && j == 10) {
                print("Roberto")
            }  else if (i == 2 && (j in 11..16)) {
                continue
            } else if (i == 4 && j == 10) {
                print("5786")
            }  else if (i == 4 && (j in 11..13)) {
                continue
            } else if (i == 6 && j == 10) {
                print("UNIFEI")
            }  else if (i == 6 && (j in 11..15)) {
                continue
            } else {
                print(" ")
            }

        }
        println()
    }

}