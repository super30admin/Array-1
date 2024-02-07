class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
             [1, 2, 3, 4]
        left [1, 1, 2, 6]
        righ [24, 12, 4, 1]
        time = O(n)
        space = O(1) as answer array does not count towards space.
        """
        res = [0] * len(nums)
        res[0] = 1
        for i in range(1, len(nums)):
        	res[i] = res[i-1] * nums[i-1]

        rp = 1
        for i in range(len(nums)-2, -1, -1):
        	rp *= nums[i+1]
        	res[i] = res[i] * rp
        return res

    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        time: O(m*n)
        space: O(m*n)
        """
        direction = True
        res = []
        i = j = 0
        n, m = len(mat), len(mat[0])
        while len(res) < n * m:
            res.append(mat[i][j])
            if direction:
                if j == len(mat[0]) - 1:
                    direction = False
                    i += 1
                elif i == 0:
                    direction = False
                    j += 1
                else:
                    i -= 1
                    j += 1
            else:
                if i == len(mat) - 1:
                    direction = True
                    j += 1
                elif j == 0:
                    direction = True
                    i += 1
                else:
                    i += 1
                    j -= 1
        return res

    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        1, 2, 3, 4
        5, 6, 7, 8
        9,10,11,12
        time: O(mn)
        space: O(mn)
        """
        top, bottom, left, right = 0, len(matrix)-1, 0, len(matrix[0])-1
        res = []
        while top <= bottom and left <= right:
            for j in range(left, right+1):
                # print(matrix[top][j])
                res.append(matrix[top][j])            
            top += 1
            if top <= bottom:
                for i in range(top, bottom+1):
                    # print(matrix[i][right])
                    res.append(matrix[i][right])
            right -= 1
            if top <= bottom and left <= right:
                for j in range(right, left-1, -1):
                    print(matrix[bottom][j])
                    res.append(matrix[bottom][j])
            	bottom -= 1
            if top <= bottom and left <= right:
                for i in range(bottom, top-1, -1):
                    res.append(matrix[i][left])
            	left += 1
        return res
