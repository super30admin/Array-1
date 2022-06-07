# time complexity is o(mn), where m is number of rows in matrix and n is number of columns in matrix
# space complexity is o(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        r = len(mat)
        c = len(mat[0])
        i = 0
        j = 0
        direc = 1
        res = [0 for i in range(r*c)]
        for k in range(len(res)):
            res[k] = mat[i][j]
            if(direc ==1):
                if(i==0 and j != c-1):
                    j += 1
                    direc = -1
                elif(j == c-1):
                    i += 1
                    direc = -1
                else:
                    i -= 1
                    j += 1    
            else:
                if(j==0 and i != r-1):
                    i += 1
                    direc = 1
                elif(i == r-1):
                    j += 1
                    direc = 1
                else:
                    i += 1 
                    j -= 1
        return res
                    
            
            
        