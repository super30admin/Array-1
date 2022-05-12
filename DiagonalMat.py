'''
time complexity: O(R*C)
R - len of row of mat, C - len of col of mat
space complexity: O(1)
'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if(len(mat)==0):
            return []
        
        rows = len(mat)
        cols = len(mat[0])
        ans = [None] * (rows*cols)
        index = 0
        mat_r = 0
        mat_c = 0
        direction = 1
        
        while(index<(rows*cols)):
            ans[index] = mat[mat_r][mat_c]
            
            if direction == 1:
                if(mat_c + 1 > cols-1):
                    mat_r+=1
                    direction = 0
                elif(mat_r-1 < 0):
                    mat_c+=1
                    direction = 0
                else:
                    mat_r-=1
                    mat_c+=1
            else:
                if(mat_r + 1 > rows-1):
                    mat_c+=1
                    direction = 1
                elif(mat_c-1 < 0):
                    mat_r+=1
                    direction = 1
                else:
                    mat_r+=1
                    mat_c-=1
            index+=1
        return ans