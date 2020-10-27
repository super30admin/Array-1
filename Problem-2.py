class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:

        if matrix is None or len(matrix)==0:
            return []

        i=0;j=0;idx=0;dirr=1
        m= len(matrix)
        n=len(matrix[0])
        res=[0]*(m*n)

        while(idx<m*n):
            res[idx]=matrix[i][j]
            if dirr==1: #upward
                if j == n-1:
                    i+=1
                    dirr=-1
                elif i==0:
                    j+=1
                    dirr=-1
                else:
                    i-=1
                    j+=1
            else: #downward
                if i==m-1:
                    j+=1
                    dirr=1
                elif j==0:
                    i+=1
                    dirr=1
                else:
                    i+=1
                    j-=1
            idx+=1

        return res
#Time complexity: O(m+n)
#space: O(1)
