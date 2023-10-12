# Intuition:
# take four pointers (top, left, right, bottom) pointing to 4 edges of the matrix and keep squeezing those pointers (i.e. decrease or increase by 1) after you go through a particular row/coln they  point to. Keep doing this until left doesnt cross right and top doesn't cross bottom ptr.

# TC: O(mxn) as you got through each element only once
# SC: O(1) output list not counted in space complexity
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        m = len(matrix)
        n = len(matrix[0])

        left = 0
        right = n-1
        top = 0
        bottom = m-1
        out = []

        while top <= bottom and left <= right:
            for j in range(left, right+1):
                out.append(matrix[top][j])

            print("top: ", out)
            top += 1

            if top <= bottom and left <= right:
                for i in range(top, bottom+1, 1):
                    out.append(matrix[i][right])
            print("right: ", out)
            right -= 1

            if top <= bottom and left <= right:
                for j in range(right, left-1, -1):
                    out.append(matrix[bottom][j])
            print("bottom: ", out)
            bottom -= 1

            if top <= bottom and left <= right:
                for i in range(bottom, top-1, -1):
                    out.append(matrix[i][left])
            print("left: ", out)
            left += 1

        return out


obj = Solution()
res = obj.spiralOrder([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
print(res)
