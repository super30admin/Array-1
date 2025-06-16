# # Brute Force
# # 1.Loop through each index i in the array.
# # 2.For each i, loop again through all indices j and multiply all nums[j] where j ≠ i.
# # 3.Store the product in the result[i].
# # TC = O(n^2) nested for loops (For large inputs (n > 10⁴), this is very slow), SC = O(1)

# class Solution:
#     def productExceptSelf(self, nums: List[int]) -> List[int]:
#         n = len(nums)
#         result = [0] * n
#         for i in range(n):
#             product = 1
#             for j in range(n):
#                 if i != j:
#                     product *= nums[j]
#             result[i] = product
#         return result

# Two-Pass, No Division, Running Product: Avoid nested loops by precomputing left and right products.
#1.Left Pass: For each index i, store the product of all elements to the left of i in result[i].
#2.Right Pass: Traverse from right to left, multiplying result[i] by the product of all elements to the right of i.
#3.Return the result array, which now holds the product of all elements except nums[i].
# TC = O(n), SC= O(1)
class Solution:
    def productExceptSelf(self, nums):
        n = len(nums)
        result = [0] * n  # Final output array
        # Step 1: Left pass — compute product of all elements to the left of each index
        rp = 1  # Running product
        result[0] = 1  # No elements to the left of index 0
        for i in range(1, n):
            rp *= nums[i - 1]  # Multiply by the element just before i
            result[i] = rp     # Store left product at index i
        # Step 2: Right pass — multiply by product of elements to the right
        rp = 1  # Reset running product
        for i in range(n - 2, -1, -1):  # Start from second-last to the first
            rp *= nums[i + 1]          # Multiply by the element just after i
            result[i] *= rp            # Multiply with existing left product
        return result