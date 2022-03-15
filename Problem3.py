#  Time Complexity : O(m*n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        ans = []
        left = 0
        right = cols = len(matrix[0])
        down = rows = len(matrix)
        up = 0
        
        while len(ans) < rows*cols:
        
            for col in range(left,right):
                ans.append(matrix[up][col])

            for row in range(up+1,down):
                ans.append(matrix[row][right-1])

            if up != down-1:
                for col in range(right-2, left-1, -1):
                    ans.append(matrix[down-1][col])

            if left != right-1:
                for row in range(down-2, up,-1):
                    ans.append(matrix[row][left])
                
            left += 1
            right -= 1
            up += 1
            down -= 1
            
        return ans
        