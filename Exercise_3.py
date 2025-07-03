'''
54 Spiral Matrix
https://leetcode.com/problems/spiral-matrix/description/

Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100

Solution:
1. Using top-bottom-left-right variables:
top = top row
bottom = bottom row
left = left column
right = right column

Step 0: Initiialize: top = 0, bottom = M-1, left = 0, right = N-1
Step 1: while top is lower than bottom and left is lower than right, make 4 traversals:
    a) Traverse top row from left -> right. Update top++ (since we are done with top row)
    b) Traverse right column from top -> bottom. Update right--
    c) Traverse bottom column from right -> left. Update bottom--
    d) Traverse left column from bottom -> top. Update left ++

https://www.youtube.com/watch?v=8Hu85F3ujVA

Note: Additional if clause checks around each of the 4 traversals are required to avoid outputting repeating elements. However, those checks can be minimized using some careful observations. https://youtu.be/8Hu85F3ujVA?t=1664 (27:44 - 34:44)

Time: O(MN), Space: O(1)
'''

def find_spiral_order(mat):
    M = len(mat)
    if M == 0:
        return []
    N = len(mat[0])

    result = []
    top = 0
    bottom = M-1
    left = 0
    right = N-1

    while top <= bottom and left <= right:
        # Traverse left to right
        for j in range(left, right+1):
            result.append(mat[top][j])
        top += 1
        # Traverse top to bottom
        for i in range(top, bottom+1):
            result.append(mat[i][right])
        right -= 1
        # Traverse right to left
        if top <= bottom:
            for j in range(right, left-1,-1):
                result.append(mat[bottom][j])
            bottom -= 1
        # Traverse bottom to top
        if left <= right:
            for i in range(bottom, top-1, -1):
                result.append(mat[i][left])
            left += 1
    return result

def run_find_spiral_order():
    tests = [([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]], [1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10]),
            ([[1,2,3],[4,5,6],[7,8,9]], [1,2,3,6,9,8,7,4,5]),
            ([[1,2,3,4],[5,6,7,8],[9,10,11,12]],[1,2,3,4,8,12,11,10,9,5,6,7]), ([[1,2,3,4]], [1,2,3,4]),
            ([[1],[2],[3],[4]], [1,2,3,4]),
            ([[5]], [5])]

    for test in tests:
        mat, ans = test[0], test[1]
        result = find_spiral_order(mat)
        print(f"\nmatrix = {mat} (size = {len(mat)} x {len(mat[0])})")
        print(f"Spiral traversal = {result}")
        print(ans==result)

run_find_spiral_order()