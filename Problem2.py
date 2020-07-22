#Arrays-1
#Problem 2 : https://leetcode.com/problems/diagonal-traverse/
#Test Cases Passed on LeetCode
#Time Complexity-O(m*n) m=no of rows;n=no of cols
#Space Complexity-O(1)

class Solution:
    def findDiagonalOrder(self, matrix):
        if matrix is None or len(matrix)==0:
            return []
        m=len(matrix)
        n=len(matrix[0])
        result=[]
        r=0
        c=0
        i=0
        #for "up" dir=1 for "down" dir=-1
        dir=1
        while i<m*n:
            result.append(matrix[r][c])
            if dir==1:
                #going up
                #check if col is the last column
                if c==n-1:
                    #if it is, increment row by 1 and change direction to down
                    r+=1
                    dir=-1
                #check if it is the first row
                elif r==0:
                    #if it, increment col by 1 and change direction to down
                    c+=1
                    dir=-1
                else:
                    r-=1
                    c+=1
            else:
                #going down
                #check if it is last row
                if r==m-1:
                    #increment column by 1 and change direction to up
                    c+=1
                    dir=1
                elif c==0:
                    r+=1
                    dir=1
                else:
                    r+=1
                    c-=1
            i+=1
        return result
                    

sol=Solution()
matrix = [[1,2,3],[4,5,6],[7,8,9]]
print(sol.findDiagonalOrder(matrix))













