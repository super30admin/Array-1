# // Time Complexity : O(m*n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        rows= len(matrix)
        cols=len(matrix[0])
        top=0
        left=0
        right=cols-1
        bottom=rows-1
        res=[]

        while top<=bottom and left<=right:
            # L to R
            for c in range(left,right+1):
                res.append(matrix[top][c])
            top+=1
            #T to B
            for r in range(top,bottom+1):
                res.append(matrix[r][right])
            right-=1
            if top<=bottom:
                for c in range(right,left-1,-1):
                    res.append(matrix[bottom][c])
                bottom-=1
            if left<=right:
                for r in range(bottom,top-1,-1):
                    res.append(matrix[r][left])
                left+=1

        return res
