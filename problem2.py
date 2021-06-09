class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat[0])
        n = len(mat)
        dirc = 1
        c=0
        r = 0
        result = [0 for _ in range(m*n)]
        i = 0
        while i < m*n:
            result[i] = mat[r][c]
            if dirc == 1:
                if c == m-1:
                    r += 1
                    dirc = -1
                elif r ==0:
                    c +=1
                    dirc = -1
                else:
                    r -=1
                    c += 1
            
            else:
                if r == n-1:
                    c += 1
                    dirc = 1
                elif c ==0:
                    r +=1
                    dirc = 1
                else:
                    c -=1
                    r += 1
            i +=1
        
        return(result)
                    

#Time complexity is O(m*n) where m is length of row and n is length of column
#Space complexity is O(1) since we are not using any auxiliary data structure
#Approach used is when we hit the bounds of array we change directions 
                