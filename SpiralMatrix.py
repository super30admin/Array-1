
# Time Complexity : O(N*M)
# Space Complexity : O(1)  
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I am using a while loop to traverse the matrix in a spiral order. 
# I maintain four pointers to keep track of the boundaries of the current layer.
# I keep checking the position like left, right, top, bottom and run for loop to 
# append those values and end the while loop when the size of result is equal to the total number of elements in the matrix.

from typing import List

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:            
        n = len(matrix)
        m = len(matrix[0])
        left = 0 
        top = 0
        right = m-1
        bottom = n-1
        ans = []
        while len(ans) < n*m:
            for i in range(left,right+1):
                ans.append(matrix[top][i])
            # print(ans)
            top += 1
            for i in range(top,bottom+1):
                ans.append(matrix[i][right])
            right -= 1
            print(right,"top")
            print(bottom,"bottom")
            if top <= bottom:
                for i in range(right,left-1,-1):
                    ans.append(matrix[bottom][i])
                bottom -=1
            if left >= right:
                for i in range(bottom,top-1,-1):
                    ans.append(matrix[i][left])
                left += 1
        # print(ans) 
        return ans
