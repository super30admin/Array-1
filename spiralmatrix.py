# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to use four boundary pointers and iterate the matrix based on the direction to proceed to forma spiral order 
# l-> r, t->b, r->l, b->t by storing each value in every iteration then return the resultant list.

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        m=len(matrix)
        n=len(matrix[0])
        left=0
        right=n-1
        top=0
        bottom=m-1
        res=[]
        while(left<=right and top <= bottom):
            
            for j in range(left, right+1):
                res.append(matrix[top][j])
            top+=1

            if(left<=right and top <=bottom):
                for i in range(top, bottom+1):
                    res.append(matrix[i][right])
            right-=1

            if(left<=right and top <=bottom):
                for j in range(right, left-1, -1):
                    res.append(matrix[bottom][j])
            bottom-=1

            if(left<=right and top <=bottom):

                for i in range(bottom, top-1, -1):
                    res.append(matrix[i][left])
                left+=1
        return res