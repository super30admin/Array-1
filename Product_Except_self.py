#// #Time Complexity :  O(len(nums))
#// #Space Complexity : O(1)
#// #Did this code successfully run on Leetcode : YES
#// #Three line explanation of solution in plain english
    # Create an array (ans) to compute all the left most elements excluding the elements. For i : compute ans[0] * ans[1] *......ans[i-1]
    # Iterate from n-1 to 0 :
        #Find the right product which stores the product of all the right most elements.
        # Final result will be the product of exisiting element (ans[i] and the right product computed in previous step. 
#// Your code here along with comments explaining your approach
def productExceptSelf(self, nums: List[int]) -> List[int]:
        # result array
        ans = [1] * len(nums)
        leftProduct , rightProduct = 1,1
        
        #Product of left most elements excluding the element
        for i in range(len(nums)):
            ans[i] = leftProduct;
            leftProduct = leftProduct * nums[i]
        
        #Product of right most elements excluding the elements
        for i in range(len(nums)-1 , -1 ,-1):
            ans[i] *= rightProduct
            rightProduct = rightProduct * nums[i]
 
        return ans