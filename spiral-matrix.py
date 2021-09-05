class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)  #-- rows
        n = len(matrix[0]) # -- columns
        
        if(m == 1): #just one row or 1 column
            return matrix[0]
        if(n==1):
            return (matrix[i][0] for i in range(m))
        
        top = 0
        bottom = m-1
        right = n-1
        left = 0
        result = []

        while (left <= right and top <= bottom):
            
            #traversing top - towards right
            for i in range(left,right +1):
                result.append(matrix[top][i])
            
            top +=1  
           
            #traversing right - towards bottom
            for j in range(top,bottom +1):
                result.append(matrix[j][right])
            right -=1  
            
            #traversing bottom - towards left
            if top <= bottom:
                for k in range(right,left-1,-1):
                    result.append(matrix[bottom][k]) 
                bottom -=1  
            
            #traversing left - towards top
            if left <= right:
                for l in range(bottom,top-1,-1):
                    result.append(matrix[l][left])
                left +=1  
            
        return result
        
        
        
        