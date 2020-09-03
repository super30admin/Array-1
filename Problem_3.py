# 498. Diagonal Traverse

# Code:

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        mapping={}
		
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                # Add element into the map, if it's already present append.
                if i + j not in mapping:
                    mapping[i+j] = [matrix[i][j]]
                else:
                    mapping[i+j].append(matrix[i][j])

        ans= []
        
		#look at the diagonal and each diagonal's elements
        for k,v in mapping.items():
            if k % 2 == 0:
				#Add in reverse order for even numbered index
                [ans.append(x) for x in v[::-1]]
            else:
                [ans.append(x) for x in v]
        return ans
            
# Time Complexity: O(n*m) + O(n*m) = O(n*m)
# Space Complexity: O(n*m)
# Accepted on Leetcode: YES
# Any problems faced: No.    