# // Time Complexity :O(m.n)
# // Space Complexity :(1)
# // Did this code successfully run on Leetcode :yes


class Solution:
    def spiralOrder(self, matrix):
        res=[]
        #4 ptrs for row and col
        fRow=0
        lRow=len(matrix)
        fCol=0
        lCol=len(matrix[0])
        
        while fRow <lRow and fCol <lCol:
            
            #move right
            for i in range (fCol,lCol):
                res.append(matrix[fRow][i])
            
            fRow+=1
            
            #move down
            for i in range(fRow, lRow):
                res.append(matrix[i][lCol-1])
            
            lCol-=1
            
            if not(fRow<lRow and fCol< lCol):
                break

            #move left     
            for j in range(lCol-1,fCol-1,-1):
                res.append(matrix[lRow-1][j])
            lRow-=1

            #move up
            for j in range(lRow-1,fRow-1,-1):
                res.append(matrix[j][fCol])
            fCol+=1
        return res