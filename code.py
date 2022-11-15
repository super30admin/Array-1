# // Time Complexity : O(mxn)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows = len(mat)
        cols = len(mat[0])
        #defining new list for output
        result = []
        i = 0 #rows
        j = 0 #colums
        # defining direction 
        direction = 1
        while (len(result) < (rows * cols)):
            result.append(mat[i][j])
            #if direction is 1 than go upwords
            if (direction == 1):
                #if pointer in last coloum change the direction and increment row
                if (j == cols-1):
                    direction = -1
                    i=i+1
                elif (i==0): #if pointer in 1st row change the direction increment the column
                    direction = -1
                    j+=1
                else:
                    i-=1
                    j+=1
            #if direction is -1 than go upwords                    
            else:
                #if pointer in last row change the direction and increment column
                if i==(rows-1):
                    direction = 1
                    j+=1
                elif j==0: #if pointer in 1st row change the direction and increment the row
                    direction=1
                    i+=1
                else:
                    j-=1
                    i+=1
            
        return result