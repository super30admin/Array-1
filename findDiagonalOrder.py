class Solution:
    '''
    pseudo code
    dir == 1
	if j == n-1:
		dir = -1 
		i += 1
	else if i == 0 
		dir = -1
		j += 1
	else:
		i -= 1
		j += 1
    T =O(N*N)
    S = 0(1)
    '''
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        direction=1     #direction is up in the beginning
        res=[]
        row=0
        col=0

        while row<len(mat) and col <len(mat[0]):
            res.append(mat[row][col])
            if direction==1:                            #if its going up
                if(col==len(mat[0])-1 ):                   #if its the last column, just go down and change direction
                    direction=0
                    row+=1
                elif(row==0):                               #if its first row, change direction and go to next column
                    direction=0
                    col+=1
                else:                                       #else, just go up and to the right
                    row-=1
                    col+=1
            else:
                if(row==len(mat)-1):                        #if its going down and youre on the last low, then change direction and go to the next column
                    direction=1
                    col+=1
                elif(col==0 ):                              #if its on the first column, then chenge direction and go down
                    direction=1
                    row+=1

                else:                                         #else, just go down and left
                    row+=1
                    col-=1
        return res

            
