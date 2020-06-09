# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

class Solution:
    # Time = O(n) | O(n) space  
    # def productExceptSelf(self,nums):
    #     if not nums:
    #         return 0 
    #     left = [1] * len(nums)
    #     right = [1] * len(nums)
    #     result = [1] * len(nums)
        
    #     for i in range(1,len(nums)):
    #         left[i] = left[i-1] * nums[i-1]

    #     for i in range(len(nums)-2,-1,-1):
    #         right[i] = right[i+1] * nums[i+1]

    #     for i in range(len(nums)):
    #         result[i] = left[i] * right[i]
    #     return result
    
    # Time = O(n) time  | O(1) Space    
    def productExceptSelf(self,nums):
        result = [1] * len(nums)
        
        prod = 1 
        for i in range(len(nums)):
            result[i] = prod 
            prod = prod * nums[i]
        
        prod = 1 
        for i in range(len(nums)-1,-1,-1):
            result[i] = result[i] * prod 
            prod = prod * nums[i]
        
        return result 

if __name__ == "__main__":
    s = Solution()
    nums = [1,2,3,4]
    res = s.productExceptSelf(nums)
    print(res)