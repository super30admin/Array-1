# Time Complexity : O(n*m)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix) == 0:
            return []
        
        res = []
        i, j, cnt = 0, 0, len(matrix) * len(matrix[0])
        lLimit = 0
        rLimit = len(matrix[0])-1
        uLimit = 0
        dLimit = len(matrix) - 1
        while True:
            while j <= rLimit:
                res.append(matrix[i][j])
                cnt -= 1
                j += 1
            
            if cnt == 0:
                break
            
            j -= 1
            i += 1
            
            while i <= dLimit:
                res.append(matrix[i][j])
                cnt -= 1
                i += 1
            
            if cnt == 0:
                break
            
            i -= 1
            j -= 1
            
            while j >= lLimit:
                res.append(matrix[i][j])
                cnt -= 1
                j -= 1
            
            if cnt == 0:
                break
            
            j += 1
            i -= 1
            
            while i > uLimit:
                res.append(matrix[i][j])
                cnt -= 1
                i -= 1
                
            if cnt == 0:
                break
                
            i += 1
            j += 1
            lLimit += 1
            rLimit -= 1
            uLimit += 1
            dLimit -= 1
            
        return res