# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output=[1]
       
        for i in range(len(nums)-1,0,-1):
            output.append(nums[i]*output[-1])
        print(output)
        output=output[::-1]
        var=1
        for i in range(len(nums)):
            output[i]=output[i]*var
            var=var*nums[i]
            
        return output