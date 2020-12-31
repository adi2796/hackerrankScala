Kazama gave Shaun a string of even length, and asked him to swap the characters at the even positions with the next character. Indexing starts at .

Formally, given a string str of length  where  is even, Shaun has to swap the characters at position  and , where {}.

For example, if str = "abcdpqrs", . We have to swap the characters at positions:
{}

So, answer will be "badcqpsr".

Input Format

The first line contains an integer, , the number of test cases.
 lines follow, each containing some string str.

Output Format

For each test case, print the new string as explained in the problem statement.

Constraints



 is even
str consists of lowercase English characters, {}.

Sample Input

2
abcdpqrs
az
Sample Output

badcqpsr
za

-----------------------------------------------------------------------
object Solution {

  def swapEvenStr(str: String, i: Int = 2): String = {
    if (i > str.length) return str
    val chars = str.toCharArray
    val charOrig = chars(i - 2)
    val charNew = chars(i - 1)
    val strStart = str.slice(0, i - 2)
    val strEnd = str.slice(i, str.length)
    swapEvenStr(strStart + charNew + charOrig + strEnd, i + 2)
  }

  def main(args: Array[String]) {
    val lines = io.Source.stdin.getLines.toSeq.drop(1).map(_.trim)
    for (line <- lines) {
      println(swapEvenStr(line))
    }
  }
}
