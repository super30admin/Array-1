class Problem1:
	def Solution1(self, arr):
		# Time complexity : O(n^2) where n is the number of elements in the array
		# Space complexity : One variable so constant space
		output_arr = []
		for i in range(len(arr)):
			prod = 1
			for j in range(len(arr)):
				if i == j:
					continue
				prod *= arr[j]
			output_arr.append(prod)
		return output_arr

	def Solution2(self, arr):
		# Time complexity : O(n) where n is the number of elements in the array
		# Space complexity : One variable so constant space
		# But this uses division
		output_arr = []
		total_prod = 1
		for i in arr:
			total_prod *= i
		for i in arr:
			output_arr.append(total_prod//i)
		return output_arr

	def Solution3(self, arr):
		left_runningP = []
		right_runningP = []
		temp = 1
		for i in arr:
			left_runningP.append(temp)
			temp *= i
		temp = 1
		for i in arr[::-1]:
			right_runningP.append(temp)
			temp *= i
		right_runningP = right_runningP[::-1]
		res = []
		for i in range(len(left_runningP)):
			res.append(left_runningP[i] * right_runningP[i])
		return res

	def Solution4(self, arr):
		res = []
		temp = 1
		for i in arr:
			res.append(temp)
			temp *= i
		temp = 1
		for j in range(len(arr) - 1, -1, -1):
			res[j] *= temp
			temp *= arr[j]
		return res

if __name__ == '__main__':
	p1 = Problem1()
	print(p1.Solution1([1, 2, 3, 4]))
	print(p1.Solution2([1, 2, 3, 4]))
	print(p1.Solution3([1, 2, 3, 4]))
	print(p1.Solution4([1, 2, 3, 4]))