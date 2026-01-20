# Time Complexity :O(m*n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach
# iterate in each direction until we reach the boundary set
#start with right, down, left and up, repeat this until all the elements of matrix are added to result
# top - O(m*n)
# space - O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m=len(matrix)
        n=len(matrix[0])
        count=m*n
        top=0
        down=m-1
        left=0
        right = n-1
        dir="right"
        result=[]
        while len(result)<count:
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top=top+1
            for i in range(top, down + 1):
                result.append(matrix[i][right])
            right=right-1
            if top <= down:
                for i in range(right, left - 1, -1):
                    result.append(matrix[down][i])
                down=down-1
            if left <= right:
                for i in range(down, top - 1, -1):
                    result.append(matrix[i][left])
                left=left+1
        return result
            