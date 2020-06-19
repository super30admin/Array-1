class Solution:
	def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
		if not matrix:
				return []
		ans = []
		top, bottom, left, right = 0, len(matrix)-1, 0, len(matrix[0])-1
		trigger = 0
		while(top<=bottom and left<=right):
			if trigger == 0:
				for i in range(left, right+1):
					ans.append(matrix[top][i])
				top+=1
			elif trigger == 1:
				for i in range(top, bottom+1):
					ans.append(matrix[i][right])
				right-=1
			elif trigger == 2:
				for i in range(right,left-1,-1):
					ans.append(matrix[bottom][i])
				bottom-=1
			else:
				for i in range(bottom, top-1, -1):
					ans.append(matrix[i][left])
				left+=1
			trigger = (trigger+1)%4
		return ans

#time complexity - O(n*m)
#sapce complexity - O(1)

#all test cases passed