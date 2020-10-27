#Timecomplexity O(m*n)
#Spacecomplexity O(1)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix)  == 0: return []
        m = len(matrix)
        n = len(matrix[0])
        result = []
        left, right = 0, n-1
        up, down = 0, m-1
  
        
        while(up<=down and left<=right):
            
            if up<=down and left<=right:
                for j in range(left,right+1):
                    result.append(matrix[up][j])
                up+=1
                
            if up<=down and left<=right:
                for j in range(up, down+1):
                    result.append(matrix[j][right]) 
                right-=1
                
            if up<=down and left<=right:
                for j in range(right, left-1, -1):
                    result.append(matrix[down][j])  
                down-=1
            
            if up<=down and left<=right:
                for j in range(down, up-1, -1):
                    result.append(matrix[j][left])  
                left+=1
                
        return result
                
        