Gayasen has received a homework assignment to compute the greatest common divisor of the two positive integers A and B. Since the numbers are quite large, the professor provided him with N smaller integers whose product is A, and M integers with product B. He would like to verify result, so he has asked you to write a program to solve his problem. But instead of printing complete answer you have to print answer modulo 109+7.

Input
First line of input contains the positive integer N (1 <= N <= 1000).
Second line of input contains N space-separated positive integers not greater than 104, whose product is the number A.
Third line of input contains the positive integer M (1 <= M <= 1000).
Fourth line of input contains M space-separated positive integers not greater than 104, whose product is the number B.

OUTPUT
Print the greatest common divisor of numbers A and B modulo 1000000007.

Constraints
1 <= N, M <= 1000
1 <= element of list <= 10000

Sample Input #00

5
2 2 3 3 25
4
8 1 6 170
Sample Output #00

60
Sample Input #01

13
1 2 4 8 32 64 128 256 512 1024 2048 4096 8192
9
1 3 9 27 81 243 729 2187 6561
Sample Output #01

1
Sample Input #02

3
2 3 5
2
4 5
Sample Output #02

10
----------------------------------------------------------------------
object Solution extends App {

  def gcd(x: BigInt, y: BigInt): BigInt = {
    if (x == 0) y else gcd(y % x, x)
  }

  def product(nums: String): BigInt = {
    nums.split(" ").map(BigInt(_)).product
  }

  val f = () => scala.io.StdIn.readLine()
  val (_, a, _, b) = (f(), product(f()), f(), product(f()))
  println(gcd(a, b) % 1000000007)
}
