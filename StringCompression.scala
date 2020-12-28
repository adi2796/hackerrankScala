Joseph and Jane are making a contest for apes. During the process, they have to communicate frequently with each other. Since they are not completely human, they cannot speak properly. They have to transfer messages using postcards of small sizes.
To save space on the small postcards, they devise a string compression algorithm:

If a character, , occurs  times in a row, then it will be represented by , where  is the value of . For example, if the substring is a sequence of  'a' ("aaaa"), it will be represented as "a4".

If a character, , occurs exactly one time in a row, then it will be simply represented as . For example, if the substring is "a", then it will be represented as "a".

Help Joseph to compress a message, msg.

Input

The only line of input contains a string, msg.

Output

Print the string msg as a compressed message.

Constraints

msg consists of lowercase English characters () only.
Sample Input #00

abcaaabbb
Sample Output #00

abca3b3
------------------------------------------------------------------------------------------
object Solution{

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val line =scala.io.StdIn.readLine()
        val subs = uniformSubstrings(line)
        val substringCompressed = subs.map(s => {
            val length = s.length
            if(length > 1) {
            s.head.toString + length
            } else {
            s.head.toString
            }
        })
        
        println(substringCompressed.mkString(""))
    }
     
 
 
  def uniformSubstrings(s: String): List[String] = {
    if(s.length <= 0) {
      return Nil
    }
    val c = s.charAt(0)
    val substring = s.takeWhile(_ == c)
    substring :: uniformSubstrings(s.drop(substring.length))
  }
}
