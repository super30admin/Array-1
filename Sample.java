# Array-1

## Problem 1
## time complexcity o(n)
## space complexcity 0(n)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        left = []
        sum_r = 1
        left.append(sum_r)
        for i in range(1,len(nums)):
            sum_r = sum_r*nums[i-1]
            print(sum_r)
            left.append(sum_r)
        
        rp = 1
        for i in range(n-2, -1, -1):
            rp = rp *nums[i+1]
            print(rp)
            left[i] = left[i] * rp
        return left
# Diagonal Traverse
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        result = []
    # Step 2
        m, n = len(mat), len(mat[0])
        i = j = direction = 0
    
    # Step 3
        for _ in range(m * n):
            result.append(mat[i][j])
        
            if direction == 0: # Up-right direction
                if j == n - 1:
                    direction = 1 # Change direction to down-left
                    i += 1
                elif i == 0:
                    direction = 1 # Change direction to down-left
                    j += 1
                else:
                    i -= 1
                    j += 1
            else: # Down-left direction
                if i == m - 1:
                    direction = 0 # Change direction to up-right
                    j += 1
                elif j == 0:
                    direction = 0 # Change direction to up-right
                    i += 1
                else:
                    i += 1
                    j -= 1
    
    # Step 4
        return result

##Spiral matrix
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
         result = []
         while matrix:
            result += matrix.pop(0) # 1

            if matrix and matrix[0]: # 2 
                for line in matrix:
                    result.append(line.pop())

            if matrix: # 3
                result += matrix.pop()[::-1]

            if matrix and matrix[0]: # 4
                for line in matrix[::-1]:
                    result.append(line.pop(0))
         return result