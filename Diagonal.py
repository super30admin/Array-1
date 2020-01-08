// Time Complexity :o(mn)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : Yes
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        mrows=len(matrix)-1
        ncols=len(matrix[0])-1
        row=0
        col=0
        dir= 1
        op=[]
        while(len(op)<(mrows+1)*(ncols+1)):
            op.append(matrix[row][col])
            if(dir==1):
                if(col==ncols):
                    row+=1
                    dir=0
                elif(row==0):
                    col+=1
                    dir=0
                else:
                    row-=1
                    col+=1
            else:
                if(row==mrows):
                    col+=1
                    dir=1
                elif(col==0):
                    row+=1
                    dir=1
                else:
                    row+=1
                    col-=1
        return op
                    
