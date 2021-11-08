class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        ht = collections.defaultdict(collections.deque)
        for row in range(len(matrix)):
            for col in range(len(matrix[0])):
                s = row + col
                if s%2:
                    ht[s].appendleft(matrix[row][col])
                else:
                    ht[s].append(matrix[row][col])
        i, res = 0, []
        while ht[i]:
            while ht[i]:
                res.append(ht[i].pop())
            i+=1
        return res