class Solution:
	def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
		if not matrix or not matrix[0]:
			return []
		ans = []
		m = len(matrix)
		n = len(matrix[0])
		r, c, i = 0, 0, 0
		d = True
		while(i<m*n):
			ans.append(matrix[r][c])
			if d:
				#upward
				if c == n-1:
					r+=1
					d = False
				elif r == 0:
					c+=1
					d = False
				else:
					r-=1
					c+=1
			else:
				#downward
				if r == m-1:
					c+=1
					d = True
				elif c == 0:
					r+=1
					d = True
				else:
					r+=1
					c-=1
			i+=1
		return ans


#time complexity - O(m*n), dimensions of the input matrix

#space complexity - O(1) as no auxillary dat structure used

#all test cases passed