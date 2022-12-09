# // Time Complexity : O(mn)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

#We need to traverse the array diagonally.so we have two directions up and down . while we are in up we check for 3 cases, if row ==0 or if col == len(matrix[0]-1
# ) and the normal case. we need to check corner cases which are important. we seefirst if the column is breached, if yes then we increment row, we do this first 
# and not the row becuase wif incremeent col it will be breached , so we first check column . In case of downward direction we check if the row is hitting the last one first instead of column.
# if yes then we move column first to avoid any breaching of the matrix
class Solution:
    def diagonal(self, matrix):

        row = 0
        col = 0
        res=[]
        up =True
        idx = 0
        while idx < len(matrix)*len(matrix[0]):
            res.append(matrix[row][col])
            idx+=1
            if up:
                if col == len(matrix[0])-1:
                    row+=1
                    up = False

                elif row == 0:
                    col+=1
                    up=False
                else:
                    row-=1
                    col+=1
            
            else:
                if row == len(matrix)-1:
                    col+=1
                    up =True
                
                elif col == 0:
                    row+=1
                    up=True
                else:
                    row+=1
                    col-=1

        return res




