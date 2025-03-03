from typing import List

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat:
            return []

        m = len(mat)
        n = len(mat[0])
        i =0
        j=0
        result =[]
        dir =False
        while i<m and j<n:
            result.append(mat[i][j])
            if dir == False:
                if j==n-1:
                    i =i+1
                    dir = True
                elif i==0:
                    j=j+1
                    dir = True
                else:
                    i=i-1
                    j=j+1
            else:
                if i == m-1:
                    j= j+1
                    dir = False
                elif j==0:
                    i=i+1
                    dir = False
                else:
                    i=i+1
                    j=j-1
        return result        