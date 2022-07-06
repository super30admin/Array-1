"""
Runtime Complexity:
O(n) - because we traverse 'n' elements to compute the product.
Space Complexity:
O(1) - since we are expected to return an array it's constant. No extra memory is created to compute the solution
except the required result array.
Yes, the code worked on leetcode.
The idea behind the algorithm is to create a result array which holds the product of all elements to the left of that particular index. Let's say we are at index 3, then the result array 
would have the product of elements lesser than index 3. Once we finish our left product array, we reset our running product 'rp' variable to 1.
We compute the product of elements to the right starting from n-2 to 0 in decrementing order and multiply this rp with left result array to return the 
final output array.
"""

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums)==0:
            return []
        n = len(nums)
        result = [0 for i in range(len(nums))]
        result[0]=1
        rp = 1
        for i in range(1,n,1):
            rp = rp *nums[i-1]
            result[i] = rp
        rp = 1
        for i in range(n-2,-1,-1):
            rp = rp * nums[i+1]
            result[i] = result[i]*rp
        return result
    