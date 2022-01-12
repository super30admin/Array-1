# Diagonal Traverse
#Time Complexity : O(N)
#Space Complexity : O(N)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        m = len(mat)
        n = len(mat[0])
        res = list()
        sum_dict = defaultdict(list)
        
		# Segregate elements as per the sum if indexes (i,j)
        for i in range(m):
            for j in range(n):
                sum_dict[i+j].append(mat[i][j])
        
		# Take care of the right order of the elements as per traversal rules
        for i,v in sum_dict.items():
            if i%2 == 0:
                res.extend(v[::-1])
            else:
                res.extend(v)
        
        return res