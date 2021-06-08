class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        :time complexity: O(n)
        :space complexity: O(n)
        """
        # Key idea : all diagonals have equal indices sum
        # put elements of each diagonal in dictionary as value for corresponding value
        d=dict()
        
        row = len(mat)
        col = len(mat[0])
        
        # nested loop through matrix
        for i in range(row):
            for j in range(col):
                # if in the dictionary
                if (i+j)  in d:
                    d[i+j].append(mat[i][j])
                # if not in dictionary
                else:
                    d[i+j]=[mat[i][j]]
        
        result = []
        for pair in d.items():
            # if sum of indices is even, reverse the correspoidng list value from dictionary
            if pair[0] % 2 == 0:
                pair[1].reverse()
            result = result + pair[1]
        return result
            
            
        