Find the number of ways that a given integer, , can be expressed as the sum of the  power of unique, natural numbers.

Input Format

The first line contains an integer .
The second line contains an integer .

Constraints

Output Format

Output a single integer, the answer to the problem explained above.

Sample Input 0

10
2
Sample Output 0

1



-----------------------------------------------------------------------------------------------------
object Solution {
    
    
def numberOfWays(X: Int, N: Int): Int = {

    def getSum(sum: Int, maximum: Int): Int = sum match {
      case x if x < 1 => 0
      case _ => {
        val limit = scala.math.min(maximum, scala.math.floor(scala.math.pow(sum, 1.0 / N)).toInt)
        (limit to 1 by -1).map(x => {
          val y = scala.math.pow(x, N).toInt
          if (y == sum) 1 else getSum(sum - y, x - 1)
        }).sum
      }
    }

    getSum(X, Integer.MAX_VALUE)
  }

    def main(args: Array[String]) {
       println(numberOfWays(scala.io.StdIn.readInt(),scala.io.StdIn.readInt()))
    }
}
