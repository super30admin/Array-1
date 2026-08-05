# https://leetcode.com/problems/product-of-array-except-self/description/

# Used the runnig product approach. In this with the loop find out the product of all elements to the left of each index stored in result array at the index position. Second loop is used to find the product of all element to the right of each index and multiply with the result array.    
# Time Complexity: O(n) Space Complexity: O(1)


class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        n = len(nums)
        result = [0] * n
        # initializing the running product with 1
        running_product = 1
        # nothing at the left for the 1st element
        result[0] = 1
        # left side running product, as we set 0th element at 1 so starting from 1st position
        for i in range(1,n):
            # we want left side product so multiplying till the i - 1
            running_product = running_product * nums[i - 1]
            # at ith position we are storing the product of the left side numbers
            result[i] = running_product

        running_product = 1
        # right side running product starting from second last element
        for i in range(n-2, -1, -1):
            # we want right side product so multiplying from i + 1
            running_product = running_product * nums[i + 1]
            # at ith position we are storing the product of the numbers
            result[i] = result[i] * running_product
        
        return result
    
solution = Solution()
print(solution.productExceptSelf([1,2,3,4]))