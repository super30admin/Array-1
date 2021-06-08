class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows = len(mat)
        columns = len(mat[0])
        r = 0
        c = 0
        dir = 1
        i=0
        arr = []
        while(i<rows* columns):
            arr.append(mat[r][c])
            if dir==1:
                if c == columns-1:
                    dir = -1
                    r+=1
                elif r == 0:
                    dir = -1
                    c+=1
                else:
                    r-=1
                    c+=1
            else:
                if r == rows-1:
                    dir = 1
                    c+=1
                elif c == 0:
                    dir = 1
                    r+=1
                else:
                    c-=1
                    r+=1
            i+=1
        return arr
    
"""Time complexity - O(mn)
Space Complexity - O(1)"""
                
            
        