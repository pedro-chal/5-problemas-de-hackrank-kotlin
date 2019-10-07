import java.io.*
import java.util.*
import java.text.*
import java.math.*
import java.util.regex.*
object Solution {
  @JvmStatic fun main(args:Array<String>) {
    val `in` = Scanner(System.`in`)
    val a_triplet = IntArray(3)
    val b_triplet = IntArray(3)
    for (i in 0..2)
    {
      a_triplet[i] = `in`.nextInt()
    }
    for (i in 0..2)
    {
      b_triplet[i] = `in`.nextInt()
    }
    val alice_points = 0
    val bob_points = 0
    for (i in 0..2)
    {
      if (a_triplet[i] > b_triplet[i])
      {
        alice_points += 1
      }
      else if (a_triplet[i] < b_triplet[i])
      {
        bob_points += 1
      }
    }
    System.out.printf("%d %d", alice_points, bob_points)
  }
}