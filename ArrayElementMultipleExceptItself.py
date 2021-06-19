class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        LeftProd = {}
        LeftProd[0] = nums[0]
        RightProd = {}
        RightProd[len(nums) - 1] = nums[len(nums)-1]
        leftProd = 1 * nums[0]
        rightProd = 1 * nums[len(nums)-1]
        for i in range(1,len(nums)):
            leftProd = leftProd * nums[i]
            LeftProd[i]= leftProd
            
        for j in range(len(nums)-2, -1, -1):
            rightProd = rightProd * nums[j]
            RightProd[j] = rightProd
        print(LeftProd, RightProd)
        final = {}
        final[0] = RightProd[1]
        for k in range(1, len(nums)-1):
            final[k] = LeftProd.get(k-1) * RightProd.get(k+1)
        final[len(nums)-1] = LeftProd[len(nums)-2]
        return final.values()

            
       
            
            
             
        