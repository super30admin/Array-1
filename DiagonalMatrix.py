#All TC passed on leetcode
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        #Here we traverse diagonally upward or downward. To do this we keep direction pointer
        #1 for upwards and -1 for downwards. In case of upward we have to either increment row or 
        #column based on current position. Similarly for downward we have to increment row 
        #or column based on current position.
        #Time complexity - O(m.n) where m=rows and n=cols
        #Space complexity - O(1) as space alloted for o/p is not considered 
        rows = len(mat)
        cols = len(mat[0])
        dir = 1
        res = []
        idx = 0
        r=0
        c=0

        while idx<rows*cols:
            res.append(mat[r][c])
            idx+=1
            if dir==1:
                if r==0 and c!=cols-1:
                    c+=1
                    dir=-1
                elif c==cols-1:
                    r+=1
                    dir=-1
                else:
                    c+=1
                    r-=1
            else:
                if c==0 and r!=rows-1:
                    r+=1
                    dir=1
                elif r==rows-1:
                    c+=1
                    dir=1
                else:
                    r+=1
                    c-=1
        return res


        
        