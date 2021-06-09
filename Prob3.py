#Time complexity: O(m*n)   
#Space complexity: O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        res = []
        
        left,right = 0, len(matrix[0])-1
        top,bottom = 0,len(matrix)-1
        while left<=right and top<=bottom:
            #top row
            for j in xrange(left,right+1):
                res.append(matrix[top][j])
            top+=1
            #right column
            for i in xrange(top,bottom+1):
                res.append(matrix[i][right])
            right-=1
            #main loop condition rechecked as top might've exceeded bottom
            if top<= bottom:
                #bottom row
                for j in xrange(right,left-1,-1):
                    res.append(matrix[bottom][j])
                bottom-=1
            #main loop condition rechecked as left might've exceeded right
            if left <= right:
                #left column
                for i in xrange(bottom,top-1,-1):
                    res.append(matrix[i][left])
                left+=1
        return res