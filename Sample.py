#Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach

# Product except self - Store the left running product to a list. Then calculate the right running product and multiply with the right element of the current element.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rp = 1
        output = [1]
        # left to right
        for i in range(1,len(nums)):
            rp = rp * nums[i-1]
            output.append(rp)
        rp = 1
        
        for i in range(len(output)-2,-1,-1):
            rp = rp * nums[i+1]
            output[i] = output[i] * rp
    
        return output



#Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach

# Find Diagonal Order - set directions, up and down. When we hit the upper boundaries and the len of matrix, then change direction to down. 
# when we hit the below boundary or the left boundary, then change the direction again

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        dir = True
        i,j = 0,0
        m=len(mat)
        n=len(mat[0])
        res = []
        while i <= m-1 and j <= n-1:
            res.append(mat[i][j])
            if dir:
                print(mat[i][j])
                if i==0 and j < n-1:
                    dir = False
                    j+=1
                elif j==n-1:
                    dir = False
                    i += 1
                else:
                    i -= 1
                    j += 1

            else:
                if j==0 and i < m-1:
                    dir = True
                    i+=1
                elif i==m-1:
                    dir = True
                    j += 1
                else:
                    j -= 1
                    i += 1
        return res



#Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach

# Find Spiral Order - Travel left to right;set top to next row, then top to bottom; right to previous row, then right to left; bottom to previous row, 
#finally bottom to top, then left to next row

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top=0
        bottom=len(matrix)-1
        left=0
        right=len(matrix[0])-1
        res = []
        while top <= bottom and left <= right:
            if top <= bottom and left <= right:
                for i in range(left,right+1):
                    res.append(matrix[top][i])
                top += 1
            if top <= bottom and left <= right:
                for i in range(top,bottom+1):
                    res.append(matrix[i][right])
                right -= 1
            
            if top <= bottom and left <= right:
                for i in range(right,left-1,-1):
                    res.append(matrix[bottom][i])
                bottom -= 1
            
            if top <= bottom and left <= right:
                for i in range(bottom,top-1,-1):
                    res.append(matrix[i][left])
                left += 1
            
        return res 

