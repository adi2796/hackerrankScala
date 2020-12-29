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
    
 def numberOfWays(X : Int, N : Int) : Int = {
        def candidates(num : Int) : List[List[Int]] = {
            if( Math.pow(num, N).toInt > X ) 
                List.range(1, num).map(
                    l => Math.pow(l, N).toInt
                ).toSet[Int].subsets.map(_.toList).toList
            else 
                candidates(num+1)
        }
        candidates(1).count(l => l.sum == X)
    }

    def main(args: Array[String]) {
       println(numberOfWays(scala.io.StdIn.readInt(),scala.io.StdIn.readInt()))
    }
}
