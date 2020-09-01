"""
Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
Example:
Input:
[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]

Output: [1,2,4,7,5,3,6,8,9]

"""

from collections import deque
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:

        #corner case: empty matrix
        if not matrix: return []

        #matrix dimensions
        R, C = len(matrix), len(matrix[0])

        #R + C - 1 diagonal traverses will be stored in double ended queues
        res = [deque() for _ in range(R + C - 1)]

        for r in range(R):
            for c in range(C):
                dist = r + c                        #distance from origin
                if dist & 1:                        #r + c is odd, do not reverse numbers
                    res[dist].append(matrix[r][c])
                else:                               #r + c is even, reverse numbers
                    res[dist].appendleft(matrix[r][c])

        #concatenate diagonal traverses
        return sum(res,deque())


"""
Same approach using dictionary

dia = collections.defaultdict(list)
        result = list()
        for r in range(len(matrix)):
            for c in range(len(matrix[r])):
                dia[r+c].append(matrix[r][c])

        for key,dia in dia.items():
            if key%2 == 0:
                dia.reverse()
            result.extend(dia)

        return result

"""

Time complexity : O(n^2)
Space complexity: O(n)                
