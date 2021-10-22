# TC-O(n)
# SC-O(n)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        lef t =[]
        l t =1
        r t =1
        for i in range(len(nums)):
            left.append(lt)
            l t =l t *nums[i]
        for i in reversed(range(len(nums))):
            left[i ] =left[i ] *rt
            r t =r t *nums[i]
        return left
