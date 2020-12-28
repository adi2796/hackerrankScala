Task
Given the starter code, complete the Fibonacci function to return the  term.

We start counting from Fibonacci. This might differ from some other notations that treats Fibonacci.

The overall equation is:

             = 0 , n = 1
Fibonacci(n) = 1 , n = 2
               Fibonacci(n-1) + Fibonacci(n-2)  , n > 2
Input Format

One line of input, the integer .

Constraints


Output Format

Output one integer, the  Fibonacci number.

Sample Input

3  
Sample Output

1  
-----------------------------------------------------------------------------
object Solution {
     
     def fibonacci(x:Int):Int = {
          
        var first = 0
        var second = 1
        var count = 1

        while(count < x){
            var sum = first + second
            first = second
            second = sum
            count = count + 1
        }

  return first
    }

    def main(args: Array[String]) {
         /** This will handle the input and output**/
         println(fibonacci(scala.io.StdIn.readInt()))

    }
}
