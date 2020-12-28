Update the values of a list with their absolute values. The input and output portions will be handled automatically during grading. You only need to write a function with the recommended method signature.

Input Format

There are  integers, each on a separate line. These are the  elements of the input array.

Output Format

Output the absolute value of  integers, each on a separate line in the same input order.

Sample Input

2
-4
3
-1
23
-4
-54
Sample Output

2
4
3
1
23
4
54
------------------------------------------------------------------------------------------------------------------------------
def f(arr:List[Int]):List[Int] ={
 val list = new scala.collection.mutable.ListBuffer[Int]();
  val len = arr.length;
  for ( i <- 0 to len-1)
  {
    if(arr(i) < 0)
    {

      list.append((-1)*arr(i)) ;
    }
    else
    {
      list.append(arr(i));
    }
  }
