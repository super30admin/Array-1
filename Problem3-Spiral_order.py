class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        #base condition
        if not matrix:
            return []
        #make 4 boundary conditions
        top=0 
        bottom=len(matrix)-1
        left=0
        right=len(matrix[0])-1
        result=[]
        #exit condition from loop
        while (top<=bottom and left<=right):
            #[123]>>left to right
            for i in range(left,right+1):
                result.append(matrix[top][i])  
            #go to next row
            top+=1
            #since row has changed, again check exit condition
            #[69]>>top to bottom
            if (top<=bottom and left<=right):
                for i in range(top,bottom+1):
                    result.append(matrix[i][right]) 
            #go towards left
            right-=1
            #since column has changed, again check exit condition
            #[87]>>right to left reverse direction
            if (top<=bottom and left<=right):
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i]) 
            #since column has changed, again check exit condition
            #[4]>>bottom to top reverse direction       
            bottom-=1
            if (top<=bottom and left<=right):
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left]) 
            #since column has changed, again check exit condition and go to left
            #travel again in 1st for loop>>[5]
            left+=1
        return(result)


#O(m*n)
# O(1) as result matrix was supposed to return so no auxiliary space         
            
                    
            