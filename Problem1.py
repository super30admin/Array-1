#Arrays-1
#Problem 3 : https://leetcode.com/problems/spiral-matrix/
#Test Cases Passed on LeetCode
#Time Complexity-O(N)
#Space Complexity-O(1)
#layer by layer traversal with taking into consideration crossover points
class Solution:
    def productExceptSelf(self, nums) :
            p = 1
            n = len(nums)
            output = []
            #Traversal twice first we append in output array with p=1 s.t 
            #every element corresponds to product before that element
            for i in range(0,n):
                output.append(p)
                p = p * nums[i]

            p = 1
            for i in range(n-1,-1,-1):
                output[i] = output[i] * p
                p = p * nums[i]
            return output
            
            

sol=Solution()
nums = [1,2,3,4]
print(sol.productExceptSelf(nums))













