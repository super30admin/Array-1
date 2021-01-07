# Created by Aashish Adhikari at 6:56 PM 1/6/2021

'''
Time Complexity:
Multiple O(n) iterations -->  ~O(n) where n is the length of nums

Space Complexity:
O(2n)
'''

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        prod_on_left = [0 for idx in range(len(nums))]
        prod_on_right = [0 for idx in range(len(nums))]

        prod_on_left[0] = 1
        prod_on_right[-1] = 1

        for idx in range(1, len(nums)):
            prod_on_left[idx] = nums[idx-1] * prod_on_left[idx-1]

        for idx in range(len(nums)-2, -1, -1):
            prod_on_right[idx] = nums[idx+1] * prod_on_right[idx+1]


        return [prod_on_left[idx] * prod_on_right[idx] for idx in range(len(prod_on_left))]