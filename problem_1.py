# Time Complexity - O(n)
# Space Complexity - O(n)


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prodUntilNow = 1 
        leftArr = [1] * len(nums)
       
        for i in range(1,len(nums)):
            prodUntilNow = prodUntilNow * nums[i-1] 
            leftArr[i] = prodUntilNow 

        rightProd = 1 


        for i in range(len(nums)-2,-1,-1):
            rightProd = rightProd * nums[i+1]
            leftArr[i] = rightProd * leftArr[i]

        return leftArr

