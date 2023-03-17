package beecrowd.iniciante._2100_2199_._2143_

fun main(){

    var casosTeste = readLine()
    var pessoas : Int
    var pedidos : Int

    while (true){

        pessoas = readLine()!!.toInt()

        if (pessoas == 0) break
        if (pessoas < 3) continue

        if (pessoas % 2 == 0){
            pedidos = ((pessoas - 2) * 2) + 2
        } else {
            pedidos = ((pessoas - 1) * 2) + 1
        }

        println(pedidos)
    }



}