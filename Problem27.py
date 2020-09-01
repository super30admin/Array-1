def spiralTraverse(array):

    result =[]
    startRow, endRow = 0, len(array)-1
    startCol, endCol = 0, len(array[0])-1

    while startRow <= endRow and startCol <= endCol:
        for col in range(startCol, endCol+1):
            result.append(array[startRow][col])
        for row in range(startRow+1 , endRow + 1):
            result.append(array[row][endCol])

        for col in reversed(range(startCol , endCol)):
            if startRow == endRow:
                break
            result.append(array[endRow][col])

        for row in reversed(range(startRow + 1, endRow)):

            if startCol == endCol:
                break
            result.append(array[row][startCol])

        startRow+=1
        endRow -= 1
        startCol +=1
        endCol -= 1
    return result

"""
4 pointers are used, which are used as boundaries for spiral traversal
Once a row and col are printed, the order of the row and col are reversed.
When there is just one row, col, the loop exists are is no need for further traversal

"""
"""
Time complexity: O(n)
Space Complexity: O(n)

"""
