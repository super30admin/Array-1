class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        #Initializing the array to be returned with 0 values
        prod = [0] *len(nums)

        prod[0] =1

        #Loop over and creating left product of i
        for i in range(1,len(nums)):

            prod[i] = prod[i-1] *nums[i-1]

        #Temp will store the products to the right
        temp =1

        #Loop over and creating right product of i
        for i in reversed(range(len(nums))):

            prod[i] = prod[i] * temp

            temp = temp * nums[i]

        return prod


#This problem returns the output array with products of elements except the ith element itself
#Using a single output array time complexity = O(N)
#Space complexity = O(1)