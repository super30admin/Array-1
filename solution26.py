#Time Complexity:O(2n)
#Space Complexity:O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result=[1 for i in range(len(nums))]            #initializing the output array
        rp=1                                            #initializing the running product
        for i in range(1,len(nums)):                    #for every element starting from index 0 multiply rp with previous element
            rp*=nums[i-1]                               
            result[i]*=rp                               #insert the current rp in the result at index i
        rp=1
        for i in reversed(range(len(nums)-1)):          #for every element starting from index n to 0 multiply rp with next element
            rp*=nums[i+1]
            result[i]*=rp                               #insert the current rp in the result at index i
        return result                                   #return the final result array