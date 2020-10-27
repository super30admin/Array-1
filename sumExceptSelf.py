class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        result = [1]*(len(nums))
        rp = 1
        temp = 1
        
        #  1, 1, 2, 6
        for i in range(0,len(nums)):
            rp = rp * temp
            result[i] = rp
            temp = nums[i]

        rp = 1
        temp = 1    
        for j in range(len(nums)-1, -1, -1):
            rp = rp * temp
            result[j] = rp * result[j]
            temp = nums[j]
  
        return result

'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        left = [1]*(len(nums))
        right = [1]*(len(nums))
        
        #  1, 1, 2, 6
        for i in range(1,len(nums)):
            left[i] = left[i-1] * nums[i-1]
            
        for j in range(len(nums)-2, -1, -1):
            right[j] = right[j+1] * nums[j+1]
        
        result = []
        
        for i in range(len(nums)):
            result.append(left[i] * right[i])
            
        return result

'''

            
        