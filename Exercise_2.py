    
    # 498. Diagonal Traverse
    #  Time Complexity : O(n*m)
    #  Space Complexity : O(n*m)    

class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        dirr = 'up'
        i=0
        j=0
        idx=0
        arr = []
        while(idx<(len(matrix)*len(matrix[0]))):
                arr.append(matrix[i][j])
                idx = idx+1
                
                if dirr == 'up':
                    if j == len(matrix[0])-1:
                        i = i+1
                        dirr = 'down'
                    elif i == 0:
                        j= j+1
                        dirr = 'down'
                    else:
                        i = i-1
                        j = j+1
                else:
                    if i == len(matrix)-1:
                        j= j+1
                        dirr = 'up'
                    elif j == 0:
                        i = i+1
                        dirr = 'up'
                    else:
                        i = i+1
                        j = j-1
        return arr
                        
                    
                    
                    
                    
                    