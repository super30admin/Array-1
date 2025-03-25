'''
The algorithm simulates the spiral traversal by maintaining four boundaries: top, bottom, left, and right.
It iteratively traverses the matrix layer by layer — right across the top row, down the rightmost column, left across the bottom row, and up the leftmost column — shrinking the boundaries each time.
The loop continues until the boundaries cross, ensuring all elements are visited exactly once in spiral order

Time Complexity: O(m*n)
Space Complexity: O(m*n)
'''

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top = 0
        bot = len(matrix)

        left, right = 0, len(matrix[0])

        result = []
        while left < right and top < bot:
            for i in range(left, right):
                result.append(matrix[top][i])
            top+=1

            for i in range(top,bot):
                result.append(matrix[i][right-1])
            
            right-=1

            if not (left < right and top < bot):
                break

            for i in range(right-1, left-1, -1):
                result.append(matrix[bot-1][i])
            
            bot-=1

            for i in range(bot-1, top-1, -1):
                result.append(matrix[i][left])
            left+=1

        return result