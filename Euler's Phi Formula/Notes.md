## Euler's Phi

This formula is used to calculate the number of coprimes for a given range.The formula is simple:
There are basically 3 set of rules:
- If the given number is a prime number then the answer comes out to be n - 1;
- If the number is non prime then we divide the number into multiple of prime numbers and then apply rule 1.
- If during splliting in rule 2, the number appear more than once then the answer comes out to be m^n - m^(n-1).

For eg:

If number is 7: 
Then Phi(7) = 7 - 1 = 6

If number = 15:
Then Phi(15) = Phi(5) * Phi(3)</br>
             = (5 - 1) * (3 - 1)</br>
             = 8

If number  = 12:
Then Phi(12) = Phi(2) * Phi(2) * Phi(3)</br>
             = Phi(2) ^ 2 * Phi(3 - 1)</br>
             = (2^2 - 2 ^ (2-1)) * 2</br>
             = (4 - 2) * 2</br>
             = 2 * 2</br>
             = 4
