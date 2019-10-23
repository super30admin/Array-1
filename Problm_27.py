# Problem: LC 238. Product of Array Except Self (Array-1)
# Approach: Used the fact that the product of elements until i-1 and beyond i+1 is equal to product of array except ith element.
# 	Optimized the solution by using no extra space other than output array and 1 runningProd variable. Two-passes required.
# Time Complexity: O(n) where n is number of elements in nums[]. (n+n)
# Space complexity: O(1) constant
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        #we can even create the same using 2 arrays, storing letf product and right [roct and then multiplying that, this is optimised by using only one array
        a = [1] * len(nums)
        #print(a)
        for i in range(0,len(nums),1):  # left product
            if i > 0:
                a[i] = nums[i - 1] * a[i - 1]
            else:
                a[i] = 1
            #i += 1
            #print("www",a)
            temp =1
        for j in range(len(nums) - 1, -1,-1):  # right product

            #print(j)
            if j <= len(nums) - 1:
                a[j]=a[j]*temp
                temp = temp * nums[j]
            #print("vvv", a)
            # no else as we leave the element to be itself
            #j -= 1
        return a