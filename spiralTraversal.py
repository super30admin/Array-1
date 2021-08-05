"""
//Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO
"""




class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix)==0:
            return []
        m = len(matrix)
        n = len(matrix[0])
        result = []
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1
        while(top<=bottom and left<=right):
            #left to right
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top+=1
            #top to bottom
            if top<=bottom and left<=right:
                for i in range(top,bottom+1):
                    result.append(matrix[i][right])
            right-=1
            #right to left
            if top<=bottom and left<=right:
                
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
            bottom-=1
            #bottom to. top
            if top<=bottom and left<=right: 
                for i  in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
            left+=1
        return result