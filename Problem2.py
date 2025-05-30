class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        n = len(mat[0])
        m = len(mat)

        arr = [0] * (m*n)
        dir = True
        i = 0
        j = 0

        for idx in range(0,len(arr)):
            arr[idx] = mat[i][j]
            
            if(dir):
                if j==n-1:
                    i+=1
                    dir = False
                elif i==0:
                    j+=1
                    dir = False
                else:
                    i-=1
                    j+=1
            else:

                if i== m-1:
                    dir = True
                    j+=1
                elif j == 0:
                    i+=1
                    dir = True
                else: 
                    i+=1
                    j-=1
        
        return arr
                