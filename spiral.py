# // Time Complexity :O(m*n) where m is the rown ,n is the column
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach
    






class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        print(matrix)
        top=0
        bottom=len(matrix)-1
        right=len(matrix[0])-1
        left=0
        res=[]
        while top<=bottom and left<=right:
            for i in range(top,right+1):
                res.append(matrix[top][i])
            top=top+1
        
            for i in range(top,bottom+1):
                res.append(matrix[i][right])
            right=right-1
            if top<=bottom:
                for i in range(right,left-1,-1):
                    res.append(matrix[bottom][i])
                bottom=bottom-1
            if left<=right:
                for i in range(bottom,top-1,-1):

                    res.append(matrix[i][left])

                left=left+1

        return res
                