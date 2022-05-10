#Time complexity: O(m*n)
#Space complexity: O(1)
class Solution:
    def spiralOrder(self, matrix):
        lst=[]
        m,n=len(matrix),len(matrix[0])
        top,bottom,left,right=0,m-1,0,n-1
        while(top<=bottom and left <=right):
            if top<=bottom and left <=right:
                for i in range(left,right+1):
                    lst.append(matrix[top][i])
                top+=1
            
            if top<=bottom and left <=right:
                for i in range(top,bottom+1):
                    lst.append(matrix[i][right])
                right-=1
            
            if top<=bottom and left <=right:
                for i in range(right,left-1,-1):
                    lst.append(matrix[bottom][i])
                bottom-=1
            
            if top<=bottom and left <=right:
                for i in range(bottom,top-1,-1):
                    lst.append(matrix[i][left])
                left+=1
        return lst
                
        