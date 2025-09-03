# https://leetcode.com/problems/diagonal-traverse/description/

## Problem 2

# Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

# Example:

# Input:

# [

# [ 1, 2, 3 ],

# [ 4, 5, 6 ],

# [ 7, 8, 9 ]

# ]

# Output: [1,2,4,7,5,3,6,8,9]

# M --- No. of columns
# N -- No. of rows
# Time Complexity : O(M*N)
# Space Complexity : O(1) = we are not using any extra space. It would be O(M*N), if we consider the output matrix as extra space as well
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# There are two directions we use while traversing diagonally: one is up and other is down. 
# Going up has 3 cases: We are about to hit the roof, we are about to hit the right wall or we have the normal case of going in 
# upwards direction. There is a special case of right top corner here. So column codition would take precdence over roof condition.
# Going down also has 3 cases: We are about to hit the floor, we are about to hit the left wall or 
# we have the normal case of going in down direction. So floor codition would take precdence over left wall condition. 
# We keep a flag to note the direction. 

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        # for row pointer
        r = 0
        # for col pointer
        c = 0
        # no. of rows
        n = len(mat)
        # no. of cols
        m = len(mat[0])
        diagStore = []

        # direction flag
        isUp = True

        for i in range(m*n):
            diagStore.append(mat[r][c])
            if(isUp):
                # currently in upward direction
                # precedence for right column condition due to right corner
                # case
                if(c == m - 1):
                    # next is the right wall or right top corner
                    # so change direction to down
                    isUp = False
                    # update r. c remains same
                    r = r + 1
                elif(r == 0):
                    # next is the roof
                    # so change direction to down
                    isUp = False
                    # update c. r remains same
                    c = c + 1
                else:
                    # we are going normally in up direction
                    r = r - 1
                    c = c + 1
            else:
                # currently in down direction
                # precedence for floor condition due to left corner
                # case
                if(r == n - 1):
                    # next is the floor or down left corner
                    # so change direction to up
                    isUp = True
                    # update c. r remains same
                    c = c + 1
                elif(c == 0):
                    # next is the left wall
                    # so change direction to up
                    isUp = True
                    # update r. c remains same
                    r = r + 1
                else:
                    # we are going normally in down direction
                    c = c - 1
                    r = r + 1

        return diagStore


sol = Solution()
print("Method1")
print(sol.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))
print(sol.findDiagonalOrder([[1,2],[3,4]]))
print(sol.findDiagonalOrder([[1]]))
print(sol.findDiagonalOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12]]))
print(sol.findDiagonalOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]))



# We can change the conditions slightly as well using and operator to handle the special cases

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        # for row pointer
        r = 0
        # for col pointer
        c = 0
        # no. of rows
        n = len(mat)
        # no. of cols
        m = len(mat[0])
        diagStore = []

        # direction flag
        isUp = True

        for i in range(m*n):
            diagStore.append(mat[r][c])
            if(isUp):
                # currently in upward direction
                # precedence for right column condition due to right corner
                # case
                if(r == 0 and c != m - 1):
                    # next is the roof
                    # so change direction to down
                    isUp = False
                    # update c. r remains same
                    c = c + 1
                elif(c == m - 1):
                    # next is the right wall or right top corner
                    # so change direction to down
                    isUp = False
                    # update r. c remains same
                    r = r + 1
                else:
                    # we are going normally in up direction
                    r = r - 1
                    c = c + 1
            else:
                # currently in down direction
                # precedence for floor condition due to left corner
                # case
                if(c == 0 and r != n - 1):
                    # next is the left wall
                    # so change direction to up
                    isUp = True
                    # update r. c remains same
                    r = r + 1
                elif(r == n - 1):
                    # next is the floor or down left corner
                    # so change direction to up
                    isUp = True
                    # update c. r remains same
                    c = c + 1
                else:
                    # we are going normally in down direction
                    c = c - 1
                    r = r + 1

        return diagStore

sol = Solution()
print("Method2: Variation in handling the corner case")
print(sol.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))
print(sol.findDiagonalOrder([[1,2],[3,4]]))
print(sol.findDiagonalOrder([[1]]))
print(sol.findDiagonalOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12]]))
print(sol.findDiagonalOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]))

        