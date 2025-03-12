Recursion & Backtracking Playlist
https://www.youtube.com/playlist?list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod

Recursion

A function calling itself to solve a problem by breaking it down into smaller, similar subproblems.

1. A function is calling itself
2. Stack - Last in First Out
3. While the function is not finished executing, it will remain in the stack, that is why the main function will pop out last from the stack
4. When a function finishes executing, it is removed from the stack and the flow of the program is restored to where the function was called
5. Base condition in recursion ,where recursion will stop making new calls
6. Every function call with take some memory, we called it stack space

Why Recursion

1. It helps us in solving bigger / complex problems in a simple way
2. We can convert recursion sol^n into iteration & vise versa with the help of stacks
3. Space complexity is not constant because of recursive calls, called recursive stack space
4. Recursive tree -a graph that shows the recursive calls and the work done at each call in a recurrence relation

How to understand and approach a recursive problem

1.Identify if you can break down problem into smaller problems
2.Write the recurrence relation if needed -> fibo(N) = fibo(n - 1) + fibo(n - 2) - This is known as recurrence relation
3.Draw the recursive tree
4.About the tree
   i) See the flow of function, how they are getting in stack
  ii) Identify and the flow of left tree calls and right tree calls
 iii) Draw the tree and pointer again and again using pen and paper
  iv) Use a debugger to see the program flow
5.See how the values are return at each step, is it ( int, string ) etc. See when two function will come out. In the end you will come out of the main func
6.If the fun has return type, means it's not void, then make sure to return it, every recursive call

Types of recurrence relation
1. Liner recurrence relation -> Fibonacci series
2. Divide & conquer recurrence relation -> binary search

   Backtracking:
   A problem-solving approach where you explore different paths, discarding those that don't meet criteria, often implemented using recursion. 