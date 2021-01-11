
# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english:
	# 1 Maintain a direction pointer whoes state change idicates the way of traversal
	# 2 Check for the boundary cases
			# a.when row counter exceeds the total rows
			# b.when col counter exceeds the total cols
			# c.when row and col counters under flow the 0th row and index
	# 3 Move diagonally as per the direction either i-1 j+1 or i+1 j-1

# // Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        
        result = [None] * (len(matrix) * len(matrix[0]))
        m = len(matrix)
        n = len(matrix[0])
        idx = 0
        i = 0
        j = 0
        dirs = 1
        while(idx < len(result)): 
            result[idx] = matrix[i][j]
            # upward
            if dirs == 1:
                if j == n-1:
                    dirs = -1
                    i += 1
                elif i == 0:
                    dirs = -1
                    j += 1
                else:
                    i -= 1
                    j += 1
                    
            else:
                if i == m-1:
                    dirs = 1
                    j += 1
                elif j==0:
                    dirs = 1
                    i += 1
                else:
                    j -= 1
                    i += 1
            idx += 1
        return result