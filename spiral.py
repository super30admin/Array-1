# Time Complexity : O(m* n)
# Space complexity :O(1) - Auxiliary space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Using 4 pointers to keep track of the top, bottom, left and right of the matrix.
# After completing each side of a layer,will update the boundary pointer to inwards and stop when the boundareis cross(left > right or top > bottom).


class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        top,bottom = 0, len(matrix)
        left, right = 0, len(matrix[0])
        res = []
        while left < right and top < bottom:
            #every top row
            for i in range(left,right):
                res.append(matrix[top][i])
            top += 1
            
            #every right col
            for i in range(top, bottom):
                res.append(matrix[i][right-1])
            right -= 1

            #need if not square matrix
            if not (left <right and top < bottom):
               break

            #every bottom row
            for i in range(right-1,left-1,-1):
                res.append(matrix[bottom-1][i])
            bottom -=1

            #every left col
            for i in range(bottom-1, top-1,-1):
                res.append(matrix[i][left])  
            left +=1

        return res