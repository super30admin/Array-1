# Spiral Order
# // Time Complexity : O(n) or O(n^2) Confused 
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : Did this long ago I will need to understand it again 
# // Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, Matrix: List[List[int]]) -> List[int]:
        if not Matrix:
            return []
        rowbegin = 0
        rowend = len(Matrix)
        colbegin = 0
        colend = len(Matrix[0])
        res = []
  
        while rowbegin < rowend and colbegin < colend:
            for i in range(colbegin,colend):
                res.append(Matrix[rowbegin][i])
                
            for j in range(rowbegin+1, rowend-1):
                res.append(Matrix[j][colend-1])
            
            if rowend != rowbegin+1:
                for i in range(colend-1, colbegin-1, -1):
                    res.append(Matrix[rowend-1][i])
            
            if colbegin != colend-1:
                for j in range(rowend-2, rowbegin, -1):
                    res.append(Matrix[j][colbegin])
            
            rowbegin += 1
            colbegin += 1
            rowend -= 1
            colend -= 1
        
        return res
        