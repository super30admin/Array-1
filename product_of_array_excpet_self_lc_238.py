"""
Name: Srinidhi Bhat
Did it run on LC: yes
Time Complexity : O(n) - passing through array once
Space Complexity: O(1) - No extra space used for computation 

Logic:
for each array element - a[i] - we have a left part and right part, product of that
for each element will be the required ans.

to reduce the space required, always update a counter element, 
which will take the product of next/prev element and during the next iteration
it will be used for the computation.
"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        counter =1
        op = []
        
        for i in range(len(nums)):
            op.append(counter)
            counter = counter*nums[i]
        
        counter = 1
        
        for j in range(len(nums)-1,-1,-1):
            op[j] = op[j]*counter
            counter = counter*nums[j]
        
        return op