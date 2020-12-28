For a given list with  integers, return a new list removing the elements at odd positions. The input and output portions will be handled automatically. You need to write a function with the recommended method signature.

Input Format

 integers contained in the list, each on a separate line.

Output Format

Output the list with the integers at odd positions removed i.e. the first element, the third element and so on. The relative positions of the remaining even-position elements should be the same as they were in the original array. Each integer will be on a separate line.

NOTE: By odd positions, we mean the first, third, fifth, etc position of the array needs to be filtered out. As per programming language conventions, these might (and they often do) correspond to indices  and so on.

Sample Input

2
5
3
4
6
7
9
8
Sample Output

5
4
7
8
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

def f(arr:List[Int]):List[Int] = {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
        
*/
arr.indices.collect { case i if i % 2 == 1 => arr(i) }.toList


}
