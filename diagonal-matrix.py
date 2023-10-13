# Time Complexity : O(MN)
# Space Complexity : O(M+N)
# Did this code successfully run on Leetcode : YES


# Three line explanation of solution in plain english
# This solution traverses the input matrix in a diagonal order, appending the elements to a deque and then transferring them to the result list based on the current diagonal's direction. 
# It adjusts the row and column indices accordingly to cover all elements in the matrix


# Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        r, c, rMax, cMax = 0, 0, len(mat), len(mat[0])
        deque, res = collections.deque(), []

        while r < rMax and c < cMax:
            if (r+c) % 2 == 0:
                i, j = r, c
                while 1:
                    if min(i, j) < 0 or i >= rMax or j >= cMax:
                        break
                    deque.append(mat[i][j])
                    i -= 1
                    j += 1
                while deque:
                    res.append(deque.popleft())
            else:
                i, j = r, c
                while 1:
                    if min(i, j) < 0 or i >= rMax or j >= cMax:
                        break
                    deque.append(mat[i][j])
                    i -= 1
                    j += 1
                while deque:
                    res.append(deque.pop())
                
            if r == rMax-1:
                c += 1
            elif r < rMax - 1:
                r += 1
        return res