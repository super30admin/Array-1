#Time Complexity: O(n)
#Space Complexity: O(n)

def productExceptSelf(nums):
        leftpass=1
        result=[0 for i in range(len(nums))]
        for i in range(len(nums)):
            result[i]=leftpass
            leftpass=leftpass*nums[i]
        rightpass=1
        for i in range(len(nums)-1,-1,-1):
            result[i]=result[i]*rightpass
            rightpass=rightpass*nums[i]
        return result
            