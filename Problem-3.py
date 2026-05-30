# Time Complexity : O(m * n) 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# We will create four pointers up, down, left and right to keep track of the boundaries of the matrix.
# We will traverse the matrix in a spiral manner by first traversing from left to right, then from top to bottom, then from right to left and finally from bottom to top.
# We will keep updating the pointers after each traversal to shrink the boundaries of the matrix and continue the traversal until we have traversed all the elements in the matrix.  


# Your code here along with comments explaining your approach
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        m,n=len(matrix),len(matrix[0])
        up,down=0,m-1
        left,right=0,n-1
        res=[]
        #shrinking the spiral and making sure that we stay within the boundary without overlapping the cells
        while up<=down and left<=right: 
            #collecting the matrix values from left to right
            # j because we are iterating through columns
            for j in range(left, right+1):
                res.append(matrix[up][j])
            #since we have finished the one row updating up to indicate we are shrinking the row from up
            up+=1
            for i in range(up, down+1):
                res.append(matrix[i][right])
            #since we have finished the one column updating right to indicate we are shrinking the column from right
            right-=1
            # if up is less than or equal to down then only we will traverse from right to left because if up is greater than down then it means we have already traversed all the rows and we should not traverse again
            if up <= down:
                for j in range(right, left - 1, -1):
                    res.append(matrix[down][j])
            down -= 1
            #now if left is less than or equal to right then only we will traverse from bottom to top because if left is greater than right then it means we have already traversed all the columns and we should not traverse again
            if left <= right:
                for i in range(down, up - 1, -1):
                    res.append(matrix[i][left])
            left += 1
        return res