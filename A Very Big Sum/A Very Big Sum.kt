import java.io.*
import java.util.*

fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var sum: Long = 0
        var n = sc.nextInt()
        for (i in 1..n)
            sum += sc.nextInt()
        
        println(sum)
}