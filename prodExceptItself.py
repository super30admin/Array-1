"""
238. Product of Array Except Self

Time = O(n);  n = number of elements
space = O(n); n = number of elements
Successfully excecuted on leetcode

Approach - Left, right products
We can use the product of all the numbers to the left and all the numbers to the right of the index. 
Multiplying these two individual products would give us the result.

"""
class Product:
    def productExceptSelf(self, nums: List[int]) -> List[int]:  
        
        n = len(nums)
        left_prod = [0]*n
        right_prod = [0]*n
        
        # For element at index 0, there are no elements in left so prod is 1
        left_prod[0] = 1 
        
        # For element at last index, there are no elements in right so prod is 1
        right_prod[n-1] = 1
        
        output = [0]*n
        
        for i in range(1,n):
            left_prod[i] = nums[i-1]*left_prod[i-1] #update left prod for each element
        for i in reversed(range(n-1)):
            right_prod[i] = nums[i+1]*right_prod[i+1] #update right prod for each element
        for i in range(n):
            output[i] = left_prod[i]*right_prod[i] # multiply
        return output