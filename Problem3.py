# Problem 3
# Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
# // Time Complexity : O(mn), where m is number of rows and n is number of columns in the matrix
# // Space Complexity : O(1), if output matrix is not considered additional space.
# // Did this code successfully run on Leetcode :Yes

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        top = 0
        down = len(matrix)-1
        left = 0
        right = len(matrix[0])-1
        result = []
        dirr = 0
        while(top <= down and left <= right):
            if(dirr == 0):
                for i in range(left, right+1):
                    result.append(matrix[top][i])
                top += 1
                # print("0",result)
            elif(dirr == 1):
                for i in range(top, down+1):
                    result.append(matrix[i][right])
                right -= 1
                # print("1",result)
            elif(dirr == 2):
                for i in range(right, left-1, -1):
                    result.append(matrix[down][i])
                down -= 1
                # print("2",result)
            elif(dirr == 3):
                for i in range(down, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
                # print("3",result)
            dirr = (dirr+1) % 4
        return result
