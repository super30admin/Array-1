'''
running product in forward pass : [1,1,2,6], we store the rp[i-1] at i_th idx 
running product in backward pass (on original array) : [24,12,4,1] 
Final answer = rp_forward x rp_backward 
Time complextiy: O(n) - 2 linear search
Space complexity: O(n)
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rp_forward = []
        
        # forward pass
        rp = 1
        for i in range(len(nums)):
            rp_forward.append(rp) # we store the rp[i-1] at i_th idx
            rp = rp*nums[i] # update the rs
        
        # backward pass
        rp_backward = [0]*len(nums)
        rp = 1
        for i in range(len(nums)-1,-1,-1):
            rp_backward[i] = rp # we store the rp[i+1] at i_th idx
            rp = rp*nums[i] # update the rp
        
        # final answer : rp_forward*rp_backward
        for i in range(len(nums)):
            rp_forward[i] = rp_forward[i]*rp_backward[i]
        
        return rp_forward

'''
Solution 2 : Search space optimized
running product in forward pass : [1,1,2,6], we store the rp[i-1] at i_th idx 
running product in backward pass (on original array) : [24,12,4,1] 
Final answer = rp_forward x rp_backward 
Time complextiy: O(n) - 2 linear search
Space complexity: O(1)
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        answer = []
        
        # forward pass
        rp = 1
        for i in range(len(nums)):
            answer.append(rp) # we store the rp[i-1] at i_th idx
            rp = rp*nums[i] # update the rs
        
        # backward pass
        rp = 1
        for i in range(len(nums)-1,-1,-1):
            answer[i] = answer[i]*rp # we store the rp[i+1] at i_th idx
            rp = rp*nums[i] # update the rp
        
        
        return answer