class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix is None or len(matrix)==0:
            return []
        result = []
        left=0
        right = len(matrix[0])-1
        top =0
        bottom = len(matrix)-1
        d = 0  # 0:LR , 1:TB , 2:RL, 3: BT
        
        while(left<=right and top<=bottom):
            if d==0:
                for i in range(left,right+1):
                    result.append(matrix[top][i])
                top +=1
                
            elif d==1:
                for i in range(top,bottom+1):
                    result.append(matrix[i][right])
                right-=1
            
            elif d==2:
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom-=1
                    
            else:
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left+=1
                
            d = (d+1)%4
        
        return result
        
        
        
        