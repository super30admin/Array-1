class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        """
        Time Complexity: O(m x n)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No
        Your code here along with comments explaining your approach:
        The approach: 
            - Have 4 pointers left, right, up, down
            - First move from left to right in the up row and add each element to the res
                - Since we won't be needing that row anymore, increment up by one
            - Second move from up to down in the right row and add each element to the res
                - Since we won't be needing that col anymore, decrement right by one
            - Third move from right to left in the bottom row and add each element to the res
                - Since we won't be needing that row anymore, decrement down by one
            - Fourth move from down to up to down in the left row and add each element to the res
                - Since we won't be needing that col anymore, increment left by one
            - At each step check whether up <= down and left <= right
        """

        left = 0
        right = len(matrix[0]) -1
        up = 0
        down = len(matrix) -1
        res = list()

        while (left <= right and up <= down):
            if left <= right and up <= down:
                for i in range(left, right+1, 1):
                    res.append(matrix[up][i])
                up += 1
            if left <= right and up <= down:
                for i in range(up, down+1, 1):
                    res.append(matrix[i][right])
                right -= 1
            if left <= right and up <= down:
                for i in range(right, left-1, -1):
                    res.append(matrix[down][i])
                down -= 1
            if left <= right and up <= down:
                for i in range(down, up-1, -1):
                    res.append(matrix[i][left])
                left += 1
        return res