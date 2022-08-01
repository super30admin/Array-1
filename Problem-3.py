#  Spiral Matrix
'''
Leetcode all test cases passed: Yes
Solution:
    spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n is the no of rows in matrix
        m is the no of columns in matrix
        Space Complexity: O(1)
        Time Complexity: O(m * n)
'''

#########################Iterative############################
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top_border = 0
        right_border = len(matrix[0]) - 1
        bottom_border = len(matrix) - 1
        left_border = 0
        res = []
        curr_i = top_border
        curr_j = left_border
        while top_border <= bottom_border:
            curr_i = top_border
            curr_j = left_border
            while curr_j < right_border:
                res.append(matrix[curr_i][curr_j])
                curr_j += 1
                
            res.append(matrix[curr_i][curr_j])
            top_border += 1
            curr_i += 1
            if (not (top_border <= curr_i <= bottom_border)) or (not (left_border <= curr_j <= right_border) ):
                break
            while curr_i < bottom_border:
                res.append(matrix[curr_i][curr_j])
                curr_i += 1
            
            res.append(matrix[curr_i][curr_j])
            right_border -= 1
            curr_j -= 1
            if (not (top_border <= curr_i <= bottom_border)) or (not (left_border <= curr_j <= right_border) ):
                break  
            while curr_j > left_border:
                res.append(matrix[curr_i][curr_j])
                curr_j -= 1
            
            res.append(matrix[curr_i][curr_j])
            bottom_border -= 1
            curr_i -= 1
            if (not (top_border <= curr_i <= bottom_border)) or (not (left_border <= curr_j <= right_border) ):
                break
            while curr_i > top_border:
                res.append(matrix[curr_i][curr_j])
                curr_i -= 1
            
            res.append(matrix[curr_i][curr_j])
            left_border += 1
            curr_j += 1
            if (not (top_border <= curr_i <= bottom_border)) or (not (left_border <= curr_j <= right_border) ):
                break
        return res
#########################Reccursive############################
class Solution:
    def iterateSpiral(self,matrix,top_border,right_border,bottom_border,left_border,res):
        curr_i = top_border
        curr_j = left_border
        if top_border <= bottom_border:
            curr_i = top_border
            curr_j = left_border
            while curr_j < right_border:
                res.append(matrix[curr_i][curr_j])
                curr_j += 1

            res.append(matrix[curr_i][curr_j])
            top_border += 1
            curr_i += 1
            if (not (top_border <= curr_i <= bottom_border)) or (not (left_border <= curr_j <= right_border) ):
                return res
            while curr_i < bottom_border:
                res.append(matrix[curr_i][curr_j])
                curr_i += 1

            res.append(matrix[curr_i][curr_j])
            right_border -= 1
            curr_j -= 1
            if (not (top_border <= curr_i <= bottom_border)) or (not (left_border <= curr_j <= right_border) ):
                return res 
            while curr_j > left_border:
                res.append(matrix[curr_i][curr_j])
                curr_j -= 1

            res.append(matrix[curr_i][curr_j])
            bottom_border -= 1
            curr_i -= 1
            if (not (top_border <= curr_i <= bottom_border)) or (not (left_border <= curr_j <= right_border) ):
                return res
            while curr_i > top_border:
                res.append(matrix[curr_i][curr_j])
                curr_i -= 1

            res.append(matrix[curr_i][curr_j])
            left_border += 1
            curr_j += 1
            if (not (top_border <= curr_i <= bottom_border)) or (not (left_border <= curr_j <= right_border) ):
                return res
            return self.iterateSpiral(matrix,top_border,right_border,bottom_border,left_border,res)
        else:
            return res
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top_border = 0
        right_border = len(matrix[0]) - 1
        bottom_border = len(matrix) - 1
        left_border = 0
        res = []
        return self.iterateSpiral(matrix,top_border,right_border,bottom_border,left_border,res)
