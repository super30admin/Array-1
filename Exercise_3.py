# Time Complexity: O(m*n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No


class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        top = 0
        left = 0
        m = len(matrix)
        n = len(matrix[0])
        right = n - 1
        bottom = m - 1
        res = []
        
        while(left<=right and top<=bottom):
            
            for i in range(left, right+1):
                res.append(matrix[top][i])
            top+=1
            
            for i in range(top, bottom+1):
                res.append(matrix[i][right])
            right-=1
            
            if(top<=bottom):
                for i in range(right, left-1, -1):
                    res.append(matrix[bottom][i])
                bottom-=1
            
            if(left<=right):
                for i in range(bottom, top-1, -1):
                    res.append(matrix[i][left])
                left+=1
            
        return res           