"""
Left pass: For index i, keep product of all elements to the left of i in the output array.
Right pass: Similarly, move from right, multiplying each with the product of all elements to right of i.
Finally, at each index we have product of all elements except nums[i]
"""
"""
Time Complexity: O(n): Two passes
Space Complexity: O(1) extra space (not taking output array)
"""

class product:
    def productExceptSelf(self,nums):
        n = len(nums)
        output = [1] * n

        left = 1
        for i in range(n):
            output[i] = left
            left *= nums[i]

        right = 1
        for i in range(n - 1, -1, -1):
            output[i] *= right
            right *= nums[i]

        return output

if __name__=="__main__":

    obj = product()
    nums = [1, 2, 3, 4]
    print(obj.productExceptSelf(nums))
    