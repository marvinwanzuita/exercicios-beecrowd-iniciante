package beecrowd.iniciante._2700_2759_._2747_

fun main(){

    for(i in 0 until 7){

        for (j in 0 until 39){

            if (i == 0 || i == 6) {
                print("-")
            } else if (j == 0 || j == 38) {
                print("|")
            } else {
                print(" ")
            }

        }
        println()
    }

}