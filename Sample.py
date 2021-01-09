# Problem 1: product of all elements except element itself -> Time Complexicity: O(n), Space Complexicity: O(1)

class Solution:
    
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        """
        Use running product from both left and right side of the array except the element itself
        - keep products on the edges as 1
        - multiply for final result in backward by by mutating the resulting array:
            - array containing running products of elements to left of it
            - multiply each value in the array by running product in backward pass
        """
        
        if len(nums) == 0: return [0]
        result = []
        left_product = 1; right_product = 1
        # Forward Pass:
        for i in range(0, len(nums)):
            left_product = 1 if i==0 else left_product*nums[i-1] 
            result.append(left_product)
        # Backward Pass
        for i in reversed(range(0, len(nums))):
            right_product = 1 if i == len(nums)-1 else right_product*nums[i+1]
            result[i] = result[i]*right_product
            
        return result
		
# Problem 2: Diagonal traversal of a matrix -> Time Complexicity: O(m*n), Space Complexicity: O(1)

class Solution:
    
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        """
        Use 2 variables; direction and indices
        - switch direction at boundaries and map out the traversal 
        - append values until the desired length of resulting array is met with
        """
        
        if len(matrix) == 0: return []
        direct = 1; m = len(matrix); n = len(matrix[0])
        i = 0; j = 0; idx = 0; array = [0]*m*n

        while idx < m*n:

            array[idx] = matrix[i][j]

            if direct == 1:
                if j == n - 1:
                    i += 1; direct = -1
                elif i == 0: 
                    j += 1; direct = -1
                else:
                    i -= 1; j += 1
            else:
                if i == m - 1:
                    j += 1; direct = 1
                elif j == 0:
                    i += 1; direct = 1
                else:
                    i += 1; j -= 1

            idx += 1
            
        return array
		
# Problem 3: Spiral order in a matrix -> Time Complexicity: O(m*n), Space Complexicity: O(1)
		
class Solution:
    
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        """
        use 4 points (left, right, bottom and top):
        - when we are at top; navigate from left to right (call direction as "right") to add elements
        - when we are at left; navigate from bottom to up (reverse order) and add elements
        """
        
        if len(matrix) == 0: return []
        
        m = len(matrix); n = len(matrix[0])
        idx = 0; result = [0]*m*n
        top_idx = 0; rgt_idx = n - 1
        bot_idx = m - 1; lft_idx = 0
        direct = "right"
        
        while idx < m*n:

            if direct == "right" and idx < m*n:
                for i in range(lft_idx, rgt_idx+1):
                    result[idx] = matrix[top_idx][i]
                    idx += 1
                top_idx += 1
                direct = "down"

            if direct == "down" and idx < m*n:
                for i in range(top_idx, bot_idx+1):
                    result[idx] = matrix[i][rgt_idx]
                    idx += 1
                rgt_idx -= 1
                direct = "left"    

            if direct == "left" and idx < m*n:
                for i in reversed(range(lft_idx, rgt_idx+1)):
                    result[idx] = matrix[bot_idx][i]
                    idx += 1
                bot_idx -= 1
                direct = "up"

            if direct == "up" and idx < m*n:
                for i in reversed(range(top_idx, bot_idx+1)):
                    result[idx] = matrix[i][lft_idx]
                    idx += 1
                lft_idx += 1;
                direct = "right"  
            
        return result
            
