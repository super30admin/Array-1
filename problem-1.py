#Time : O(n)
#Space : O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        output = []
        lproduct = 1
        for i in range(len(nums)):
            output.append(lproduct)
            lproduct*=nums[i]
        
        print(output)
        rproduct =1
        for i in range(len(nums)-1,-1,-1):
            output[i] = rproduct*output[i]
            rproduct*=nums[i]
        
        return output
        