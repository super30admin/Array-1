# Time Complexity: O(n)
# Space Complexity: O(n)
# Were you able to run the code on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        

        prods  = [0] * len(nums)
        rp = 1
        for i in range(len(nums)):
            # calculate product of number uptil the right side of current index i and store in index i of prods array
            prods[i] = rp
            rp *= nums[i]

        rp = 1
        for i in range(len(nums)-1, -1, -1):
            # calculate product of left side along with right side of index excluding the current index i element
            prods[i] = rp * prods[i]
            rp*=nums[i]

        return prods