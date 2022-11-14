#Time complexity: O(n)
#Space complexity: O(1)

#Accepted on Leetcode

#Approach:
#For any elem in an array, product of array except self = product of all elems to left * product of all elems to right
#Construct two arrays L and R where each element gives the sum of all elems to left and right of the element respectively (maintain a running product)
#Soln[i] = L[i] * R[i], do this in-place (by computing L arr first, compute R on the fly by traversing from right to left, multiply each running R val with L[i])

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        A = nums
        n = len(nums)
        soln = [1 for i in range(n)]

        #Computing the left values in soln array itself
        for i in range(1,n):
            lIndex = i
            soln[lIndex] = A[lIndex - 1] * soln[lIndex - 1]

        #Multiplying the right values with left values instantly to get solution for that index
        rVal = 1
        for i in range(n-1,-1, -1):
            rIndex = i
            soln[rIndex] *= rVal
            rVal *= A[rIndex]

        return soln

#TC 0(1):
# n = 4, A = [1,2,3,4], soln = [1,1,1,1]
#L here means soln array

# i 1 to 3 (inclusive)
# i = 1, lI = 1, L[1] = A[0] * L[0] = 1
# i = 2, lI = 2, L[2] = A[1] * L[1] = 2 * 1 = 2
# i = 3, lI = 3,  L[3] = A[2] * L[2] = 3 * 2 = 6
# A = [1,2,3,4], soln = [1,1,2,6]

# i 3 to 0 (inclusive)
#rVal = 1
# rI = 3,  soln[3] = 1 * 6 = 6, rVal = 1 * 4 = 4
# rI = 2, soln[2] = 4 * 2 = 8, rVal = 4 * 3 = 12
#... valid



# TC 
# n = 4, A = [1,2,3,4], L = [1,1,1,1], R = [1,1,1,1]
# i 1 to 3 (inclusive)
# i = 1, lI = 1, rI = 4 - (2) = 2, L[1] = A[0] * L[0] = 1, R[2] = A[3] * R[3] = 4
# i = 2, lI = 2, rI = 4 - 3 = 1, L[2] = A[1] * L[1] = 2 * 1 = 2, R[1] = A[2] * R[2] = 3 * 4 = 12
# i = 3, lI = 3, rI = 4 - 4 = 0, L[3] = A[2] * L[2] = 3 * 2 = 6, R[0] = A[1] * R[1] = 2 * 12 = 24
# A = [1,2,3,4], L = [1,1,2,6], R = [24,12,4,1]
#soln = [24, 12, 8, 6]

# TC 2 
# A = [2,3], L = [1,1], R = [1,1]
# n = 1 to 2
# Valid soln

        
