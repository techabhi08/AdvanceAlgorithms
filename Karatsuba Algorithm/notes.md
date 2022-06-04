## Karatsuba Algo
Suppose there are 2 numbers:
x = 146123
y = 352120

The number X can be written as: 146000 + 123
 = 146 x 10^3 + 123
 = 146 x 10^6/2 + 123

If we consider half part as a abd rest of half as b then X can be represented as:
x = a x 10 ^ n/2 + b

Similarly y = c x 10^n/2 + d

Therefore x * y will be represented in general form as:
x * y = a x c x 10^(2n/2) + cb x 10^(n/2) + ad * (10 ^ n/2) + bd

Now recursilvely the Karatsuba can be applied to numbers a and c, c and b, a and d etc.
