# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
#First is brute force nested for loops and when j != i we will get the product
#Next approach is reducing n2 to n solution with increased space by having leftproduct and rightproduct array
#To reduce space we can just multiply the runningproduct to the output array from the right

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums:
            return None
        result = []
        for i in range(len(nums)):
            product = 1
            for j in range(len(nums)):
                if j != i:
                    product *= nums[j]
            result.append(product)
        return result
#Time - O(N2)
#Space - O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums:
            return None
        result = []
        leftproduct = [1] * len(nums)
        rightproduct = [1] * len(nums)
        for i in range(1,len(nums)):
            leftproduct[i] = leftproduct[i-1] * nums[i-1]

        for j in range(len(nums)-2, -1, -1):
            rightproduct[j] = rightproduct[j+1] * nums[j+1]

        for i in range(len(leftproduct)):
            result.append(leftproduct[i] * rightproduct[i])
        return result
#Time = O(2N)
#Space - O(3N)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums:
            return None
        result = [1] * len(nums)
        rp = 1  
        for i in range(1, len(nums)):
            result[i] = result[i-1] * nums[i-1]
        print(result)

        for j in range(len(nums)-2, -1, -1):
            rp *= nums[j+1]
            result[j] *= rp
        return result
#Time - O(N)
#Space - O(1)
