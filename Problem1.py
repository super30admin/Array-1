# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        answer=[]
        n=len(nums)
        runningProduct=1
        answer.append(runningProduct)
        #left
        for i in range(1,n):
            runningProduct=runningProduct*nums[i-1]
            answer.append(runningProduct)

        #right
        runningProduct=1
        for i in range(n-2,-1,-1):
            runningProduct=runningProduct*nums[i+1]
            answer[i]=answer[i]*runningProduct
        return answer