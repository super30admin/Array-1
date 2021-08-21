"""
Time complexity: O(n)
Space complexity: O(1)
Approach: Iterate the array from right and store the product of all previous elements from right in result array
            iterate the result from left and store product of all left elements in variable left
            multiply the value in result at ith index with var left
            return result

"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums) <= 1:
            return nums
        else:
            "create a array of size nums"
            result = [1] * len(nums)
            "from right iterate through nums and store subsequent product in result"
            for i in reversed(range(len(nums))):
                if i == len(nums) - 1:
                    continue
                else:
                    result[i] = result[i + 1] * nums[i + 1]
            left = 1
            """iterate through left and store the product in var left. store product of num in ith index and 
            left in result[i]"""
            for i in range(len(nums)):
                result[i] = result[i] * left
                left = left * nums[i]

            return result