#timecomplexity O(m*n)
#spacecomplexity O(1) becouse function is returning list created in list and returing that only
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        # 4 direction top bottom left right
        if matrix==[]: return []
        left=0
        right=len(matrix[0])-1
        bottom=len(matrix)-1
        print(right)
        print(bottom)
        top=0
        result =[]
        
        while (left<=right and top<=bottom):
            for i in range(left,right+1):
               
                result.append(matrix[top][i])
            top+=1
            
            if left<=right and top<=bottom:
                 for i in range(top,bottom+1):
                    result.append(matrix[i][right])
            right-=1
           
            if left<=right and top<=bottom: 
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
            bottom-=1
          
            if left<=right and top<=bottom: 
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
            left+=1
            print(result)
            
            
        return result
            
                