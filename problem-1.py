#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        arr = [0]*len(nums)
        arr[0] = 1
        #product for right side
        for i in range(1,n):
            arr[i] = arr[i-1]*nums[i-1]
        r = 1
        #product for the left side
        for i in reversed(range(n)):
            arr[i] *= r
            r *= nums[i]
        return arr