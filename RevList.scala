You are given a list of  elements. Reverse the list without using the reverse function. The input and output portions will be handled automatically. You need to write a function with the recommended method signature.

Input Format

Each element, , of the list is displayed on a separate line.

Output Format

The output is the reverse of the input list.

Sample Input

19
22
3
28
26
17
18
4
28
0
Sample Output

0
28
4
18
17
26
28
3
22
19
---------------------------------------------------------------------------------------------------------------------------------------------
def f(arr:List[Int]):List[Int] = {
    arr.foldLeft(List[Int]())((acc,v) => v::acc)

}
---------------------------------
ADITI
