# Time Complexity --> O(n)
# Space Complexity --> O(1) There is no auxillary space
# Approach --> At each index, we find the running product to the left and right of it individually and then produce the result using their product.
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        answer = []
        # Find the running prod to the left of each element
        lprod = 1
        answer.append(lprod)
        for i in range(1, len(nums)):
            lprod = lprod * nums[i-1]
            answer.append(lprod)
        
        rprod = 1
        for i in range(len(nums)-2,-1,-1):
            rprod = rprod * nums[i+1]
            answer[i] = answer[i]*rprod
        return answer 
        

'''
# Time Complexity --> O(n*2)
# Space Complexity --> O(1) There is no auxillary space
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        answer = []
        for i in range(len(nums)):
            prod = 1
            for j in range(len(nums)):
                if i!=j:
                    prod = prod*nums[j]
            answer.append(prod)
        return answer 

'''
