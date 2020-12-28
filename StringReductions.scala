Given a string, , consisting of  lowercase English characters (), remove all of the characters that occurred previously in the string. Formally, remove all characters, , for:

 and 

Input Format

A single line of input containing a string  of length .

Constraints

Output Format

Print the string after removing all the characters that occurred previously.

Sample Input #00

accabb
Sample Output #00

acb
Sample Input #01

abc
Sample Output #01

abc
Sample Input #02

pprrqq
Sample Output #02

prq

---------------------------------------------------------------------------------------------------------------------------------------------------------
object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
val line = scala.io.StdIn.readLine()
        var chars  = scala.collection.mutable.LinkedHashSet[Char]()
        line.foreach(x => chars += x)
        println(chars.mkString)
    }
}
