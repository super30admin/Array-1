"""498. Diagonal Traverse
Time Complexity: 0(NM)
Space Complexity: O(1)
"""
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if len(mat)==0:
            return []
        rows = len(mat)
        cols = len(mat[0])
        res_arr = [None]*(rows*cols)
        
        index = 0
        matrix_r = 0
        matrix_c = 0
        
        direction = 1 #going up
        while(index<(rows*cols)):
            res_arr[index] = mat[matrix_r][matrix_c]
            if direction ==1:
                if matrix_c+1>cols-1:
                    matrix_r+=1 #reached 2
                    direction = 0 #now we go down
                elif matrix_r-1 <0: ##reached 1
                    matrix_c+=1
                    direction=0
                else:             #all other case
                    matrix_r-=1
                    matrix_c+=1   
            else: # going down
                if matrix_r+1>rows-1: # last row - now we need t go up
                    matrix_c+=1
                    direction =1
                elif matrix_c -1<0:
                    matrix_r+=1
                    direction =1
                else:
                    matrix_r+=1
                    matrix_c-=1     
            index+=1
        return res_arr
                
            