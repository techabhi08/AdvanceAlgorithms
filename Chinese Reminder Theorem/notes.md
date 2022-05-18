## Chinese Reminder Theorem

The chinese reminder theorem is based on given 2 arrays num[0.. k - 1] and num [0 ..k-1].
All the pairs given in num[0 ..k-1] are coprimes which means that the greates common divisor for them is 1.
By applying algorithm we need to find the minimum value of x where x :

- x % num[0] = rem[0]
- x % num[1] = rem[1]
- x % num[2] = rem[2]
- ...................
- x % num[k - 1] = rem[k - 1]

There are certain formulas or set of assumptions and rules that the algorithm follows:
- x = a1(mod m1)
  Here the a1 is reminder, while m1 is the divisor
 The final value of x is calculated by the formula:
- x = (a1M1M1^-1 + a2M2M2^-1 + .... + anMnMn^-1) Mod M

To calculate M we solve:
- M = m1 * m2 * m3 * .....

The values of M1, M2, M3 .... are found as:
- M1 = M / m1
- M2 = M / m2
- .....

To find the multiplicative inverse of M1 i.e. M1^-1:

- M1 * M1^-1 = 1 (mod m1)
- M2 * M2^-1 = 1 (mod m2)
- ......

### For eg: 
Fiven the congruent equations:

x = 2 (mod 3)
x = 3 (mod 5)
x = 2 (mod 7)

We need to find value of x where x = (a1M1M1^-1 + a2M2M2^-1 + .... + anMnMn^-1) Mod M

We are given values as follows:
- a1 = 2      , m1 = 3
- a2 = 3      , m2 = 5
- a3 = 2      , m3 = 7

In this given relation m1, m2 and m3 are related primes.
From the given set of values we can find M where M = m1 * m2 * m3

Therefore, M = 3 * 5 * 7
or M = 105

Now we can calculate the value of M1, M2, and M3<br/>
M1 = M / m1<br/>
M1 = 105 / 3<br/>
M1 = 35<br/>

M2 = M / m2<br/>
M2 = 105 / 5<br/>
M2 = 21<br/>

M3 = M / m3<br/>
M3 = 105 / 7<br/>
M3 = 15<br/>
  
Now the only values that are left to be calculated is the multiplicative inverse of M1, M2 and M3<br/>
M1 * (M1)^-1 = 1 (mod m1)

For (M1)^-1 we will start checking from 1. <br/>

35 * 1 = 1 (mod 3)<br/>
35 = 1 (mod 3)<br/>
Here 35 mod 3 won't give the answer as 1. Hence take (M1)^-1 = 2.<br/>

35 * 2 = 1 (mod 3)<br/>
70 = 1 (mod 3)<br/>
70 % 3 gives the answer as 1, hence value of (M1)^-1 will be 2.<br/>

Similarly we will find the values of (M2)^-1  and (M3)^-1. The values would come out to be 1 and 1 respectively.<br/>
Now we need to calculate the value of x.<br/>

- x = (a1M1M1^-1 + a2M2M2^-1 + a3M3M3^-1) Mod M<br/>
x = (2 * 35 * 2 + 3 * 21 * 1 + 2 * 15 * 1) Mod 105<br/>
x = 233 Mod 105<br/>
x = 23<br/>

This value of x will satisfy the given congruent equations as:<br/>
23 % 3 = 2<br/>
23 % 5 = 3<br/>
23 % 7 = 2<br/>

Hence the answer is derived.

The Time complexity for the algorithm is: O(N Log N)
Space Complexity: O(1)
