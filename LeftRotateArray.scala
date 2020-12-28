A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become . Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.

Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

Function Description

Complete the function rotLeft in the editor below.

rotLeft has the following parameter(s):

int a[n]: the array to rotate
int d: the number of rotations
Returns

int a'[n]: the rotated array
Input Format

The first line contains two space-separated integers  and , the size of  and the number of left rotations.
The second line contains  space-separated integers, each an .

Constraints

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
----------------------------------------------------------------------------
object Solution {
    def reverse(a: Array[Int],l:Int,r:Int){
        for(i <- l to (r+l)/2){
             var t = a(i);
             a(i)=a(r+l-i);
             a(r+l-i)=t;
        }
    }
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var k = sc.nextInt();
        k%=n;
        var a = new Array[Int](n);
        for(a_i <- 0 to n-1) {
           a(a_i) = sc.nextInt();
        }
        reverse(a,0,k-1);
         reverse(a,k,n-1);
         reverse(a,0,n-1);
        print(a(0));
        for(i <- 1 to n-1) {
           //a(a_i) = sc.nextInt();
            print(" "+a(i));
        }
        println;
    }
}
