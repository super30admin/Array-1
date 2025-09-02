"""
TC: O(N) {we iterate the nums array twice for its length}
SC: O(1) {Since we dont consider the output as the space, we complete this code in constant time}

Approach:

Since we cannot use the divide operator, we use the preproduct array approach to first calculate and (for all the elements) store the product of 
all the elements before every element. This gives us the pre product array. We then use a variable which will give us the post product of every element
i.e. the product of all elements after that element.
We will multiply this variable for every element with the pre product array element (update pre product array in place) at that point to get our final result array

This problem ran successfully on Leetcode.
"""

from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        def processor(arr):

            res = [1]*len(arr)

            for i in range(1, len(arr)):
                res[i] = res[i-1] * arr[i-1]

            return res
        

        pre = processor(nums)
        rp = 1
        for i in range(len(nums)-2, -1, -1):
            rp = rp*nums[i+1]
            pre[i] *= rp
        
        return pre
