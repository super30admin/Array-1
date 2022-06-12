#time complexity : O(n) 
#space complexity : O(1) i.e. result is modified in the output variable itself
#Did this code successfully run on Leetcode : Yes
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [0]*len(nums)
        #checking null condition
        if nums == None or len(nums)==0 :
            return result
        #giving the first number as 1 for doing running product
        result[0] = 1
        runningproduct = 1
        #doing the left pass by ignoring the first element of the nums
        for i in range(1, len(nums)):
            #multipling each number with the previous number product
            runningproduct *= nums[i-1]
            #first storing the left pass values in the result list
            result[i]= runningproduct
        #reassigning the value to the running product for the right pass
        runningproduct = 1
        #doing the right to left pass by ignoring the last number of the list nums
        
        for i in range(len(nums)-2, -1, -1):
             #multipling each number with the i+1 number product
            runningproduct *= nums[i+1]
            #directly storing the result of left* right pass result
            result[i] *= runningproduct
        return result
