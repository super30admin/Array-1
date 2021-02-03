# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# I use recursion where each layer of the matrix is handle by one invocation. I use left, right, top and bottom
# variables to track the current limits of the matrix

# Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rows=len(matrix)-1
        columns=len(matrix[0])-1
        result = [0 for x in range((rows+1)*(columns+1))]
        self.helper(0, columns, 0, rows, matrix, result, 0)
        return result
    
    def helper(self, left, right, top, bottom, matrix, result, index):
        rows=len(matrix)
        columns=len(matrix[0])
        start = left
        stop = right
        axis = top
        while start <= stop and index<=rows*columns-1:
            result[index] = matrix[axis][start]
            index+=1
            start+=1 
        start = top+1
        stop = bottom
        axis = right
        while start <= stop and index<=rows*columns-1:
            result[index] = matrix[start][axis]
            index+=1
            start+=1 
        start = right-1
        stop = left
        axis = bottom
        while start >= stop and index<=rows*columns-1:
            result[index] = matrix[axis][start]
            index+=1
            start-=1
        start = bottom-1
        stop = top+1
        axis = left
        while start>=stop and index<=rows*columns-1:
            result[index] = matrix[start][axis]
            index+=1
            start-=1
        if left <= right or top<=bottom:
            self.helper(left+1, right-1, top+1, bottom-1, matrix, result, index)
        