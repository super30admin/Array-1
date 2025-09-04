class Solution(object):
#     // Time Complexity : O(n*m) 
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        # diagonal traverse : down to top and then top to down and keeps gng
        # so in the matrix there are two directions upward and downward
        # will write conditions to traverse from top and botton directions and cover all the elements 
        

        # top direction
        # when at a position r, c keep iterating till top by moving r--, c++
        # the boundary conditions are r == 0 or c == n-1 where n is the number of columns - 
        # change the direction to bottom
           # when reached r ==0, c++ move to the right
           # when reached c = n-1 , r ++ move down 

        # bottom direction
        # when at a position r,c , keep iterating r++, c--
        # the boundary condtions are c == 0 reached till end, r == m-1 where m is the number of rows
        # change the direction to top
          # when reached c == 0, r ++ move to down
          # when reached r = m-1 , c ++ move right

        dir = True
        m = len(mat)
        n = len(mat[0])
        r = c = 0 

        traverse = []

        for i in range(m*n):
            traverse.append(mat[r][c])

            if dir:
                if c == n-1:
                    r +=1
                    dir = False # chaging the dir
                elif r == 0:
                    c +=1
                    dir = False # changing the dir
                else :
                    r-= 1
                    c +=1
            else:
                if r == m-1:
                    c +=1
                    dir = True
                elif c == 0:
                    r +=1
                    dir = True
                else:
                    r+=1
                    c -= 1

        
        return traverse

                






         