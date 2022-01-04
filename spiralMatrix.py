# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Three line explanation of solution in plain english
# in the first approach we're maintaining the four pointers top, right, bottom, left
# to maintain the active row,column
# in the second approach we're poping the element out of the main matrix so that we 
# can directly avoid repetition
# in the third approach we're using recursion instead of while loop


from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or matrix == None: return [0]
        resultArray = []
        top = 0
        left = 0
        right = len(matrix[0]) - 1
        bottom = len(matrix) - 1
        while(top <= bottom and left <= right):
            # top
            for i in range(left, right+1):
                resultArray.append(matrix[top][i])
            top += 1
            
            # left
            # we have already got the last element of the first row so - 1 length
            if top <= bottom and left <= right:
                for i in range(top, bottom+1):
                    resultArray.append(matrix[i][right])
                right -= 1
            
            if top <= bottom and left <= right:
                for i in range(right, left-1, -1):
                    resultArray.append(matrix[bottom][i])
                bottom -= 1
            
            if top <= bottom and left <= right:
                for i in range(bottom, top-1, -1):
                    resultArray.append(matrix[i][left])
                left += 1
            
        return resultArray

    def spiralOrder2(self, matrix: List[List[int]]):
        result = [None for i in range( len(matrix) * len(matrix[0]))] 
        curr = 0
        while(len(matrix[0]) != 0):
            # i think the values might not get updated if it's outside the loop?
            numberOfRows = len(matrix[0])
            # top
            for i in range(numberOfRows):
                result[curr] = matrix[0][i]
                curr +=1
            matrix.pop(0)
            if len(matrix) == 0 or len(matrix[0]) == 0: return result;
            # right
            for i in range(len(matrix)):
                result[curr] = matrix[i].pop()
                curr += 1
            if len(matrix) == 0 or len(matrix[0]) == 0: return result;
            # bottom
            bottomRowLength = len(matrix[len(matrix) -1])
            for i in range(bottomRowLength):
                result[curr] = matrix[len(matrix) -1].pop()
                curr +=1
            matrix.pop()
            if len(matrix) == 0 or len(matrix[0]) == 0: return result;
            # left
            for i in range(len(matrix)-1,-1,-1):
                if len(matrix) == 0: return result;
                result[curr] = matrix[i].pop(0)
                curr += 1
        return result;
            
    def spiralOrder3(self, matrix: List[List[int]]):
        top = 0
        left = 0
        right = len(matrix[0]) - 1
        bottom = len(matrix) - 1
        resultArray = []
        length =( right + 1) * (bottom + 1)
        def repeatMe(mat, top, left, right, bottom):
            if not (len(resultArray) == length):
            # if left <= right and top <= bottom and not flag:    
                for i in range(left, right+1):
                    resultArray.append(mat[top][i])
                top += 1
            else: return resultArray   
            
            if not (len(resultArray) == length):
                for i in range(top, bottom+1):
                    resultArray.append(mat[i][right])
                right -= 1
            else: return resultArray  
            
            if not (len(resultArray) == length):
                for i in range(right, left-1, -1):
                    resultArray.append(mat[bottom][i])
                bottom -= 1
            else: return resultArray
            
            if not (len(resultArray) == length):
                for i in range(bottom, top-1, -1):
                    resultArray.append(mat[i][left])
                left += 1
            else: return resultArray
            repeatMe(mat, top, left, right, bottom)
        repeatMe(matrix, top, left, right, bottom)
        return resultArray
    
        
sol = Solution()  
print(sol.spiralOrder3([[1,2,3,4],[5,6,7,8],[9,10,11,12]]))