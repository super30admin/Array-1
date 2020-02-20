#// Time Complexity : O(mn)
#// Space Complexity : O(1)
#// Did this code successfully run on Leetcode : Yes
#// Any problem you faced while coding this : The edge case incuded inside the function has taken some time to come up with.


#// Your code here along with comments explaining your approach
#we start this problem with four pointers.left and top at index 0 and right at the end of first row and bottom pointer is at the end of the#first column.we solve thi problem by reducing the scope of pointer traversal.we start by traversing from left to right then we decrement #top pointer indicating the first row is done.Next we go with top to bottom and then decrement the right pointer.Next we start from right #to left and then decrement bottom pointer and then we traverse from bottom to top and increment the left pointer.we do this process till #all the elements in the array are exhausted and then while traversing store them in a output array.



class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix)==0 or matrix==None:
            return []
        left=0
        right=len(matrix[0])-1
        top=0
        bottom=len(matrix)-1
        out=[]
        
        while (left<=right and top<=bottom):
            for i in range(left,right+1):
                out.append(matrix[top][i])
            top=top+1
            print(out)
            for j in range(top,bottom+1):
                out.append(matrix[j][right])
            right=right-1
            print(out)
            if top<=bottom:
                for i in range(right,left-1,-1):
                    out.append(matrix[bottom][i])
                bottom=bottom-1
            print(out)
            if left<=right:
                for i in range(bottom,top-1,-1):
                    out.append(matrix[i][left])
                left=left+1
        print(out)
        return(out)
            
        
        