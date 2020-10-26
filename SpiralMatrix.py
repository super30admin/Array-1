#Time Complexity : O(n) where n is the number of elements in the matrix
#Space Complexity : o(1) (Since output array is counted as auxilary space)

#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Iterate through the matrix in 4 loops, one for each direction. Do this keeping four pointers, start and end for each row and col. Keep doing this till you just pass start and end pointers for row and col individually.

#Your code here along with comments explaining your approach

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        if not matrix:
            return []

        result =[]
        rows, cols = len(matrix), len(matrix[0])
        startRow, startCol, endRow, endCol = 0, 0, rows-1, cols-1

        while startRow <= endRow and startCol <= endCol:
            #Loop 1 for left to right
            for i in range(startCol, endCol+1):
                result.append(matrix[startRow][i])

            #Loop 2 for top to bottom (start from startRow+1 as we've traversed the first element in previous loop)
            for i in range(startRow+1, endRow+1):
                result.append(matrix[i][endCol])

            #Loop 3 for right to left (start from endCol-1 as we've traversed the first element in previous loop)
            for i in range(endCol-1, startCol-1, -1):
                #if it is not a square matrix pointers will pass over and visit through already visited elements
                if startRow == endRow:
                     break
                result.append(matrix[endRow][i])

            #Loop 4 for bottom to top (start from endRow-1 as we've traversed the first element in previous loop)
            for i in range(endRow-1, startRow, -1):
                #if it is not a square matrix pointers will pass over and visit through already visited elements
                if startCol == endCol:
                    break
                result.append(matrix[i][startCol])

            #increment both start pointers and decrement both end pointers
            startRow += 1
            startCol += 1
            endCol -= 1
            endRow -= 1


        return result
