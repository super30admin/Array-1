class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        Time complexity O(m*n) Space complexity O(1)
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        m = len(mat)
        n = len(mat[0])
        result = [0 for _ in range(m*n)]
        i,j = 0,0
        dir = True
        for idx in range(0, m*n):
            result[idx] = mat[i][j]
            if(dir):
                if(i==0 and j!=n-1):
                    dir = False
                    j+=1
                elif(j==n-1):
                    dir = False
                    i+=1
                else:
                    i-=1
                    j+=1
            else:
                if(j==0 and i!=m-1):
                    dir = True
                    i+=1
                elif(i==m-1):
                    dir = True
                    j+=1
                else:
                    j-=1
                    i+=1
        return result
        