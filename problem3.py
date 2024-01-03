#time complexity : O(m * n)
#space complexity:  O(n)

class Solution:
    def spiralOrder(self, matrix: list[list[int]]) -> list[int]:
        result = []
        if len(matrix) == 0:
            return result

        row = len(matrix) #length of row
        col = len(matrix[0]) #length of column

        #initialize the top,bottom,left and right
        top = 0
        bot = row -1
        left = 0
        right = col-1

        #loop until all elements are visited
        while top <= bot and left <= right:
            for i in range(left, right+1): # moving from left to right
                result.append(matrix[top][i]) #print first row
            top += 1

            for i in range(top, bot+1): #moving top to bottom
                result.append(matrix[i][right]) #print last col
            right -= 1

            if top <= bot:
                for i in range(right, left-1,-1): #moving right to left
                    result.append(matrix[bot][i]) #print last bottom
                bot -= 1
            
            if left <= right:
                for i in range(bot ,top-1, -1): #moving bottom to top
                    result.append(matrix[i][left]) #print first col
                left += 1
        return result


sol = Solution()
mat = [ [1,2,3],
        [4,5,6],
        [7,8,9]]

print (sol.spiralOrder(mat))