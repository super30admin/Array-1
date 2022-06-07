# Time Complexity : O(m*n)
# Space Complexity : O(m*n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
# Your code here along with comments explaining your approach

class Solution:
    def spiralOrder(self, mat: list[list[int]]) -> list[int]:
        ceil, floor = 0, len(mat) - 1
        left, right = 0, len(mat[-1]) - 1
        result = [1] * len(mat) * len(mat[-1])
        ptr = 0
        while ceil <= floor and left <= right:
            for j in range(left, right+1):
                if ptr == len(result):
                    return result
                result[ptr] = mat[ceil][j]
                ptr += 1
            ceil += 1
            for i in range(ceil, floor+1):
                if ptr == len(result):
                    return result
                result[ptr] = mat[i][right]
                ptr += 1
            right -= 1
            for j in range(right, left-1, -1):
                if ptr == len(result):
                    return result
                result[ptr] = mat[floor][j]
                ptr += 1
            floor -= 1
            for i in range(floor, ceil-1, -1):
                if ptr == len(result):
                    return result
                result[ptr] = mat[i][left]
                ptr += 1
            left += 1
        return result


check = Solution()
print(check.spiralOrder([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]))


# Recursive Solution. TC : O(m*n), SC: O(m*n)
# class Solution:
#     def helper(self, mat, ceil, floor, left, right, ptr, result):
#         x = result
#         if ptr == len(result) or ceil > floor or left > right:
#             return result
#         for j in range(left, right + 1):
#             if ptr == len(result):
#                 return result
#             result[ptr] = mat[ceil][j]
#             ptr += 1
#         ceil += 1
#         for i in range(ceil, floor + 1):
#             if ptr == len(result):
#                 return result
#             result[ptr] = mat[i][right]
#             ptr += 1
#         right -= 1
#         for j in range(right, left - 1, -1):
#             if ptr == len(result):
#                 return result
#             result[ptr] = mat[floor][j]
#             ptr += 1
#         floor -= 1
#         for i in range(floor, ceil - 1, -1):
#             if ptr == len(result):
#                 return result
#             result[ptr] = mat[i][left]
#             ptr += 1
#         left += 1
#         return self.helper(mat, ceil, floor, left, right, ptr, result)
#
#     def spiralOrder(self, mat: list[list[int]]) -> list[int]:
#         return self.helper(mat, 0, len(mat)-1, 0, len(mat[-1])-1, 0, [1] * len(mat) * len(mat[-1]))
#
#
# check = Solution()
# print(check.spiralOrder([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]))

