# Time Complexity : O(MN)
# Space Complexity : O(MN)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english :
# Since it is a diagonal traversal, the sum of the diagonal indices must be same.
# Traverse through all the elements one by one in the matrix and map elements with same indices in a Hashmap.
# Then check if the key mod 2 == 0 that means we need to reverse the list in hashmap and store the ouput

# Your code here along with comments explaining your approach


class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        dict = {}
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if i + j not in dict:
                    dict[i + j] = [matrix[i][j]]
                else:
                    dict[i + j].append(matrix[i][j])

        for i in dict:
            if i % 2 == 0:
                res.extend(dict[i][::-1])
            else:
                res.extend(dict[i])

        return res