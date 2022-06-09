# time complexity: O(m*n)
# space complexity: O(1)


class Solution:
    def spiralOrder(self, matrix):
        row = len(matrix)
        col = len(matrix[0])

        result = []

        # null case
        if matrix == None or len(matrix) == 0:
            return result

        # 4 variable to maintain pointer 1. row begin 2. row end 3. col start 4. col end
        top = 0
        bottom = row-1
        left = 0
        right = col -1
        
        # while loop will run until (row begin and end) and (col begin and end) not cross each other
        while(left <= right and top <= bottom):

            # iterate over first row 
            for i in range(left,right+1,1):
                result.append(matrix[top][i])
            
            # if element reach at end of the row , top(row begin) will increase by 1
            top = top + 1

            # check for inner subproblem
            if (left <= right and top <= bottom):
                 # iterate over last colum from second row to last element of the col 
                for j in range(top,bottom+1,1):
                    result.append(matrix[j][right])

                # if element reach at end of the col , right(col end) will decrease by 1
                right = right - 1
             
            if (left <= right and top <= bottom):
                 # iterate over last row from second-last col to last element of the row 
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
            
                # if element reach at start of the col , bottom(row end) will decrease by 1
                bottom = bottom - 1

            if (left <= right and top <= bottom):
                 # iterate over first col from second-last row to second element of the row 
                for j in range(bottom,top-1,-1):
                    result.append(matrix[j][left])

                left = left + 1

        return result

obj = Solution()
print(obj.spiralOrder([[1,2,3],[4,5,6],[7,8,9]]))
               
        