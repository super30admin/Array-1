#Time complexity O(n*m) and space complexity O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat:
            return []
        n=len(mat)
      
        m=len(mat[0])
        r=0
        c=0
        # Initializing direction to one as up 
        dir=1
        dp=[0]*n*m
        i=0
        #Traversing through the loop to check the conditions
        while i<n*m:
            dp[i]=mat[r][c]
            i+=1
            if dir == 1:
        #Edge cases to handle if column is last and row is first
                if c==m-1:
                    r+=1
                    dir=0
                elif r==0:
                    c+=1
                    dir=0
                else:
                    c+=1
                    r-=1
            else:
        #Edge cases to handle if column is first and row is last
                if r==n-1:
                    c+=1
                    dir=1
                elif c==0:
                    r+=1
                    dir=1
                else:
                    c-=1
                    r+=1
                    
        return dp
