#Time Complexity: O(m*n)
#Space Complexity: O(1)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        diagonal=[]
        if not mat or not mat[0]:
            return diagonal
        rows, cols=len(mat), len(mat[0])
        up_right=True
        r,c=0,0
        while len(diagonal)<rows*cols:
            diagonal.append(mat[r][c])
            if up_right:
                if c == cols - 1:
                    r+=1
                    up_right=False
                elif r==0:
                    c+=1
                    up_right=False
                else:
                    r-=1
                    c+=1
            else:
                if r==rows-1:
                    c+=1
                    up_right=True
                elif c==0:
                    r+=1
                    up_right=True
                else:
                    r+=1
                    c-=1
        return diagonal