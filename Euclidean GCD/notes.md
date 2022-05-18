## Euclidean GCD

The concept behind this algorithm is to reduce the time complexity to fing the Greatest Common Divisor of the number. 
The simple algorithm that we used had a time complexity of O(N) which is reduced here. This algo uses the concept of modulo function
which is used to calculate the reminder of both numbers.

There are some rules:
- If A=0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can exit from the algorithm.
- If B=0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can exit from the algorithm.
- Write A in the quotient that we get from (A=B*Q+R), where Q is Quotient and R is reminder.

