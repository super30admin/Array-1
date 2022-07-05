from pip import List
#Time Complexity = O(n)
#Space Complexity = O(1)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if(len(mat)==0):
            return []
        m = len(mat)
        n = len(mat[0])
        res = [0] * (m*n)
        r = 0
        c = 0
        index = 0
        dir = 1
        while(index<(m*n)):
            res[index]=mat[r][c]
            if(dir == 1):
                if(c == n-1):
                    dir = -1
                    r+=1
                elif(r==0):
                    dir = -1
                    c+=1
                else:
                    r-=1
                    c+=1
            else:
                if(r == m-1):
                    dir = 1
                    c+=1
                elif(c==0):
                    dir = 1
                    r+=1
                else:
                    c-=1
                    r+=1
            index+=1
        return res
                
            
        
        