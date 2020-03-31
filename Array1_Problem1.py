***
Executed in leetccode: Yes 
Challenges: Initially array was going out of bounds. Resolved it.
Time complexity: O(N)
Space complexity: O(N) with left and right array and O(1) using right variable
Comments: Given below.
***

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        
        # Left and right arrays to store left and right product (excludes the number at that point)
        ''' 
        L, R = [0]*length, [0]*length
        L[0] = 1
        R[length - 1] = 1
        '''
        
        # To store result
        result = [0]*length
        
        '''
        # Product at position i includes products of previous elements
        for i in range(1, length):           # At L(0) it is set as 1
            L[i] = L[i - 1] * nums[i - 1]  
        
        # Product at position i includes products of suceeding elements
        for i in reversed(range(length - 1)):
            R[i] = R[i + 1] * nums[i + 1]
        
        # Find result - product of left and right arrays
        for i in range(length):
            result[i] = L[i] * R[i]
        '''
        
        # For saving space, instead of calculating left and right array, can do it on the fly
        # Same logic
        result[0] = 1
        for i in range(1, length):
            result[i] = result[i-1] * nums[i-1]
        
        right = 1
        for i in reversed(range(length)):
            result[i] = result[i] * right
            right *= nums[i]   # After multiplying with result, update right to right * number at that point
            
        return result
