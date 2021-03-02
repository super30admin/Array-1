class Solution():
    def findDiagonalOrder(self, matrix):
         #sanity check
        if len(matrix)==0 or matrix==None:
            return None
        m = len(matrix)
        n = len(matrix[0])
        #assign the result array.
        result = [None]*(m*n)
        #initial direction =1 and starting from the first element(0,0)
        direction = 1
        i = 0
        r = 0
        c = 0
        #filling the array
        while (i in range (m*n)):
            
            result[i] = matrix[r][c]

            #go to next element with upward direction
            if (direction == 1):
                if (c == n-1):
                    r+=1
                    direction = -1
                elif (r == 0):
                    c+=1
                    direction = -1
                else:
                    r-=1
                    c+=1
            else:
                if (r == m-1):
                    c+=1
                    direction = 1
                elif (c == 0):
                    r+=1
                    direction = 1
                else:
                    r+=1
                    c-=1
            i+=1
        return result
#TC: O(n)
#SC: O(1)
        
