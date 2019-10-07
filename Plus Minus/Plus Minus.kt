import java.io.*
import java.util.*

fun main(args: Array<String>) {
readLine()
 val list = readLine()!!.split(" ").map { it.toInt() }
 println(list.count { it > 0}.toDouble() / list.size)
 println(list.count { it < 0}.toDouble() / list.size)
 println(list.count { it == 0}.toDouble() / list.size)
}
