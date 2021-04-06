# Time Complexity is O(m*n)
# Space Complexity is O(1)
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        def value(i,j):
            if(i>=0 and j>=0 and i<len(matrix) and j<len(matrix[0])):
                return matrix[i][j]
            return 'v'
        
        output = []
        i,j = 0,0
        while(True):
            if(len(output) == len(matrix)*len(matrix[0])):
                break
            while(value(i,j) != 'v'):
                output.append(value(i,j))
                matrix[i][j] = 'v'
                j+=1
            i+=1
            j-=1
            while(value(i,j) != 'v'):
                output.append(value(i,j))
                matrix[i][j]='v'
                i+=1
            i-=1
            j-=1
            while(value(i,j) != 'v'):
                output.append(value(i,j))
                matrix[i][j]='v'
                j-=1
            j+=1
            i-=1
            while(value(i,j)!='v'):
                output.append(value(i,j))
                matrix[i][j]='v'
                i-=1
            i+=1
            j+=1
        return output