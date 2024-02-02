#Time Complexity: O(2n) or O(n)
#Space Complexity: O(1) #No auxiliary space is used
#Intuition behind this problem is to calculate the products for all elements before and after that 
and multiplying them
#Used 2 arrays initially and then reduced to 1
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        #Output Array
        output_arr=[0]*len(nums)
        #Left to right
        rp=1 #running product
        output_arr[0]=1
        for i in range(1,len(nums)):
            output_arr[i]=rp*nums[i-1]
            rp=output_arr[i]

        #Right to Left
        rp=1 #running product
        for i in range(len(nums)-1,-1,-1):
            output_arr[i]=rp*output_arr[i]
            rp=rp*nums[i]

        return output_arr