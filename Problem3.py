# Time Complexity: O(M*N)
# Space Complexity: O(1)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
#        if len(matrix) <= 1:
#          return matrix[0]
#        dirs = [
#            [0,1], # right
#            [1, 0], # down
#            [0,-1], # left
#            [-1, 0] # up
#        ]
#        dir = 0
#        visited = set()
#        res = []
#        rows = len(matrix)
#        cols = len(matrix[0])
#
#        q = collections.deque()
#        q.append((0,0))
#
#        while q:
#          r, c = q.popleft()
#          res.append(matrix[r][c])
#          visited.add((r,c))
#
#          if len(res) == cols * rows:
#            return res
#          dr, dc = dirs[dir]
#          nr = r + dr
#          nc = c + dc
#          print(rows, cols)
#          while (nr < 0 or nr >= rows or nc < 0 or nc >= cols or (nr, nc) in visited):
#            dir = (dir + 1) % 4
#            dr, dc = dirs[dir]
#            nr = r + dr
#            nc = c + dc
#          q.append((nr, nc))
#
#        return reΩs
        
        # if not matrix or not matrix[0]:
        #   return []

        # rows, cols = len(matrix), len(matrix[0])
        # directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
        # visited = set()
        # result = []
        # current_direction = 0

        # def is_valid(r, c):
        #     return 0 <= r < rows and 0 <= c < cols and (r, c) not in visited

        # r, c = 0, 0
        # for _ in range(rows * cols):
        #     result.append(matrix[r][c])
        #     visited.add((r, c))
        #     nr, nc = r + directions[current_direction][0], c + directions[current_direction][1]

        #     if is_valid(nr, nc):
        #         r, c = nr, nc
        #     else:
        #         current_direction = (current_direction + 1) % 4
        #         r, c = r + directions[current_direction][0], c + directions[current_direction][1]

        # return result

      rows, cols = len(matrix), len(matrix[0])
      result = []

      top, bottom, left, right  = 0, rows - 1, 0, cols - 1

      while top <= bottom and left <= right:
        for i in range(left, right + 1):
          result.append(matrix[top][i])
        top += 1
        for i in range(top, bottom + 1):
          result.append(matrix[i][right])
        right -= 1
        if top <= bottom:
          for i in range(right, left - 1, -1):
            print(i)
            result.append(matrix[bottom][i])
          bottom -= 1
        if left <= right:
          for i in range(bottom, top - 1, -1):
            result.append(matrix[i][left])
          left += 1

      return result

        


