import copy
class Solution(object):
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top = 0
        bottom = len(matrix) - 1
        left = 0
        right = len(matrix[0]) - 1
        # top,bottom,left,right = 1,1,1,2
        
        self.final = []
        while left <= right and bottom >= top:
            
            for i in range(left,right+1):
                self.final.append(matrix[top][i])
            
            top += 1
            for i in range(top,bottom+1):
                self.final.append(matrix[i][right])
            
            right -= 1
            temp = []
            if left <= right and bottom >= top:
                for i in range(left,right+1):
                    temp.append(matrix[bottom][i])
                self.final += temp[::-1]
                
                bottom -= 1
                temp = []
                for i in range(top,bottom+1 ):
                    temp.append(matrix[i][left])
                self.final += temp[::-1]
                
                left += 1
        return self.final
            
    # def spiralOrder(self, matrix):
    #     """
    #     :type matrix: List[List[int]]
    #     :rtype: List[int]
    #     """
    #     final = []
    #     def spiral(matrix,final):
            
    #         for i in range(0,len(matrix[0])):
    #             final.append(matrix[0][i])
    #         if len(matrix) == 1:
    #             return
            
    #         for i in range(1,len(matrix)-1):
    #             print(i)
    #             final.append(matrix[i][-1])
    #         matrix[-1].reverse()
    #         for val in matrix[-1]:
    #             final.append(val)
                
    #         if len(matrix) == 2:
    #             return
    #         if len(matrix[0]) != 1:
    #             for i in range(1,len(matrix)-1):
    #                 final.append(matrix[len(matrix)-1-i][0])
            
    #         new_matrix = []
    #         for i in range(1,len(matrix)-1):
    #             temp = []
    #             for j in range(1,len(matrix[0])-1):
    #                 # print((matrix))
    #                 temp.append(matrix[i][j])
    #             new_matrix.append(temp)
    #         # print(new_matrix)
    #         if len(new_matrix[0]) != 0:
    #             spiral(new_matrix,final)
    #         else:
    #             return
                    
                
            
        # spiral(matrix,final)
        # return final
        # 