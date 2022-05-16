### SIEVE ALGORITHM

The Sieve of Eratosthemes or Sieve algorithm is used to find the prime numbers smaller than or equal to the given n, where n is number.
This alogithm is effecoent for smaller numbers and perform well till n is smaller that 10^7. 
The steps that the algorithm follows are as follows:
- We list all the numbers from 2 to given number n.
- All the numbers are considered as prime initially.
- For every prime number present in the list we traverse through the list, starting from the smallest prime number that is 2.
- We remove all the multiples of the number. This helps to remove all the non prime numbers from the list of numbers and hence reduces the number 
of comparisons for each number.
- We now update the number and move to immediate next prime number.
- Repeat the step 3 and 4 until only prime numbers are left in the list.

Below given is an example to understand the steps easily:

- Supoose we are given number n as 30. We need to find all the prime numbers that are smaller than or equal to 30.

Solution:

- Listing the numbers

2   3   4   5   6   7   8   9   10
11  12  13  14  15  16  17  18  19  20
21  22  23  24  25  26  27  28  29  30

- Selecting 2 as our 1st primw number and removing all the multiples of 2

2   3       5        7      9   
11      13      15      17      19  
21      23      25      27      29

- Our next prime number would be 3, hence removing all the multiples of 3.

2   3       5        7         
11      13              17      19  
        23      25            29
        
- The next prime left in the table is 5. Hence selecting 5 and removing the multiples of 5.

2   3       5        7         
11      13              17      19  
        23                      29
        
- Selecting 7 and removing the multiples of 7.

2   3       5        7         
11      13              17      19  
        23                      29

- Selecting 11

2   3       5        7         
11      13              17      19  
        23                      29

- Selecting 13

2   3       5        7         
11      13              17      19  
        23                      29

This is how we would traverse and reach to the final solution. According to the optimized code we need not traverse till i < n. 
The solution will be derived once we reach i * i < n. 
