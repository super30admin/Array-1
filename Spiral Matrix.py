class Solution:
    op_list = list()
    # leetcode URL : https://leetcode.com/problems/spiral-matrix/
    # Problem : 54. Spiral Matrix
    # Time Complexity : O(mn)
    # Space Complexity : O (mn)
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        op_list = list()
        re = len(matrix[0])-1
        ce = len(matrix)-1
        rs = 0
        cs = 0
        while len(op_list)<(len(matrix[0]))*(len(matrix)):
            # right
            for i in range(rs,re+1):
                op_list.append(matrix[rs][i])
            print(op_list)
            cs = cs +1
            
            #down
            for j in range(cs,ce+1):
                op_list.append(matrix[j][re])
            re = re -1
            print(op_list)
            
            #left
            i = re
            while i >= rs:
                op_list.append(matrix[ce][i])
                i = i-1
            print(op_list)
            ce = ce-1
                
            #up
            j = ce
            while j>=cs:
                op_list.append(matrix[j][rs])
                j = j-1
            rs = rs+1
            print(op_list)
        return op_list[0:(len(matrix[0]))*(len(matrix))]
            