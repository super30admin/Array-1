# // Time Complexity : O(M * N)
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english

# All the diagonal elements have indices that sum up to the same number, [0,1] , [1,0] ; [2,0] ,[1,1], [0,2] are examples of such
# diagonals. SO, we simply get the indices together grouped in a hashmap. Looping through the groups in the hashmap, we can simply 
# print out the matrix elements that correspond to the elements in that group. Even numbered groups are printed in reverse.

# // Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        # Edge cases
        if(matrix is None or len(matrix) == 0 or len(matrix[0]) == 0):
            return []
        
        result = []
        M = len(matrix)
        N = len(matrix[0])

        # Hashmap that stores our groups together 
        # TODO : can be named better
        dic = collections.defaultdict(list)

        # Group elements belonging to the same diagonal together
        for i in range(M):
            for j in range(N):
                dic[i+j].append([i, j]) 
        
        print(dic)
        result = []

        # Go through the groups and print corresponding elements together
        for key, groups in dic.items():
            if key % 2 != 0:
                for group in groups:
                    row = group[0]
                    col = group[1]
                    result.append(matrix[row][col])
            else:
                for group in reversed(groups):
                    row = group[0]
                    col = group[1]
                    result.append(matrix[row][col])
            
        return result