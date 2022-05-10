#Time Complexity O(N) two passes left and right 2 * N 
#Space Complexity O(1) We are just using an array of output
#It successfully runs on leetcode


#Approach: for every number we want to find prodcuts of all left and rigth elements and then we want to multiply it to get ans
# so we will first store result of left pass by skipping 1st element as for 1st element product is 1 so start with i+1
# in right pass will skip 1 index as for last index product is one so it will store product from i-1 
#to optimize it storing left pass and right pass in same result array
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix=1
        postfix=1
        res = [1]* len(nums)
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]

        for i in reversed(range(len(nums))):
            res[i] *= postfix
            postfix *= nums[i]

        return res