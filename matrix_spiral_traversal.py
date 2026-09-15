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
1. Iteration top-bottom-left-right boundaries:
top = top row
bottom = bottom row
left = left column
right = right column

Step 0: Initiialize: top = 0, bottom = M-1, left = 0, right = N-1
Step 1: while top is lower than bottom and left is lower than right, make 4 traversals:
    a) Top Row: move left -> right, top++
    Move top row from left -> right. Update top++ (since we are done with top row)

    b) Right Col: move top -> bottom, right--
    Move right column from top -> bottom. Update right--

    c) Bottom Row: move right to left, bottom--
    Move bottom column from right -> left. Update bottom--

    d) Left Col: move bottom -> top, left++
    Move left column from bottom -> top. Update left ++

Time: O(MN), Space: O(1)

https://www.youtube.com/watch?v=8Hu85F3ujVA
Note: Additional if checks around each of the 4 traversals are required to avoid outputting repeating elements. However, those checks can be minimized using some careful observations. https://youtu.be/8Hu85F3ujVA?t=1664 (27:44 - 34:44)

2. Recursion
How many spirals? Ans: min(M, N)
What is the meaning of no. of spirals? No. of rectangles with decreasing size that can be formed inside the original matrix.
Time: O(MN), Space: O(min(M,N)) (no. of recursion calls = no. of spirals)
https://youtu.be/WffiBsKr6K0?t=5069

'''

def find_spiral_order_1(mat):
    '''
    Iterative solution
    '''
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
        # Top Row: Move left to right
        for j in range(left, right+1):
            result.append(mat[top][j])
        top += 1

        # Right Col: Move top to bottom
        if top <= bottom and left <= right:
            for i in range(top, bottom+1):
                result.append(mat[i][right])
            right -= 1

        # Bottom Row: Move right to left
        if top <= bottom and left <= right:
            for j in range(right, left-1, -1):
                result.append(mat[bottom][j])
            bottom -= 1

        # Left Col: Move bottom to top
        if top <= bottom and left <= right:
            for i in range(bottom, top-1, -1):
                result.append(mat[i][left])
            left += 1

    return result


def find_spiral_order_2(mat):
    '''
    Iterative solution with minor optimization in code -
    Check base conditions in the last inner loops instead
    of all loops
    '''
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
        # Top Row: Move left to right
        for j in range(left, right+1):
            result.append(mat[top][j])
        top += 1

        # Right Col: Move top to bottom
        # top <= bottom check is taken care of in the for loop
        # right has not changed yet. Hence,
        # no need to check boundaries
        for i in range(top, bottom+1):
            result.append(mat[i][right])
        right -= 1

        # Bottom Row: Move right to left
        # left <= right check is taken care of in the for loop
        # top has changed (after the execution of 1st for loop)
        # Hence, explicitly check top <= bottom
        if top <= bottom:
            for j in range(right, left-1, -1):
                result.append(mat[bottom][j])
            bottom -= 1

        # Left Col: Move bottom to top
        # top <= bottom check is taken care of in the for loop
        # right has changed. Hence, explicitly check left <= right
        if left <= right:
            for i in range(bottom, top-1, -1):
                result.append(mat[i][left])
            left += 1

    return result


def find_spiral_order_3(mat):
    '''
    Recursive solution
    '''
    def recursion(matrix, top, bottom, left, right, result):
        if top > bottom or left > right:
            return

        # Top Row: Move left to right
        for j in range(left, right+1):
            result.append(mat[top][j])
        top += 1

        # Right Col: Move top to bottom
        for i in range(top, bottom+1):
            result.append(mat[i][right])
        right -= 1

        # Bottom Row: Move right to left
        if top <= bottom:
            for j in range(right, left-1, -1):
                result.append(mat[bottom][j])
            bottom -= 1

        # Left Col: Move bottom to top
        if left <= right:
            for i in range(bottom, top-1, -1):
                result.append(mat[i][left])
            left += 1

        recursion(mat, top, bottom, left, right, result)

    M = len(mat)
    if M == 0:
        return []
    N = len(mat[0])

    result = []
    top = 0
    bottom = M-1
    left = 0
    right = N-1
    result = []

    recursion(mat, top, bottom, left, right, result)
    return result


def run_tests():
    tests = [([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]], [1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10]),
            ([[1,2,3],[4,5,6],[7,8,9]], [1,2,3,6,9,8,7,4,5]),
            ([[1,2,3,4],[5,6,7,8],[9,10,11,12]],[1,2,3,4,8,12,11,10,9,5,6,7]), ([[1,2,3,4]], [1,2,3,4]),
            ([[1],[2],[3],[4]], [1,2,3,4]),
            ([[5]], [5])]

    for test in tests:
        mat, ans = test[0], test[1]
        res1 = find_spiral_order_1(mat)
        res2 = find_spiral_order_1(mat)
        res3 = find_spiral_order_3(mat)
        print(f"\nmatrix = {mat} (size = {len(mat)} x {len(mat[0])})")
        print(f"Spiral traversal 1 = {res1}")
        print(f"Spiral traversal 2 = {res2}")
        print(f"Spiral traversal 3 = {res3}")
        passed = (ans == res1 == res2 == res3)
        assert passed == True, f"Test case failed"
        print(f"Pass: {passed}")

    print(f"\nDONE")

run_tests()
