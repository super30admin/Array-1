// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


Product of Array Except Self


Bruteforce:

take product of each element linearly except the number 

Time: O(n^2)
Space: O(n)


Apprach 1: Using two arrays

Calculate the running product for left pass and put it in the array
Calculate the running product for right pass and put it in the array
finally return the product of both passes

time: O(n)
space: O(n)


Apprach 2: Using a single array

left pass and right pass in the single array itself 

time: O(n)
space: O(1)
  
  
Spiral Matrix

keep four pointers left, right, top & bottom
check edge condition and loop through array

time: O(n)
space: O(1)
