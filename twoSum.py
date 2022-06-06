# Time Complexity: O(n); n is the nums list length
# Space Complexity: O(n)
  
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        hashMap = dict()
        
        for i in range(len(nums)):
            if target - nums[i] in hashMap:
                return [i, hashMap[target-nums[i]]]
            hashMap[nums[i]] = i
        
        
            
        
