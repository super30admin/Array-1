# Time Complexity: O(n)
# Time Complexity: O(n^2)
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        m = len(mat)
        n = len(mat[0])
        output = [[] for i in range(m+n-1)]
        
        for i in range(m):
            for j in range(n):
                output[i+j].append(mat[i][j])
        print(output)

        flag = 1
        for i in range(len(output)):
            if i%2 == 0:
                output[i].reverse()
        
        result = []
        [ result.extend(el) for el in output] 
        return(result)
            
        
        # for i in range(m-2, -1, 0):
        #     r = 0
        #     c = i
        #     while r <= i and c >= 0:
        #         if flag:
        #             output.append(mat[j][i])
        #         else:
        #             output.append(mat[i][j])
        #     flag = not flag
        
        print(output)