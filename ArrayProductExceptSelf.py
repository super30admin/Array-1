#Time complexity:O(n)
#Space complexity:O(n)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums==None or len(nums)==None:
            return []
        l=len(nums)
        arr=[0]*l
        product=1
        for i in range(l):
            arr[i]=product
            product=product*nums[i]
        product=nums[l-1]
        for i in range(l-2,-1,-1):
            arr[i]=product*arr[i]
            product=product*nums[i]
        return arr
