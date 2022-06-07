# Time Complexity: O(m*n)
# Space Complexity: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        res=[]
        r=len(mat)
        c=len(mat[0])
        di=1
        i,j=0,0
        while(len(res)<r*c):
            res.append(mat[i][j])
            if di==1:
                if i==0 and j!=c-1:
                    j+=1
                    di=-1
                elif j==c-1:
                    i+=1
                    di=-1
                else:
                    i-=1
                    j+=1
            else:
                if j==0 and i!=r-1:
                    i+=1
                    di=1
                elif i==r-1:
                    j+=1
                    di=1
                else:
                    i+=1
                    j-=1
        return res
                    
            
        