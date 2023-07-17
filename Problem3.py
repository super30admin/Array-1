# Time Complexity : O(m*n)
# Space Complexity : O(m*n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m=len(mat)
        n=len(mat[0])
        Flag=True
        result=[0 for i in range(m*n)]
        r=0
        c=0
        for i in range(0,(m*n)):
            result[i]=mat[r][c]
            print(result[i])
            if Flag==True:
                if c==n-1:
                    Flag=False
                    r+=1
                    
                elif r==0:
                    Flag=False
                    c+=1

                else:
                    r-=1
                    c+=1
            else:
                if r==m-1:
                    Flag=True
                    c+=1
                    
                elif c==0:
                    Flag=True
                    r+=1

                else:
                    r+=1
                    c-=1            
        print(result)
        return result
