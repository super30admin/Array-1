# Time Complexity : O(mn)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : took time thinking about logic

# we are going to have four pointers to set our boudnaries for each spiral- top, bottom, left and right. 
# after each spiral we update the boundaries such that it will only iterate over the next set of values as needed.
# also took care of the edge case where top and bottom cross each other and left and right cross each other. 
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        m=len(matrix)
        n=len(matrix[0])
        dlen=(m*n)
        ans=[]*dlen
        left, right = 0, n-1
        top , bottom = 0, m-1
        while(left<=right and top<=bottom):
            for j in range(left,right+1):
                ans.append(matrix[top][j])
            top+=1
            for i in range(top, bottom+1):
                ans.append(matrix[i][right])
            right-=1
            if(top<=bottom):
                for j in range(right, left-1, -1):
                    ans.append(matrix[bottom][j])
                bottom-=1
            if(left<=right):
                for i in range(bottom, top-1, -1):
                    ans.append(matrix[i][left])
                left+=1
        return ans