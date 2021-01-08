'''
    Time Complexity:
        O(mn) (where m = number of rows, n = number of cols)

    Space Complexity:
        O(1)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Recursive approach
'''
class Solution:
    def __init__(self):
        self.matrix = []
        self.top = 0
        self.bottom = 0
        self.left = 0
        self.right = 0
        self.res = []

    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        self.matrix = matrix
        self.bottom = len(matrix) - 1
        self.right = len(matrix[0]) - 1
        self.loop()
        return self.res

    def loop(self):
        if self.left > self.right or self.top > self.bottom:
            return

        self.go_right()
        self.go_down()
        self.go_left()
        self.go_up()
        self.loop()

    def go_right(self):
        for j in range(self.left, self.right + 1):
            self.res.append(self.matrix[self.top][j])
        self.top += 1

    def go_down(self):
        for i in range(self.top, self.bottom + 1):
            self.res.append(self.matrix[i][self.right])
        self.right -= 1

    def go_left(self):
        if self.top > self.bottom:
            return

        for j in range(self.right, self.left - 1, -1):
            self.res.append(self.matrix[self.bottom][j])
        self.bottom -= 1

    def go_up(self):
        if self.left > self.right:
            return

        for i in range(self.bottom, self.top - 1, -1):
            self.res.append(self.matrix[i][self.left])
        self.left += 1
