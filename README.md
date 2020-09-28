# Array-1

## Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

Solution: 
Approach here is to calculate product of the numbers who are left of that particular number
for example going from left to right, the first array would be [1,1,2,6].
Similiarily we have to find the array traversing from right to left, that would be [24,12,4,1]
Now we have to multiply these two array that would give us our final answer.

If we want to do it in constant space, the array traversal from left to right would be same,
we would change the approach from right to left something like this,
initialize right = 1
output[i] = output[i]*right;
change right *= output[i]



## Problem 2

Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

Example:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]

Output: [1,2,4,7,5,3,6,8,9]

Here my approach would be to keep in check the boundries and tracerse the array
d = 1 represents upward direction and -1 represents downward direction.
if column == 0 || column  == max_columns
row++,
else
column++
change the direction.


## Problem 3
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:

[

[1, 2, 3, 4],

[5, 6, 7, 8],

[9,10,11,12]

]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Approach:
Here the approach would be keep left = 0, right = matrix[0].length-1
top = 0, bottom = matrix.length

1. i = left, move i till i<=right and keep adding elements
i.e list.add(matrix[top][i]). This would add first row
do top++ to avoid adding repeated element

2. Assign i = top and traverse till i<=bottom and keep adding elements
i.e. list.add(matrix[i][right]). This would add last column in the list.
do right-- to avoid repeation.

3. Assign i = right and move i till i>=left and keep adding elements
i.e. list.add(matrix[i][bottom]). This would add last row of the martix
do bottom-- to avoid duplication.

4. Assign i = bottom and move bottom till i>=top and keep adding the elements
i.e. list.add(matrix[left][i]). this would add first column of the matrix
do left++ to avoid duplication.

Repeat the same process till list.size() != rows*columns
