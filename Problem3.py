#Time Complexity - O(m * n)
#Space Complexity - O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        top, bot = 0, len(matrix)
        left, right = 0, len(matrix[0])
        
        while left < right or top < bot:
            for x in range(left, right):
                print(matrix[top][x])
                res.append(matrix[top][x])
            top += 1
            
            if left >= right or top >= bot:
                break
            
            for x in range(top, bot):
                res.append(matrix[x][right - 1])
            right -= 1
            
            if left >= right or top >= bot:
                break
            
            for x in range(right-1, left-1, -1):
                res.append(matrix[bot - 1][x])
            bot -= 1
            
            if left >= right or top >= bot:
                break
                
            for x in range(bot-1, top-1, -1):
                res.append(matrix[x][left])
            left += 1
            
        return res