package beecrowd.iniciante._2700_2759_._2754_

import java.text.DecimalFormat




fun main(){

    val n1 = 234.345
    val n2 = 45.698

    var formato = "%.6f"
    println(formato.format(n1) + " - " + formato.format(n2))
    formato = "%.0f"
    println(formato.format(n1) + " - " + formato.format(n2))
    formato = "%.1f"
    println(formato.format(n1) + " - " + formato.format(n2))
    val df = DecimalFormat("#.##")
    formato = "%.2f"
    println(df.format(n1) + " - " + formato.format(n2))
    formato = "%.3f"
    println(formato.format(n1) + " - " + formato.format(n2))
    formato = "%e"
    println(formato.format(n1) + " - " + formato.format(n2))
    formato = "%E"
    println(formato.format(n1) + " - " + formato.format(n2))
    formato = "%.3f"
    println(formato.format(n1) + " - " + formato.format(n2))
    formato = "%.3f"
    println(formato.format(n1) + " - " + formato.format(n2))



}