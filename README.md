# Array-1

## Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

# Time Complexity=O(n)
# Space Complexity=O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans=[0]*len(nums)
        ans[0]=1
        for i in range(1,len(nums)):
            ans[i]=ans[i-1]*nums[i-1]
        a=1
        for i in reversed(range(len(nums))):
            ans[i]*=a
            a*=nums[i]
        return ans

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

# Time Complexity=O(rows*columns)
# Space Complexity=O(1)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        ans=[0]*len(mat)*len(mat[0])
        i=0
        d=1
        row=0
        col=0
        while i<len(mat)*len(mat[0]):
            ans[i]=mat[row][col]
            i+=1
            if d==1:
                if col==len(mat[0])-1:
                    row+=1
                    d=0
                elif row==0:
                    col+=1
                    d=0
                else:
                    row-=1
                    col+=1
            elif d==0:
                if row==len(mat)-1:
                    col+=1
                    d=1
                elif col==0:
                    row+=1
                    d=1
                else:
                    row+=1
                    col-=1
        return ans
            
        

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

# Time Complexity=O(rows*columns)
# Space Complexity=O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top=0
        bottom=len(matrix)-1
        left=0
        right=len(matrix[0])-1
        ans=[]
        while left<=right and top<=bottom:
            for i in range(left,right+1):
                ans.append(matrix[top][i])
            top+=1
            for i in range(top,bottom+1):
                ans.append(matrix[i][right])
            right-=1
            if top <=bottom:
                for i in range(right,left-1,-1):
                    ans.append(matrix[bottom][i])
                bottom-=1
            if left<=right:
                for i in range(bottom,top-1,-1):
                    ans.append(matrix[i][left])
                left+=1
        return ans
            