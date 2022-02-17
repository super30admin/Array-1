lass Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        ans = []
        while matrix:
            try:
                ans.extend(matrix.pop(0))  # pop first line and add them in ans
                for i in range(len(matrix)):
                    ans.append(matrix[i].pop()) # pop the last one in each sub-list and add them in ans
                ans.extend(matrix.pop()[::-1]) # pop last line and add them in ans
                for i in range(len(matrix)-1,-1,-1):
                    ans.append(matrix[i].pop(0)) # pop the first one in each sub-list and add them in ans
            except: 
                break # when nothing in matrix
        return ans