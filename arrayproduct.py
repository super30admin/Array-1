# Time Com : O(n) Space Com : O(1)
# Leetcode successfully ran

class Solutions:
    def productExceptSelf(self,nums):
        output = [1]*len(nums)
        prod = 1
        # forward pass
        for i in range(1,len(nums)):
            prod = prod * nums[i-1]
            output[i] = output[i]*prod
        prod = 1
        #backward pass
        for i in range(len(nums)-2,-1,-1):
            prod = prod *nums[i+1]
            output[i] = output[i]*prod

        return output


obj = Solutions()
print(obj.productExceptSelf([1,2,3,4]))
