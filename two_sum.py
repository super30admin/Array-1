# sc : O(n)
# tc :O(n)
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashmap = dict()
        for i in range(len(nums)):
            if target - nums[i] in hashmap:
                return i,hashmap[target - nums[i]]
            else:
                hashmap[nums[i]] = i
                