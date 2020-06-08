  ---------------------- Spiral Matrix ------------------------------------------------   
# Time Complexity : O(NXM) N is the length of the Array M is the columns of the array.
# Space Complexity : O(NxM)  dict
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# To print the spiral elements, first I will check in which direction it is moving, based on the direction I will pop the elements of the array, 
#or I will pop the last or first elements of the matrix. Once the first direction is completed , I will increment the turn variable.
# As we have 4 directions, I will take the remainder of the turn with 4. 


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        visited = []
        turn = 0
        
        while len(matrix)!=0 and len(matrix[0])!=0:
            if turn%4 ==0:
                visited+= matrix.pop(0)
            
            if turn%4 == 1:
                for i in range(len(matrix)):
                    visited.append(matrix[i].pop())
            
            if turn%4 == 2:
                visited+=matrix.pop()[::-1]
            
            if turn%4 == 3:
                for j in range(len(matrix)-1, -1, -1):
                    visited.append(matrix[j].pop(0))
            
            turn +=1
        return visited