class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rows = len(matrix)
        columns = len(matrix[0])
        output = []

        top_bou = 0
        bottom_bou = rows - 1
        left_bou = 0
        right_bou = columns - 1

        while top_bou <= bottom_bou and left_bou <= right_bou:
            # Traverse top row
            for j in range(left_bou, right_bou + 1):
                output.append(matrix[top_bou][j])
            top_bou += 1

            # Traverse right column
            for i in range(top_bou, bottom_bou + 1):
                output.append(matrix[i][right_bou])
            right_bou -= 1

            # Traverse bottom row
            if top_bou <= bottom_bou:
                for j in range(right_bou, left_bou - 1, -1):
                    output.append(matrix[bottom_bou][j])
                bottom_bou -= 1

            # Traverse left column
            if left_bou <= right_bou:
                for i in range(bottom_bou, top_bou - 1, -1):
                    output.append(matrix[i][left_bou])
                left_bou += 1

        return output
