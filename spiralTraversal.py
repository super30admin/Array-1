#Time: O(mn)
#Space: O(1)
#did the code run successfully: yes
# issues faced: when any two pointers cross each other, the program did not end
# Approach:
# maintain pointers right, left, top, bottom to view the remaining matrix
# run till the output array fills competely which means all the elements are traversed once.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        left, right, top, bottom = 0, len(matrix[0])-1, 0, len(matrix)-1
        idx, size = 0, len(matrix)*len(matrix[0])
        out = [0 for _ in range(size)]
        
        while left<=right and top<=bottom and idx<size:
            #top
            for i in range(left, right+1):
                if idx < size:
                    out[idx] = matrix[top][i]
                    idx+=1
            top+=1
            #right
            for j in range(top, bottom+1):
                if idx < size:
                    out[idx] = matrix[j][right]
                    idx+=1
            right-=1
            #bottom
            for k in range(right, left-1, -1):
                if idx < size:
                    out[idx] = matrix[bottom][k]
                    idx+=1
            bottom-=1
            #left
            for l in range(bottom, top-1, -1):
                if idx < size:
                    out[idx] = matrix[l][left]
                    idx+=1
            left+=1
        return out