// Time Complexity : O(N), actual-O(2N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: first storing each elements previous product in a new array and coming back through same array storing multiplication of 
left product and right product foe every element. which gives the result array.

// Your code here along with comments explaining your approach: traversing twice and storing left product and right product of every element in the result array.


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        prod = 1
        result = []
        
        for i in range(len(nums)):
            result.append(prod)
            prod = prod * nums[i]
        
        prod = 1
        
        for j in range(len(nums)-1, -1, -1):
            result[j] = result[j] * prod
            prod = nums[j] * prod
            
        return result
        
