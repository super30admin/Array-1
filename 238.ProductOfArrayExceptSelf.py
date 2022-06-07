class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        nums_len = len(nums)
        left = [0]*nums_len
        right = [0]*nums_len
        result = [0]*nums_len
        
        left[0] = 1
        for i in range(1, nums_len):
            left[i] = left[i-1]*nums[i-1]
        # print(left)
        
        right[-1] = 1
        for i in reversed(range(nums_len-1)):
            right[i] = right[i+1]*nums[i+1]
        # print(right)
        
        for i in range(nums_len):
            result[i] = left[i]*right[i]
            
        # print(result)
        return result
            
            
        # time: o(n)
        # time: o(n) 
         
    
    