// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m=len(mat)
        n=len(mat[0])
        k=0
        res=[]
        dir=1
        i,j=0,0
        while(k<m*n):
            res.append(mat[i][j])
            k+=1
            if dir==1:
                if j==n-1:
                    dir=-1
                    i+=1
                elif i==0:
                    dir=-1
                    j+=1
                else:
                    i-=1
                    j+=1
            elif dir==-1:
                if i==m-1:
                    dir=1
                    j+=1
                elif j==0:
                    i+=1
                    dir=1
                else:
                    i+=1
                    j-=1
        return res
            
        
