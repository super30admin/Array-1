#Time Complexity : O(M*N), M begin the length of rows and N being the length of the cols. 
#Space Complexity : O(1), as output array doesn't count. 
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : Kept getting mixed up between what is a row
# and what is a column, as well as which direction meant increase of row and col. Had
# to debug a lot of that.  

#Your code here along with comments explaining your approach in three sentences only
'''Create a while loop where on each increment of index, increment or decrement the row 
and/or col based on whether the direction is up or down. 
'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        #initiate the edges that I'll need. 
        rows = len(mat)
        cols = len(mat[0])
        left = 0 
        top = 0 
        right = cols-1
        bottom = rows-1

        #initiate the directions that I'll need. 
        up = 1
        down = -1
        direction = up

        #initiate the initial values and indices. 
        r=0
        c=0

        index = 0
        index_max = rows*cols
        array = []
        while(index<index_max):
            index = index+1
            array.append(mat[r][c])
            #if the direction is initially up and at an edge. 
            if (r==top or c==right) and direction==up:
                direction=down
                if r==top and c==right:
                    r = r+1
                elif r==top:
                    c = c+1
                else:
                    r = r+1
            #if the direction is initially down and at an edge. 
            elif (c==left or r==bottom) and direction==down:
                direction=up
                if c==left and r==bottom:
                    c=c+1
                elif c==left:
                    r = r+1
                else:
                    c = c+1
            #increment/decrement if not at edge. 
            else:
                if direction==down:
                    r = r+1
                    c = c-1
                else:
                    r = r-1
                    c = c+1 
        return array
           