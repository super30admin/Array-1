class Solution:
    def spiralOrder(self, matrix):
        if matrix == [] or len(matrix) == 0:
            return []

        left = 0; right = len(matrix[0]); top = 0; bottom = len(matrix)
        result = []

        while left < right and top < bottom:
            
            # Top Row             -----> Same row number, different Column numbers
            for i in range(left, right):
                result.append(matrix[top][i])
            top += 1
            
            # Right Column         -----> Same Column number, different row numbers
            for i in range(top, bottom):
                result.append(matrix[i][right-1])
            right -= 1

            # Bottom Row            -----> Same row number, different Column numbers
            if top < bottom:
                for i in range(right-1, left-1, -1):
                    result.append(matrix[bottom-1][i])
                bottom -= 1

            # Left Column           -----> Same Column number, different row numbers
            if left< right:
                for i in range(bottom-1, top-1, -1):
                    result.append(matrix[i][left])
                left += 1

        return result
        

output = Solution()
print(output.spiralOrder([[ 1, 2, 3 ],[ 4, 5, 6 ],[ 7, 8, 9 ]]))


                    

        

        