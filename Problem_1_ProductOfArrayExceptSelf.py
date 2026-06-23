'''
In this problem, I need to find the product of all the elements except the current elemnt.
I took a result matrix, initially to store product of elements which are on left of the current element, while multiplying to a running sum variable
Once the left product is calculated, then to the same array right elements product is calculated and multiplied on the same elements
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        runningProduct = 1
        n = len(nums)
        # result array to store the product
        result = [0]*n
        result[0] = 1

        # left pass
        for i in range(1, n):
            runningProduct = runningProduct * nums[i-1]
            result[i] = runningProduct
        
        # resetting runningProduct to 1
        runningProduct = 1

        # right pass
        for i in range(n-2, -1, -1):
            runningProduct = runningProduct * nums[i+1]
            result[i] = result[i] * runningProduct
        
        return result

'''
Time Complexity: O(n)
Since we are iterating on the matrix 2 time time complexity would be O(2n), since constants can be ignored, O(n)
Space Complexity: O(n)
Since we are taking a array of length n to store the product array.
'''