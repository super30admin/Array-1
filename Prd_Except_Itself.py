#Time Complexity = O(n)
#Space Complexity = O(n)
#compiled and run on leetcode


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        prdleft = [1 for _ in range(len(nums))] #output matrix

        lp = 1

        for i in range(len(nums)): #calculate the left side products
            prdleft[i] = lp
            lp *= nums[i]

        rp = 1

        for i in range(len(nums) - 1, -1, -1): # multiply lt side prd with running rt prd rp
            prdleft[i] = rp * prdleft[i]
            rp *= nums[i]

        return prdleft
