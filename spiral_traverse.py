# Time Complexity : O(M*N) when M is number rows of the matrix and N is number of columns in the matrix
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def spiralOrder(self, matrix):
        top, left, bottom, right = 0, 0, len(matrix) - 1, len(matrix[0]) - 1
        i = 0
        result = []
        while top <= bottom and left <= right:
            #Printing elements from LEFT to RIGHT
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1
            
            #Printing elements from TOP to BOTTOM
            if left <= right:
                for i in range(top, bottom + 1):
                    result.append(matrix[i][right])
                right -= 1
            
            #Printing elements from RIGHT to LEFT
            if top <= bottom:
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            
            #Printing elements from BOTTOM to TOP
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left]) 
                left += 1
            
        return result

solution = Solution()
print(f"OUTPUT >> {solution.spiralOrder([[1,2,3],[4,5,6],[7,8,9]])}")