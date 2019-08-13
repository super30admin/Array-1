class Problem2:
	def Solution(self, matrix):
		if len(matrix) == 0:
            return []
		rows = len(matrix)
		columns = len(matrix[0])
		res_arr = [None] * (rows * columns)
		index = 0
		matrix_r = 0
		matrix_c = 0
		direc = 1
		while(index < (rows * columns)):
			res_arr[index] = matrix[matrix_r][matrix_c]
			if direc == 1:
				if matrix_c + 1 > columns - 1:
					matrix_r += 1
					direc = 0
				elif matrix_r - 1 < 0:
					matrix_c += 1
					direc = 0
				else:
					matrix_r -= 1
					matrix_c += 1
			else:
				if matrix_r + 1 > rows - 1:
					matrix_c += 1
					direc = 1
				elif matrix_c - 1 < 0:
					matrix_r += 1
					direc = 1
				else:
					matrix_r += 1
					matrix_c -= 1
			index += 1
		return res_arr

if __name__ == '__main__':
	p2 = Problem2()
	print(p2.Solution([[ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ]]))