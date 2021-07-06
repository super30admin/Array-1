class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix)==0:
            return []
        
        m=len(matrix)
        n=len(matrix[0])
        row=0
        col=0
        direction=1
        final=[]
        index=0
        while(index<(m*n)):
            final.append(matrix[row][col])
            index+=1
            
            #Up direction
            if (direction==1):
                if(col==n-1):
                    row+=1
                    direction=-1
                elif (row==0):
                    col+=1
                    direction=-1
                else:
                    col+=1
                    row-=1
            #down direction        
            else:
                if(row==m-1):
                    col+=1
                    direction=1
                elif (col==0):
                    row+=1
                    direction=1
                else:
                    col-=1
                    row+=1
        return final
        #Time O(nm)
        #Space O(1)
        #https://leetcode.com/problems/diagonal-traverse/
