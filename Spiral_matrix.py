class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        if matrix == None or matrix == []:
            return matrix

        else:
            #spiral matrix output array
            spiral = []

            #top row
            top = 0
            #Storing number of rows
            m = len(matrix)
            #top column
            left = 0
            #storing number of columns
            n = len(matrix[0])
            
            while top < m and left < n:
                #Looping over till the last column in the row
                for i in range(left,n):
                    spiral.append(matrix[top][i])
                top+=1

                #Looping over till the last row
                for i in range(top,m):
                    spiral.append(matrix[i][n-1])
                n-=1
                
                #print the last column from the remaining columns
                if top <m:
                    for i in range(n-1,left-1,-1):
                        spiral.append(matrix[m-1][i])
                    m-=1
                #print the first column from the remaining columns
                if left < n:
                    for i in range(m-1, top-1, -1):
                        spiral.append(matrix[i][left])
                    left += 1  
        return spiral



#This problem deals with the spiral print of the values in the matrix
#time complexity- O(N)
#space complexity - O(1)
