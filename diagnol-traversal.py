# Find the number of elements in mat and assign an arr too that length. Keep the flag true
#  at first. Loop throught the elelmts in mat. 
# If flag is true:
#     If row is 0 and col is not the last col, increment the col and make flag=false, 
#     if col is last col, increment the row anf turn flag to false else decrement row and increment col
# If flag is false:
#     If col is 0 and row is not the last row, increment the row and make flag=true, 
#     if row is last row, increment the col anf turn flag to true else increment row and decrement col




class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        row = len(mat)
        col = len(mat[0])
        n = (row)*(col)
        r=0
        c=0
        arr=[None for i in range(n)]
        flag = True
        for i in range(n):
            print(r,c)
            arr[i]=mat[r][c]
            if flag:
                if r==0 and c!=col-1:
                    c+=1
                    flag = False
                elif c==col-1:
                    r+=1
                    flag=False
                else:
                    r-=1
                    c+=1
            else:
                if c==0 and r!=row-1:
                    r+=1
                    flag=True
                elif r==row-1:
                    c+=1
                    flag=True
                else:
                    r+=1
                    c-=1
        return arr




        