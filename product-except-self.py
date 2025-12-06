# take s=1, left_prod array with length of nums. Loop through nums and multiply each
# element with s and update s to the new value. Store each product value in left_prod array.
# Assign s = 1 and loop through left_prod from reverse. update left_prod[i] with 
# left_prod[i]*s ans update s to s*nums[i]

# Time complexity: O(n)
# Space complexity O(n)

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        s=1
        left_prod=[]
        l=len(nums)
        i=0
        while i<l:
            left_prod.append(s)
            s=s*nums[i]
            i+=1
        s=1
        i=l-1
        print("left prod", left_prod)
        while i>=0:
            left_prod[i]=left_prod[i]*s
            s=s*nums[i]
            i-=1
        return left_prod

        

