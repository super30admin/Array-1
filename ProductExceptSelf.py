// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// // Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res=[]
        left=[]
        right=[]
        product=1
        for i in range(len(nums)): # calculate all the products in left of the index element
            left.append(product)
            product=product*nums[i]
        product=1
        for i in range(len(nums)-1,-1,-1): # calculate all the products in right of the index element starting from reverse
            right.insert(0,product)
            product=product*nums[i]
        print(left,right)
        for i in range(len(nums)): # calculate result by multiplying the left and right of every index
            res.append(left[i]*right[i])
        return res