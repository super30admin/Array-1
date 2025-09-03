# ## Problem 3
# https://leetcode.com/problems/spiral-matrix/

# Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

# Example 1:

# Input:

# [

# [ 1, 2, 3 ],

# [ 4, 5, 6 ],

# [ 7, 8, 9 ]

# ]
# Output: [1,2,3,6,9,8,7,4,5]
# Example 2:

# Input:

# [

# [1, 2, 3, 4],

# [5, 6, 7, 8],

# [9,10,11,12]

# ]
# Output: [1,2,3,4,8,12,11,10,9,5,6,7]

# Method1: Iterative
# M --- No. of columns
# N -- No. of rows
# Time Complexity : O(M*N)
# Space Complexity : O(1) = we are not using any extra space. It would be O(M*N), if we consider the output array as extra space as well
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Use 4 pointers to maintain left, right, top and bottom borders. We run while loop till left and right cross or top and bottom cross.
# To cover all directions of the spiral we have for loops to go left to right, top to bottom, right to left and bottom to up. In while
# loops we have an issue where we should check the base again whenever we are mutating the base case. 

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        n = len(matrix)
        m = len(matrix[0])
        left = 0
        right = m - 1
        top = 0
        bottom = n - 1
        spiralList = []

        # run loop till any of the pointer does not cross, we continue our spiral collection
        while((left <= right) and (top <= bottom)):
            # cover all directions

            # case1: elements left to right
            for j in range(left, right + 1):
                spiralList.append(matrix[top][j])

            # shrink spiral from top
            top += 1

            if((left <= right) and (top <= bottom)):
                # case2: elements top to bottom
                for i in range(top, bottom + 1):
                    spiralList.append(matrix[i][right])

            # shrink spiral from right
            right -= 1

            if((left <= right) and (top <= bottom)):
                # case3: elements right to left
                for j in range(right, left - 1, -1):
                    spiralList.append(matrix[bottom][j])

            # shrink spiral from bottom
            bottom -= 1

            if((left <= right) and (top <= bottom)):
                # case4: elements bottom to top
                for i in range(bottom, top - 1, -1):
                    spiralList.append(matrix[i][left])

            # shrink spiral from left
            left += 1

        return spiralList
    
sol = Solution()
print("Method1: Iterative")
print(sol.spiralOrder([[1,2,3],[4,5,6],[7,8,9]]))
print(sol.spiralOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12]]))
print(sol.spiralOrder([
[1, 2, 3, 4, 17],
[5, 6, 7, 8, 18],
[9,10,11,12, 19],
[13,14,15,16,20],
[21,22,23,24,25],
[26,27,28,29,30]
]))


# Just keeping necessary conditions and not the entire base case every time

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        n = len(matrix)
        m = len(matrix[0])
        left = 0
        right = m - 1
        top = 0
        bottom = n - 1
        spiralList = []

        # run loop till any of the pointer does not cross, we continue our spiral collection
        while((left <= right) and (top <= bottom)):
            # cover all directions

            # case1: elements left to right
            for j in range(left, right + 1):
                spiralList.append(matrix[top][j])

            # shrink spiral from top
            top += 1

            # if((left <= right) and (top <= bottom)): not required because for loop will take care
            # case2: elements top to bottom
            for i in range(top, bottom + 1):
                spiralList.append(matrix[i][right])

            # shrink spiral from right
            right -= 1

            if((top <= bottom)): # only need to check for top and bottom cross. left and right cross would taken care by the for loop
                # case3: elements right to left
                for j in range(right, left - 1, -1):
                    spiralList.append(matrix[bottom][j])

            # shrink spiral from bottom
            bottom -= 1

            if((left <= right)):# only need to check for left and right cross. top and bottom cross would taken care by the for loop
                # case4: elements bottom to top
                for i in range(bottom, top - 1, -1):
                    spiralList.append(matrix[i][left])

            # shrink spiral from left
            left += 1

        return spiralList


sol = Solution()
print("Method1: Iterative")
print(sol.spiralOrder([[1,2,3],[4,5,6],[7,8,9]]))
print(sol.spiralOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12]]))
print(sol.spiralOrder([
[1, 2, 3, 4, 17],
[5, 6, 7, 8, 18],
[9,10,11,12, 19],
[13,14,15,16,20],
[21,22,23,24,25],
[26,27,28,29,30]
]))


# Method2: Recursive
# M --- No. of columns
# N -- No. of rows
# Time Complexity : O(M*N)
# Space Complexity : O(1) = we are not using any extra space. It would be O(M*N) + O(no. of spirals), 
# if we consider the output array as extra space as well. O(no. of spirals) is due to recursion stack space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Same logic as above. Just using recursion to solve

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        n = len(matrix)
        m = len(matrix[0])
        left = 0
        right = m - 1
        top = 0
        bottom = n - 1
        spiralList = []


        def helper(spiralList, matrix, left, right, top, bottom):
            # base case
            # run recursion till any of the pointer does not cross, we continue our spiral collection
            if((left > right) or (top > bottom)):
                return

            # logic
            
            # cover all directions

            # case1: elements left to right
            for j in range(left, right + 1):
                spiralList.append(matrix[top][j])

            # shrink spiral from top
            top += 1

            # if((left <= right) and (top <= bottom)): not required because for loop will take care
            # case2: elements top to bottom
            for i in range(top, bottom + 1):
                spiralList.append(matrix[i][right])

            # shrink spiral from right
            right -= 1

            if((top <= bottom)): # only need to check for top and bottom cross. left and right cross would taken care by the for loop
                # case3: elements right to left
                for j in range(right, left - 1, -1):
                    spiralList.append(matrix[bottom][j])

            # shrink spiral from bottom
            bottom -= 1

            if((left <= right)):# only need to check for left and right cross. top and bottom cross would taken care by the for loop
                # case4: elements bottom to top
                for i in range(bottom, top - 1, -1):
                    spiralList.append(matrix[i][left])

            # shrink spiral from left
            left += 1

            helper(spiralList, matrix, left, right, top, bottom)

        helper(spiralList, matrix, left, right, top, bottom)
        return spiralList

sol = Solution()
print("Method2: Recursion")
print(sol.spiralOrder([[1,2,3],[4,5,6],[7,8,9]]))
print(sol.spiralOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12]]))
print(sol.spiralOrder([
[1, 2, 3, 4, 17],
[5, 6, 7, 8, 18],
[9,10,11,12, 19],
[13,14,15,16,20],
[21,22,23,24,25],
[26,27,28,29,30]
]))