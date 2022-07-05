class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m=len(matrix)
        n=len(matrix[0])
        
        result=[]
        index=0
        top=0
        bottom=m-1
        left=0
        right=n-1
        r=0
        c=0
        
        
        while (top<=bottom and left<=right):
            
            for i in range(left,right+1):
                result.append(matrix[top][i])
                
            top+=1
            
            if left<=right:
                for i in range(top,bottom+1):
                    result.append(matrix[i][right])

                right-=1
            
            if top<=bottom:
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])

                bottom-=1
            
            if left<=right:
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])

                left+=1
            
        return result
                
            
        