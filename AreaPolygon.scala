You are given the cartesian coordinates of a set of points in a  plane. When traversed sequentially, these points form a Polygon, , which is not self-intersecting in nature. Can you compute the area of polygon ?

Input Format

The first line contains an integer, , denoting the number of points.
The  subsequent lines each contain  space-separated integers denoting the respective  and  coordinates of a point.

Constraints

No  points are coincident, and polygon  is obtained by traversing the points in a counter-clockwise direction.
Output Format

For each test case, print the area of  (correct to a scale of one decimal place).

Note: Do not add any leading/trailing spaces or units; it is assumed that your result is in square units.

Sample Input

4
0 0
0 1  
1 1  
1 0
Sample Output

1
----------------------------------------------------
object Solution {

  def polygonArea(points: Seq[(Int, Int)]): Double = {
    def f(p1: (Int, Int), p2: (Int, Int)): Int = (p1._1 + p2._1) * (p1._2 - p2._2)
    math.abs((points.foldLeft(0.0, points.last){ (accu, p) => (accu._1 + f(accu._2, p), p)})._1 / 2)
  }

  def main(args: Array[String]): Unit = {
    val nPoints = io.StdIn.readInt()
    val points: Seq[(Int, Int)] = (1 to nPoints).map(_ => io.StdIn.readLine().split("\\s+")).map(p => (p(0).toInt,p(1).toInt))
    println(polygonArea(points))
  }
}
