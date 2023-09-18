#Time Complexity : O(m*n) since we are iterating through each element
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: We take 4 pointers/variable for 4 corners (top, bottom, left, right). For top, we iterate through left to right pointers
# and append the values in the result and increment top pointer. For right, we iterate through top to bottom pointer and 
# append the values in the result and decrement right pointer. For bottom, we iterate through right to left pointer and 
# append the values in the result and decrement bottom pointer. For left, we iterate through bottom to top pointer and 
# append the values in the result and increment left pointer. To handle the edge case, we check the termination condition again before
# iterating for the bottom and left elements.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m-1
        left = 0
        right = n-1
        result = []
        while top <= bottom and left <= right:
            #top
            for j in range (left, right+1):
                result.append(matrix[top][j])
            top += 1
            #right
            for i in range (top, bottom+1):
                result.append(matrix[i][right])
            right -= 1
            #bottom
            if top <= bottom:
                for j in range(right, left-1, -1):
                    result.append(matrix[bottom][j])
                bottom -= 1
            #left
            if left <= right:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result