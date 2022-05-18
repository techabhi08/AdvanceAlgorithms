## StroboGrammatic Number

StroboGrammatic Numbers by definition are those numbers which when rotated by 180 degree, gives the same representation.
There are only few numbers which showcase this property and those are: 0, 1, 8 and there are 2 exceptions 6 and 9.

Any number other than these are not considered as stribo grammatic.
The main use of this algorithm is to find whether a given number containing n digits is strobogrammatic i.e. whether the number represents the same number when rotated through 180 degree.

### Example:

Supoose that we have a number 16891
In this number if we replace 6 with 9 and make it 16891 from 19861 then number is strobogrammatic which is allowed in case of 6 and 9. 

The algorithm to find this number is as follows:

### Algorithm:
1. For every digit in num we check if number belongs to 0, 1 or 8, if so we add those digits to our resultant array.
2. If digit is 6 or 9 we interchange them and then add to our new array.
3. Else if digit is different, no further computation is required and we return false as our answer.

Here the Stack can also be used as data structure.

Time Complexity: O(N)
Space Complexity: O(1)
