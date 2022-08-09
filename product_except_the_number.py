# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        _size = len(nums)
        prod = [0] * _size
        _m = 1
        prod[0] = 1
        for i in range(1, _size):
            _m *= nums[i - 1]
            prod[i] = _m
        _m = 1
        for i in range(_size - 2, -1, -1):
            _m *= nums[i+1]
            prod[i] *= _m
        return prod


if __name__ == '__main__':
    _arr = [1, 2, 3, 4]
    print(Solution().productExceptSelf(_arr))
