#Time Complexity: O(n)
#Space Complexity: O(1)
#BFS or any graph algorithm can't be used because there are no connected components
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m=len(mat)
        n=len(mat[0])
        up=True
        result=m*n
        i=0
        j=0
        output=[0]*(result)
        for idx in range(0, len(output)):
                output[idx]=mat[i][j]
                if up:
                    if j==n-1:
                        i=i+1
                        up=False
                    elif i==0:
                        j=j+1
                        up=False
                    else:
                        i=i-1
                        j=j+1
                else:
                    if i==m-1:
                        j=j+1
                        up=True
                    elif j==0:
                        i=i+1
                        up=True
                    else:
                        i=i+1
                        j=j-1
        return output
                
        