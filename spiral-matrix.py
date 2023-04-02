# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english : Index out of range can be there if forget to put condition in middle

# Your code here along with comments explaining your approach
"""
start with 4 directions. first start with top row and go left to right and get all elements. top row is done so top += 1.
Then get the right row and start from top to bottom. repeat this procedure until top <= bottom and left <= right.

"""


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n = len(matrix)
        m = len(matrix[0])
        
        top = 0
        bottom = n - 1
        res = []
        left = 0
        right = m - 1

        while top <= bottom and left <= right:
            print(res)
            #get all elements from top row
            for i in range(left,right+1):
                res.append(matrix[top][i])
            top += 1
            #get all elements of right column
            for i in range(top, bottom + 1):
                res.append(matrix[i][right])
            right -= 1

            if not left <= right or not top <= bottom:
                break
            #get all elements of bottom row
            for i in range(right,left-1,-1):
                res.append(matrix[bottom][i])
            bottom -= 1
            #get all elements of left column
            for i in range(bottom,top-1,-1):
                res.append(matrix[i][left])
            left += 1
        return res
