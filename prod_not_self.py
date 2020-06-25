class Solution:
	def productExceptSelf(self, nums: List[int]) -> List[int]:
		rp, temp = 1, 1
		ans = []
		l = len(nums)-1
		#left
		for n in nums:
			rp *= temp
			ans.append(rp)
			temp = n
		#right
		rp, temp = 1, 1
		for n in reversed(nums):
			rp *= temp
			ans[l]*=rp
			temp = n
			l-=1
		return ans

#time complexity - O(n), n is the size of input array

#space complexity - O(1)

#all test cases passed