# Time Complexity - o(m*n)
# Space Complexity - o(1)


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        sp_count = 0
        result = []

        while len(result)<m*n:

            i = sp_count
            for j in range(sp_count,n-sp_count):
                result.append(matrix[i][j])
            if len(result) >= m * n: break

            j = n-1-sp_count
            for i in range(1+sp_count,m-sp_count):
                result.append(matrix[i][j])
            if len(result) >= m * n: break
            
            i = m - sp_count-1
            for j in range(n-2-sp_count,-1+sp_count,-1):
                result.append(matrix[i][j])
            if len(result) >= m * n: break

            j = sp_count
            for i in range(m-2-sp_count,sp_count,-1):
                result.append(matrix[i][j])
            if len(result) >= m * n: break
            sp_count+=1

        return result