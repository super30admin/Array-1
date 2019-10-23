#leet code -Spiral problem -54
#Time complexity -O(MN)
#Approach - we need to have four pointers to traverse through the matrix. top,bottom,left,right.
# passed the test cases.




class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        
        """
        result=[]
        
        if len(matrix)==0 or matrix ==[]:
            return result
       
        m=len(matrix)
        n=len(matrix[0])
        top=0
        left=0
        bottom=m-1
        right=n-1
        
        while (left<=right and top<=bottom):
            
            #top row
            for i in range(left,right+1):
                result.append(matrix[top][i])
            
            top=top+1
            
            #right column
            for i in range(top,bottom+1):
                result.append(matrix[i][right])
            right=right-1
            
            #bottom row
            if(top<=bottom):
                for i in range(right,left-1,-1):
                     result.append(matrix[bottom][i])
           
            bottom =bottom-1
            
           #left column:
           
            if(left<=right):
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                    
            left=left+1
            
        return result
            
                
            