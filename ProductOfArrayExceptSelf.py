# brute force approach
class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        if nums == None or len(nums) == 0:
            return [-1]
        
        n = len(nums) # 4
        result = []

        for i in range(n): # 0
            product = 1
            for j in range(n): # 1
                if i != j:
                    product *= nums[j] # 1 * 2 = 2 | 2 * 3 = 6 | 6 * 4 = 24
            result.append(product)
        
        return result

# optimized approach 1
class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        if nums == None or len(nums) == 0:
            return [-1]

        n = len(nums)
        
        left_arr = [1] * n
        for i in range(1,n):
            left_arr[i] = nums[i-1] * left_arr[i-1]

        right_arr = [1] * n
        for i in range(n-2,-1,-1): # usualy to iterate reverse, we consider n-1. But here we want to skip the first element like we did in the left_arr. Hence n-2
            right_arr[i] = nums[i+1] * right_arr[i+1] # we are doing +1 since we need to capture the product from right side. If we do -1 : -2-1 = -3, that goes to the left element.
        
        result = []
        for i in range(n):
            result.append(left_arr[i]*right_arr[i])

        return result

# optimized approach 2
class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        if nums == None or len(nums) == 0:
            return [-1]
        
        n = len(nums)
        result = [1] * n
        rp = 1 # running product

        for i in range(1,n):
            result[i] = result[i-1] * nums[i-1]

        for i in range(n-1,-1,-1):
            result[i] = rp * result[i]
            rp *= nums[i]
        
        return result