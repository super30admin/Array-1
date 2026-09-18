# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
#We will traverse the elements in the matrix by using 4 pointers left, right, top and bottom:
#We will run the loop until left <= right and top <= bottom and get the elements from each row and column using for loop
#For each loop we need to check whether boundary condition is breached or not

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        m = len(matrix)
        n = len(matrix[0])
        left = 0
        right = n-1
        top = 0
        bottom = m-1
        result = []
        while left <= right and top <= bottom:
            #top row
            for j in range(left, right+1):
                result.append(matrix[top][j])
            top += 1
            #right col
            if left <= right and top <= bottom:
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])
                right -= 1
            #bottom row
            if left <= right and top <= bottom:
                for j in range(right, left-1, -1):
                    result.append(matrix[bottom][j])
                bottom -= 1
            #left col
            if left <= right and top <= bottom:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result