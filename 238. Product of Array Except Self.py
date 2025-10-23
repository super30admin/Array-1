# Time: O(n^2)
# Space: O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1] * len(nums)
        for i in range(len(result)):
            for j in range(len(nums)):
                if j != i:
                    result[i] *= nums[j]
        return result
    
# Time: O(3n) = O(n)
# Space: O(2n) for 2 seperate arrays
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left_running = [1] * len(nums)
        right_running = [1] * len(nums)
        result =[0] * len(nums)

        for i in range(1,len(nums)):
            left_running[i] = nums[i-1] * left_running[i - 1]
        for j in range(len(nums) - 2, -1, -1):
            right_running[j] = nums[j+1] * right_running[j + 1]
        for k in range(len(nums)):
            result[k] = left_running[k] * right_running[k]

        return result


# Time Complexity : O(n)
# Space Complexity : O(1) leaving the output array
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
    # - Form the result array with everything as 1
    # - Do the left pass with running product
    # - Then do the right pass muliplying with the current left pass elements of the array

# Your code here along with comments explaining your approach

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result =[1] * len(nums)

        for i in range(1,len(nums)):
            result[i] = nums[i-1] * result[i - 1]
        right_running = 1
        for j in range(len(nums) - 1, -1, -1):
            result[j] *= right_running
            right_running *= nums[j]

        return result