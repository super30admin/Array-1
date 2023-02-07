#Time Complexity : O(M*N), M begin the length of rows and N being the length of the cols. 
#Space Complexity : O(1), as output array doesn't count. 
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : Had a tough time debugging issues with indices. 
#In the end, the issue was at the for loop where the index was from a bigger value to a 
#smaller value that was the issue. 

#Your code here along with comments explaining your approach in three sentences only
'''While keeping track of the edges values, increment/decrement an edge value as each 
row/col is placed into the resulting array. 
'''

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        #initialize values. 
        rows = len(matrix)
        cols = len(matrix[0])

        left = 0
        right = cols-1
        top = 0
        bottom = rows-1

        array = []
        index = 0
        index_max = rows*cols
        #while resulting array is not full, continue to loop. 
        while(index<=index_max):
            #left to right
            for i in range(left, right+1):
                array.append(matrix[top][i])
                index = index+1

            top = top+1
            if index>=index_max:
                break
            
            #top to bottom. 
            for i in range(top, bottom+1):
                array.append(matrix[i][right])
                index = index+1

            right = right-1
            if index>=index_max:
                break
            
            #right to left
            for i in range(left, right+1):
                ind = right+1-1-i+left
                array.append(matrix[bottom][ind])
                index = index+1

            bottom = bottom-1

            if index>=index_max:
                break
            
            #bottom to top
            for i in range(top, bottom+1):

                ind = bottom+1-1-i+top
                array.append(matrix[ind][left])
                index = index+1

            left = left+1
            if index>=index_max:
                break
            
        return array

            
            
