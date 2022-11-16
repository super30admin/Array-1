#Time Complexity: O(m*n)
#Space Complexity: O(1)
#Successfully ran on leetcode

class Solution:
    def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
        rows = len(mat)
        cols = len(mat[0])
        result=[]
        direction = 1
        index=0
        i,j=0,0
        while index<(rows*cols):
            result.append(mat[i][j])
            index+=1
            if direction==1:
                if j==cols-1:
                    direction=-1
                    i+=1
                elif i==0:
                    direction=-1
                    j+=1
                else:
                    i-=1
                    j+=1
                    
            elif direction==-1:
                if i==rows-1:
                    direction=1
                    j+=1
                elif j==0:
                    direction=1
                    i+=1
                else:
                    i+=1
                    j-=1                
        return result