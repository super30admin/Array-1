class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if not matrix:
            return None
            
        m = len(matrix)
        n = len(matrix[0])
        solution =[]
        left,top,right,bottom = 0,0,n-1,m-1
        
        while right>=left and bottom>=top:
            
            for i in range(top,right+1):
                solution.append(matrix[top][i])
            
            top+=1
            
            for i in range(top, bottom+1):
                solution.append(matrix[i][right])
            
            right-=1
            
            if bottom>=top:
                for i in range(right, left-1, -1):
                    solution.append(matrix[bottom][i])
                bottom-=1
            
            if right>=left :
                for i in range(bottom, top-1,-1):
                    solution.append(matrix[i][left])
                left+=1

        return solution
            
#  Array problem, no approach fixed, go with the flow.
#  time complexity is O(n*m)
        
        
