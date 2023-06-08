# // Time Complexity : O(M*N)
# // Space Complexity : O(M*N). 
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row = len(mat)
        column = len(mat[0])
        print('Rows are',row, 'and columns are',column)
        result = [0] * (len(mat) * len(mat[0]))
        idx = 0
        dir  = True
        i=0
        j=0
        while (idx < len(result)):
            result[idx]=mat[i][j]
            idx+=1
            if dir:
                if (i==0 and j!=column-1):
                    j+=1
                    dir = False
                elif ( j== column-1):
                    i+=1
                    dir = False
                else:
                    i-=1
                    j+=1

            else:
                if (j==0 and i!=row-1):
                    i+=1
                    dir = True
                elif ( i== row-1):
                    j+=1
                    dir = True
                else:
                    j-=1
                    i+=1
        return result