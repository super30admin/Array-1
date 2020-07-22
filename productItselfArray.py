# Time Complexity : O(n) where n is numbers in the list
# Space Complexity : O(n) output list with same n as number in the list
# Did this code successfully run on LeetCode : yes
# Any problem you faced while coding this : No

# we will do running product of the array from the left and perform running product right on the same
# now we will have the product of array except the self element will be obtained

class Solution:

    def productExceptSelf(self, nums: List[int]) -> List[int]:

        output = [0] * len(nums)

        temp = 1
        rp = 1

        for i in range(len(nums)):
            rp = temp * rp

            output[i] = rp

            temp = nums[i]

        print(output)

        temp = 1
        rp = 1

        for j in range(len(nums) - 1, -1, -1):
            rp = temp * rp

            output[j] = output[j] * rp

            temp = nums[j]

        return output


