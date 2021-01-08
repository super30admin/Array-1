'''
    Time Complexity:
        O(n)

    Space Complexity:
        O(1)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Go right, you will have ans[i] = product of nums[0:i-1]
        Go left, you will ans[i] = ans[i] * product of nums[i+1:n]
'''
class Solution:
    def __init__(self):
        self.nums = []
        self.products = []

    def productExceptSelf(self, nums: List[int]) -> List[int]:
        self.nums = nums
        self.products = [0] * len(nums)

        self.go_rightwards()
        self.go_leftwards()

        return self.products

    def go_rightwards(self):
        prod = 1
        for i in range(len(self.nums)):
            num = self.nums[i]
            self.products[i] = prod
            prod = prod * num

    def go_leftwards(self):
        prod = 1
        for i in range(len(self.nums) - 1, -1, -1):
            num = self.nums[i]
            self.products[i] = self.products[i] * prod
            prod = prod * num
