### Wornsdorff's Algorithm

Problem Statement - A knight is placed on the first block of an empty board and, moving according to the rules of chess, must visit each square exactly once. 

Rules:
- We can start from any initial position of the knight on the board.
- We always move to an adjacent, unvisited square with minimal degree (minimum number of unvisited adjacent).

#### Algorithm

- If all squares are visited 
    print the solution
- Else
   a) Add one of the next moves to solution vector and recursively 
   check if this move leads to a solution. (A Knight can make maximum 
   eight moves. We choose one of the 8 moves in this step).</br>
   b) If the move chosen in the above step doesn't lead to a solution
   then remove this move from the solution vector and try other 
   alternative moves.</br>
   c) If none of the alternatives work then return false (Returning false 
   will remove the previously added item in recursion and if false is 
   returned by the initial call of recursion then "no solution exists" )
