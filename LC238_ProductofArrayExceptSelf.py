"""
Brute Force - we can take the product of all the elements and for every index divide it by the element at that index

Approach 2 - we can have a running product and multiply with the next element and the elements after the target element

[1,2,3,4] : 
at element = 2 running product = 1, product on RHS = 12 

for [1,2,3,4]                  
Left products at respective indices = [1,1,2,6]
Right products at respective indices = [24,12,4,1]

final output = product of corresponding elements in L and R arrays [24,12,8,6]

TC = O(n) => n = nuber of elements in the array
SC = O(n) if we maintain 2 arrays L and R

Optimization : we can multiply left product to the right product in the left pass and return the same array redicing the SC to O(1)
as we are going to return the same array

"""

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        
        result = [None for _ in range(n)]
        if nums == None or len(nums)==0:
            return result
        result[0] = 1
        rp = 1
        for i in range(1,n):
            rp = rp*nums[i-1]
            result[i]=rp
            
        rp = 1
        for i in range(n-2, -1, -1):
            rp = rp*nums[i+1]
            result[i]=rp * result[i]
        return result

object =  Solution()
