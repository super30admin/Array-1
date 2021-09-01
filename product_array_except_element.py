# // Time Complexity : O(n) where n: number of elements
# // Space Complexity : O(n) for the output array
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, left: List[int]) -> List[int]:
        
        
        right = [1 for _ in left]
        right[-1] = left[-1]
        
        # approach: maintaining cummulative left and 
        # right products of the array
        
        for i in range(len(left)-2,-1,-1):
            right[i] =  left[i]*right[i+1]
            
        for i in range(1, len(left)):
            left[i] = left[i-1]*left[i]

        # now using both arrays as right & left product indicators
        # changing the result array
        for i in range(len(left)-1,-1,-1):
            if i > 0 and i < len(left)-1:
                left[i] = left[i-1]*right[i+1]
            elif i > 0:
                left[i] = left[i-1]
            else:
                # i == 0 case
                left[i] = right[i+1]
        return left
                