You are given the cartesian coordinates of a set of points in a  plane. When traversed sequentially, these points form a Polygon, , which is not self-intersecting in nature. Can you compute the perimeter of polygon ?

Input Format

The first line contains an integer, , denoting the number of points.
The  subsequent lines each contain  space-separated integers denoting the respective  and  coordinates of a point.

Constraints

No  points are coincident, and polygon  is obtained by traversing the points in a clockwise direction.
Output Format

For each test case, print the perimeter of  (correct to a scale of one decimal place).

Note: Do not add any leading/trailing spaces or units.

Sample Input

4
0 0
0 1  
1 1  
1 0
Sample Output

4
-------------------------------------------
object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
var lines=io.Source.stdin.getLines()

val nPoints= lines.next.toInt
var points = lines.take(nPoints).toList map (s => s.split(" ")) map {case Array(e1,e2) => (e1.toInt,e2.toInt)}

var polygLine = points :+ points.head

var perimeter= (polygLine.tail.foldLeft((0.0,polygLine.head)){case (acc,p)=> (acc._1+distance(acc._2,p),p)})._1

println(perimeter)
}
def distance(p1:(Int,Int),p2:(Int,Int)): Double =
  math.sqrt(math.pow(p1._1-p2._1,2)+math.pow(p1._2-p2._2,2))
}
