#Time complexity: O(m*n) where m and n are columns and rows respectively of the input matrix
#Space complexity O(1)

#Accepted on leetcode

#Approach: 
#Start from direction 'Up' (Keep traversing up/down until boundary encountered)
#When 'UP' boundary encountered -> move to the right square if possible else move to the downward square and change direction
#When 'DOWN' boundary encountered -> move to the downward square if possible else move right
#Finish when m*n number of elements found


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        dir = 'UP'
        rows = len(mat)
        cols = len(mat[0])
        i = 0
        j = 0
        count = 0
        soln = []

        while count < rows*cols:
            soln.append(mat[i][j])
            count+=1
            if dir == 'UP':
                if j == cols-1:
                    i+=1
                    dir = 'DOWN'
                elif i == 0:
                    j+=1
                    dir = 'DOWN'
                else:
                    i-=1
                    j+=1
            else:
                if i == rows - 1:
                    j+=1
                    dir = 'UP'
                elif j == 0:
                    i+=1
                    dir = 'UP'
                else:
                    i+=1
                    j-=1
        
        return soln
                

