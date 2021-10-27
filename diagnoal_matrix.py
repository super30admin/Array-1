class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
#         1==>up
#         0==>down
#         if matrix is null
        if not mat: 
            return []
        direction=1
        res=[]    
#         length of the matrix
        n=len(mat)
        m=len(mat[0]) 
        i=0
        row=0
        column=0      
        while(i<=(m*n)-1):
            res.append(mat[row][column])
            i=i+1
            if direction==1:
# this if condition explicitly checks if the column reaches out of bounds when row==0
#             if column length equals to mat[0]
                if column==m-1:
                    row=row+1
                    direction=0
                    #                 check if row==0
                elif row==0:
                    column=column+1
                    direction=0
                else:
                    column=column+1
                    row=row-1

#         if direction is 0   
            else:
        #                if row length is len(mat) i.e n
                if row==n-1:
                    column=column+1
                    direction=1
                elif column==0:
                    row=row+1
                    direction=1
                else:
                    row=row+1
                    column=column-1
        return res         
                

        
        
        
        