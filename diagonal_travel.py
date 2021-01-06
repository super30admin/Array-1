# Time Complexity : O(m * n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        i = j = 0
        m, n= len(matrix), len(matrix[0])
        res = []
        while i < m  and j < n:
            
            # go upwards
            while i >= 0 and j < n:
                res.append(matrix[i][j])
                i -= 1
                j += 1
            
            # if we go too far, adjust and get ready to go downward
            i+= 1
            if j == n:
                j -= 1
                i += 1
            
            # go downward
            while i < m and j >=0:
                res.append(matrix[i][j])
                i += 1
                j -= 1
            
            # if we go to far, adjust and get ready to go upward next iteration
            j += 1
            if i == m:
                j += 1
                i -= 1            
            
        
        
        return res
