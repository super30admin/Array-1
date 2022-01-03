# Time Complexity : O(MN)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
'''
I use boundaries: top, left, right, and bottom. After traversing in a direcion I change the necessary boundary. This reduces my traversal space.
After each traversal, I check if the number of elements in my list is as many as I needed. If they are then I break.
'''

# Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])

        top = 0
        left = 0
        right = n - 1
        bottom = m - 1
        result = []
        
        while True:
            for col in range(left, right + 1):
                result.append(matrix[top][col])
            top += 1
            if len(result) == m * n:
                break
            
            for row in range(top, bottom + 1):
                result.append(matrix[row][right])
            right -= 1
            if len(result) == m * n:
                break
                
            for col in range(right, left - 1, -1):
                result.append(matrix[bottom][col])
            bottom -= 1
            if len(result) == m * n:
                break
            
            for row in range(bottom, top - 1, -1):
                result.append(matrix[row][left])
            left += 1
            if len(result) == m * n:
                break
        
        return result
            