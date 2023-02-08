#All TC passed on leetcode

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        #Here we first compute left product and the right product for each num. 
        #For left product keep track of runningProduct which holds the left product till the 
        #previous pos of current then multiply runningProduct and prev num to get cur pos left product. 
        #Similary we compute right product. 
        #Time complexity - O(n) 
        #Space complexity - O(1) as space alloted for o/p is not considered 
        n = len(nums)
        res = [0]*n
        res[0] = 1
        runningProduct = 1

        for i in range(1, n):
            runningProduct *= nums[i-1]
            res[i] = runningProduct

        runningProduct = 1

        for i in range(n-2, -1, -1):
            runningProduct *= nums[i+1]
            res[i] *= runningProduct

        return res
            

        