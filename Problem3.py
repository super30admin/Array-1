#Time complexity: O(m*n) where m and n are columns and rows respectively of the input matrix
#Space complexity O(1)

#Accepted on leetcode

#Approach: 
#Maintain boundaries for top, bottom, left and right
#Start moving left to right (top row) until exhausted, when done move the top below by one
#Move top to bottom (right row) until exhausted, when down move right to the left by 1
#Similarly traverse spirally in all directions and keep reducing the boundaries until top crosses bottom or left crosses right


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        A = matrix
        rows = len(matrix)
        cols = len(matrix[0])
        top = 0
        bottom = rows - 1
        left = 0
        right = cols - 1
        soln = []

        while top <= bottom and left<=right:
            for j in range(left, right+1):
                soln.append(A[top][j])
            top += 1
        
            if left<=right:
                for i in range(top, bottom + 1):
                    soln.append(A[i][right])
                right -= 1
            else:
                break
            
            if top <= bottom:
                for j in range(right, left - 1, -1):
                    soln.append(A[bottom][j])
                bottom -= 1
            else:
                break

            if left <= right:
                for i in range(bottom, top - 1, -1):
                    soln.append(A[i][left])
                left += 1
            else:
                break
        
        return soln

