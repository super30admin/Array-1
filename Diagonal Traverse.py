# TC-O(n*m)
# SC-O(n*m)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if (len(mat )= =0 or len(mat[0] )= =0):
            return [0] m=len(mat)
        n=len(mat[ 0 ])
        print(n,m)
        idx=0
        dire=1
        i=0
        j=0
        arr=[0]*(n*m )
        while(idx<m*n) :
            arr[idx]=mat[i][j ]
            idx+=1

            if dire==1:
                if j==n-1:
                    dire=-1
                    i+=1
                elif i==0:
                    dire=-1
                    j+=1
                else:
                    i-=1
                    j+=1
            else:
                if i==m-1:
                    dire=1
                    j+=1
                elif j==0:
                    dire=1
                    i+=1
                else:
                    i+=1
                    j-=1
        return arr