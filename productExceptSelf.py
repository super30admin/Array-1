#238. Product of Array Except Self
#Time Complexity : O(n). 
# Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = [0] * (len(nums))
        temp = 1
    
        for i in range(len(nums)):
            if i == 0:
                left[i] = temp
                temp = left[i]
                
            else:
                
                left[i] = nums[i-1] * temp
                temp = left[i]
        temp1 = 1
        n = len(left)
        for j in reversed(range(len(left)-1)):
                if j == n:
                    left[j] = temp1 * left[j]
                    #j = j-1
                else:
                    print(j)
                    temp1 = temp1 * nums[j+1]
                    left[j] = left[j] * temp1
                    #j = j-1
        return left
                
            
        