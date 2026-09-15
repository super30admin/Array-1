'''
498 Diagonal Traverse
https://leetcode.com/problems/diagonal-traverse/description/

Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

Example 1:
Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]

Example 2:
Input: mat = [[1,2],[3,4]]
Output: [1,2,3,4]

Constraints:
m == mat.length
n == mat[i].length
1 <= m, n <= 104
1 <= m * n <= 104
-105 <= mat[i][j] <= 105

Solution:
1. Starting from the first element (mat[0][0]), traverse the matrix diagonally up and down in an alternative fashion.
Up:
    To traverse up, decrement row by 1 (row--) and increase col by 1 (col++)
    When we hit the last element in the diagonal, we change direction to down.
    Last element could be in the first row (row=0) or last col (col=N-1)
    a) last col: no change in col, go to next row (row++)
    b) first row: no change in row, go to next col (col++)
Down:
    To traverse down, increment row by 1 (row++) and decrement col by 1 (col--)
    When we hit the last element in the diagonal, we change direction to up.
    Last element could be in the first col (col=0) or last row (col=M-1)
    a) last row: no change in row, go to next col (col++)
    b) first col: no change in col, go to next row (row++)

Note: It is important to check the edge cases in either direction (up or down) according to the sequence described above (a followed by b). If we alter the sequence (b followed by a), we will hit index out of bounds error when we are at: mat[0][n-1] (top right element) for up case
    mat[m-1][0] (bottom left element for down case
Time: O(MN), Space: O(1)
https://www.youtube.com/watch?v=7dTxkC_-TWY

'''
def find_diagonal_order(matrix):
    M = len(matrix)
    if M == 0:
        return []
    N = len(matrix[0])
    output = []
    row = col = 0
    dir = 1 # 1= up direction, 0 = down direction
    while True:
        output.append(matrix[row][col])
        if row == M-1 and col == N-1:
            break
        if dir == 1: # go up
            if row == 0 and col != N-1: # boundary: top row (except right top ele)
                dir = 0
                col += 1
            elif col == N-1: # boundary: right col (includes right top ele)
                dir = 0
                row += 1
            else:
                row -= 1
                col += 1
        else: # dir = 0, go down
            if  col == 0 and row != M-1: # bdary: left col (except left bottom ele)
                dir = 1
                row += 1
            elif row == M-1: # boundary: bottom row (includes left bottom ele)
                dir = 1
                col += 1
            else:
                row += 1
                col -= 1

    return output


def run_tests():
    tests = [([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]], [1,2,5,9,6,3,4,7,10,13,14,11,8,12,15,16]),
             ([[1,2,3],[4,5,6],[7,8,9]], [1,2,4,7,5,3,6,8,9]),
             ([[1,2,3,4],[5,6,7,8],[9,10,11,12]],[1,2,5,9,6,3,4,7,10,11,8,12]), ([[1,2,3,4]], [1,2,3,4]),
             ([[1],[2],[3],[4]], [1,2,3,4]),
             ([[5]], [5])]

    for test in tests:
        mat, ans = test[0], test[1]
        res = find_diagonal_order(mat)
        print(f"\nmatrix = {mat} (size = {len(mat)} x {len(mat[0])})")
        print(f"Diagonal traversal = {res}")
        print(ans==res)
        passed = (ans == res)
        assert passed == True, f"Test case failed"
        print(f"Pass: {passed}")

    print(f"\nDONE")

run_tests()