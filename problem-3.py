# Leetcode: YES 
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        right_col=len(matrix[0])-1
        bottom_row=len(matrix)-1
        left_col=0
        top_row=0
        result=[]
        # making use of left col ad right col to see if we have covered al cols and top roe and bottom row to see if we have covered all rows 
        while(left_col<=right_col and top_row<=bottom_row):
               
                # //move right
                for i in range(left_col,right_col+1 ):
                    result.append(matrix[top_row][i])
            
               
                top_row+=1
            
                # move down 
                for i in range(top_row, bottom_row+1):
                    result.append(matrix[i][right_col])
                    
                right_col-=1
               
                
            
                
                # move left
                if top_row <= bottom_row:
                    for i in range(right_col,left_col-1,-1 ):
                        result.append(matrix[bottom_row][i])
                
                bottom_row-=1
    
                # move up
                if left_col<=right_col:
                    for i in range(bottom_row, top_row-1,-1):
                        result.append(matrix[i][left_col])
                left_col+=1
        return result
                
            
            
        