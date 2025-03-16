class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums == None or len(nums) == 0:
            return []

        result = [0 for i in range(len(nums))]
        rp = 1
        for i in range(len(nums)):
            if i == 0:
                rp = 1
            else: 
                rp = rp * nums[i-1] 

            result[i] = rp
        rp =1
        for j in range(len(nums)-2,-1,-1):
            rp = rp * nums[j+1]
            result[j] = result[j] * rp
        return result          
            

                  



        