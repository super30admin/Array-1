# // Time Complexity : O(n)
# // Space Complexity : O(n) but O(1) in leetcode, since ans array does not take into account as space complexity
# // Did this code successfully run on Leetcode :
# // Three line explanation of solution in plain english:
# create an ans array of nums lenght and assign first element as 1 and multiply
# i-1 elements of ans and nums until end - 1. Assign end as 1 and similary multiply
# i element of nums from end to start.   

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        length = len(nums)
        
        r = ans = [0] * length
        
        # left end element is 1, since left to first element is none
        ans[0] = 1
        
        # product of ans and nums of previous element and store it in current index of ans
        for i in range(1,length):
            ans[i] = ans[i-1]*nums[i-1]
        
        # right end element is 1, since right to first element is none
        r= 1
        
        # product of ans and nums of next element and store in place in ans array
        for i in reversed(range(length)):
            ans[i] = ans[i] * r
            
            # update r from right end
            r *= nums[i]
            
        return ans