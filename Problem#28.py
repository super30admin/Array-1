'''
Prolbem Number: 238
Problem Title: Product of Array Except Self

Problem Name: Product Except Self

Source Link: https://leetcode.com/problems/product-of-array-except-self/
'''

# Time Complexity : O(n) as we traverse the list twice but do not use any nested loops.
# Space Complexity : O(n) for the answer list, which stores the product of all elements except the current one.
# Did this code successfully run on Leetcode : Yes, the code runs successfully on Leetcode.
# Any problem you faced while coding this : Yes, understanding the problem statement and implementing the optimized approach correctly.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # Brute Force Approach
        # n = len(nums) # humne nums ki length store ki hai in n (We stored the length of nums in n)
        # result = [] # yeh result list hai jisme hum products store karenge (This is the result list where we will store the products)
        # for i in range(n): # yeh loop i ko 0 se lekar n-1 tak iterate karega (This loop will iterate i from 0 to n-1)
        #     product = 1 # yeh product variable hai jisme hum current index ke liye product store karenge, humne ise 1 se isliye initialize kiya hai kyunki multiplication mein 1 ka koi effect nahi hota (This is the product variable where we will store the product for the current index, initialized to 1 because multiplying by 1 does not change the product)
        #     for j in range(n): # yeh loop j ko 0 se lekar n-1 tak iterate karega (This loop will iterate j from 0 to n-1)
        #         if i != j: # agar i aur j alag hain toh hum product mein nums[j] ko multiply karte hain (if i and j are different, we multiply nums[j] to the product)
        #             product *= nums[j] # humne nums[j] ko product mein multiply kiya (We multiplied nums[j] to the product)
        #     result.append(product) # humne product ko result list mein append kiya (We appended the product to the result list)
        # return result # agar humne result list return nahi ki toh empty list return karte hain (if we didn't return the result list, we return an empty list)

        # Optimized Approach using running product
        # This approach uses two passes to calculate the product of all elements except the current one.
        if len(nums) == 0 or nums is None:
            return []
        n = len(nums)
        answer = [1] * n # humne answer list banayi hai jisme har element ko 1 se initialize kiya hai (We created an answer list initialized with 1 for each element)
        running_product = 1 # yeh running_product variable hai jisme hum current product store karenge (This is the running_product variable where we will store the current product)
        for i in range(1, n): # yeh loop i ko 1 se lekar n-1 tak iterate karega (This loop will iterate i from 1 to n-1)
            running_product *= nums[i-1] # humne nums[i-1] ko running_product mein multiply kiya (We multiplied nums[i-1] to the running_product)
            answer[i] = running_product # humne running_product ko answer[i] mein store kiya (We stored the running_product in answer[i])
        running_product = 1 # ab humne running_product ko 1 se reset kiya (Now we reset the running_product to 1)
        for i in range(n-2, -1, -1): # yeh loop i ko n-2 se lekar 0 tak iterate karega (This loop will iterate i from n-2 to 0)
            running_product *= nums[i+1] # humne nums[i+1] ko running_product mein multiply kiya (We multiplied nums[i+1] to the running_product)
            answer[i] *= running_product # humne answer[i] ko running_product se multiply kiya (We multiplied answer[i] with the running_product)
        return answer # humne answer list return ki (We returned the answer list)
