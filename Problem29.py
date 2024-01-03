'''
Time complexity: O(mxn)
Space complexity: O(mxn)
'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        i = j = idx = 0
        dirc = True
        result = [1] * (m*n)

        for idx in range(0,len(result)):
            result[idx] = mat[i][j]
            if(dirc):
                if (i==0 and j!=n-1):
                    j+=1
                    dirc=False
                elif (j==n-1):
                    i+=1
                    dirc=False
                else:
                    i-=1
                    j+=1
            else:
                if (j==0 and i!=m-1):
                    i+=1
                    dirc=True
                elif (i==m-1):
                    j+=1
                    dirc=True
                else:
                    j-=1
                    i+=1

        return result