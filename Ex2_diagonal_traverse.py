
# Time Complexity : O(m * n), where m = number of rows, n = number of columns
# Space Complexity : O(1) (excluding the output list)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No

from typing import List

class Solution:
    
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        if not mat or not mat [0]:
            return []
        
        res = []
        
        m = len(mat)
        n = len(mat[0])
        direction = 1 # 1 means moving up-right, -1 means down-left
        i = 0
        j = 0

        for _ in range(m * n):
            res.append(mat[i][j])

            if direction == 1:
                # moving up-right
                if j == n - 1:
                    i += 1
                    direction = -1
                elif i == 0:
                    j += 1
                    direction = -1
                else:
                    i -= 1
                    j += 1
            else:
                # moving down-left
                if i == m - 1:
                    j +=1
                    direction = 1
                elif j == 0:
                    i += 1
                    direction = 1
                else:
                    i += 1
                    j -= 1
        return res

        
        
        # Naive Approach
        # if not mat or not mat [0]:
        #     return []
        
        # m = len(mat)
        # n = len(mat[0])
        # diagonals = defaultdict(list)

        # for i in range(m):
        #     for j in range(n):
        #         diagonals[i + j].append(mat[i][j])

        # res = []
        # for i in range(m + n - 1):
        #     if i % 2 == 0:
        #         res.extend(reversed(diagonals[i]))
        #     else:
        #         res.extend(diagonals[i])

        # return res
    
if __name__ == "__main__":
    sol = Solution()

    # Example 1
    mat1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    print(sol.findDiagonalOrder(mat1))  # Output: [1, 2, 4, 7, 5, 3, 6, 8, 9]

    # Example 2
    mat2 = [[1, 2], [3, 4]]
    print(sol.findDiagonalOrder(mat2))  # Output: [1, 2, 3, 4]