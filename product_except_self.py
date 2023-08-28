# Time complexity O(N)
# Space complexity O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
         
        left = [1] * len(nums)
        rp = 1

        for i in range(1,len(nums)):
            rp = rp * nums[i-1]
            left[i] = rp
        

        rp = 1

        for i in range(len(nums)-2 , -1 , -1):
            rp = rp * nums[i+1]
            #right[i] = rp
            left[i] = left[i] *rp

        
        #result = [1] * len(nums)

        #for i in range(len(nums)):

            #result[i] = left[i] * right[i]


        return left


