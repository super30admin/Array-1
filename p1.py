#Tc = o(n)
#SC = O(n)
#successfully submitted on leetcode; yes

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = [0 for i in range(len(nums))]
        right = [0 for i in range(len(nums))]

        #left pass
        left[0] = 1
        for i in range(1, len(nums)):
            left[i] = nums[i-1] * left[i-1]
        
        #right pass
        right[-1] = 1
        for i in range(len(nums)-2, -1, -1):
            right[i] = nums[i+1] * right[i+1]
        
        ans = []
        for i in range(0, len(nums)):
            ans.append(left[i]*right[i])
        return ans 

