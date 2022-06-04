## Lexicographically first palindromic string

Rearrange the characters of the given string to form a lexicographically first palindromic string.</br> 
If no such string exists display message “no palindromic string”.

Input : malayalam
Output : aalmymlaa

Input : apple
Output : no palindromic string

### Thinking Process:

Properties for palindromic string:
- If length of string is even, then the frequency of each character in the string must be even.
- If the length is odd then there should be one character whose frequency is odd and all other chars must have</br>
  even frequency and at-least one occurrence of the odd character must be present in the middle of the string.
  
### Algorithm

1. Store frequency of each character in the given string
2. Check whether a palindromic string can be formed or not using the properties of palindromic string mentioned above.
3. If palindromic string cannot be formed, return “No Palindromic String”.
4. Else we create three strings and then return front_str + odd_str + rear_str.

- odd_str : It is empty if there is no character with odd frequency. Else it contains all occurrences of odd character.
- front_str : Contains half occurrences of all even occurring characters of string in increasing order.
- rear_str Contains half occurrences of all even occurring characters of string in reverse order of front_str.
