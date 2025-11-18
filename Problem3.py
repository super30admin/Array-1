class Solution(object):
    def spiralOrder(self, matrix):
        """
        Time complexity O(m*n) Space complexity O(1)
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        res = []
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m-1
        left = 0
        right = n-1
        if not matrix or not matrix[0]:
            return res

        while(top<=bottom and left<=right):
            for j in range(left, right+1):
                res.append(matrix[top][j])
            top+=1
            
            for i in range(top, bottom+1):
                res.append(matrix[i][right])
            right-=1
            if(top<=bottom):
                for j in range(right, left-1,-1):
                    res.append(matrix[bottom][j])
                bottom-=1
            if(left<=right):
                for i in range(bottom, top-1,-1):
                    res.append(matrix[i][left])
                left+=1
        return res
        