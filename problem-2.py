#Time: O(m*n)
#Space: O(1)
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        if m==0:
            return []
        n = len(matrix[0])
        
        res = []
        r=c=0
        for i in range(m*n):
            res.append(matrix[r][c])
            
            if (r+c)%2==0:
                # r-- , c++
                if c==n-1:
                    r+=1
                elif r==0:
                    c+=1
                else:
                    r-=1
                    c+=1
            else:
                # r++ , c--
                if r==m-1:
                    c+=1
                elif c==0:
                    r+=1
                else:
                    r+=1
                    c-=1
        
        return res
            
            