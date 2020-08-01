# // Time Complexity : o(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :
# when transitioning from a direction to another, whether to append the intersecting node during the current direction or in the new direction was confusing.
# In the end, append the intersecting node within the current direction worked.
#
# // Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        if not matrix:
            return result

        # initialization
        if len(matrix[0]) == 1:
            dir = "down"
        else:
            dir = "right"
        i, j = 0, 0
        m = len(matrix)
        n = len(matrix[0])
        boundary_right = n - 1
        boundary_down = m - 1
        boundary_left = 0
        boundary_up = 0

        while len(result) < m * n:

            # processing
            while len(result) < m * n:
                result.append(matrix[i][j])
                if dir == "right":
                    if j == boundary_right:
                        break
                    else:
                        j += 1
                elif dir == "down":
                    if i == boundary_down:
                        break
                    else:
                        i += 1
                elif dir == "left":
                    if j == boundary_left:
                        break
                    else:
                        j -= 1
                elif dir == "up":
                    if i == boundary_up:
                        break
                    else:
                        i -= 1

            # transition
            if dir == "right":
                dir = "down"
                i += 1
                boundary_up += 1

            elif dir == "down":
                dir = "left"
                j -= 1
                boundary_right -= 1

            elif dir == "left":
                dir = "up"
                i -= 1
                boundary_down -= 1

            elif dir == "up":
                dir = "right"
                j += 1
                boundary_left += 1

        return result