from typing import List
# Time Complexity : O(n), Where n is number of elements in nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
'''Three line explanation of solution in plain english:
Here we will move in forward direction and evaluate the product of all previous and store them in output List,
Then we will do same think in backward direction apart from evalauting we will multiply that value with already value existing in the output List
'''

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        output=list()
        pro=1
        #This will get in the forward
        for i in nums:
            output.append(pro)
            pro=i*pro
        #print(output)
        
        pro=1
        #This will get in the backward
        for i in range(-1,-(len(nums)+1),-1):
            output[i]=output[i]*pro
            pro=pro*nums[i]
        #print(output)
        
        
        return output