
# O(m*n) time, O(m*n) space

# start with a flat array of length of m*n, iterate through that array, moving right and left pointers depending on boundaries
# top left, bottom right, column is 0, row is 0. Flag is True means going up, Flag false means going down

class Solution:
	def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
		m = len(mat)
		n = len(mat[0])

		res = [0]*(n*m)

		flag = True # True going up, False going down

		r=0
		c=0
		for i in range(len(res)):
			res[i] = mat[r][c]
			if flag:
				if c == n-1:
					r+=1
					flag = False 
				elif r == 0:
					c+=1
					flag = False 
				else:
					r-=1
					c+=1
			else:
				if r == m-1:
					c+=1
					flag=True
				elif c == 0:
					r+=1
					flag=True 
				else:
					r+=1
					c-=1

		return res

