"""
Intuition:  A rectangle has 4 side. 

Each side can be iterated using a loop by defining its boundaries.
#####################################################################
Time Complexity : O(M* N)  where M*N = total elements
Space Complexity : O(1) 
#####################################################################
"""

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        result = []
          
        L = 0 
        R = len(matrix[0]) - 1
        
        T = 0
        B = len(matrix) - 1
        
        while L<=R and T<=B:
            
            for col in range(L, R+1):
                result.append(matrix[T][col])
                print(result)
            T += 1
            
            for row in range(T, B+1):
                result.append(matrix[row][R])
                print(result)
            R -= 1
            
            if L<=R and T<=B:
                for col in range(R, L-1, -1):
                    result.append(matrix[B][col])
                    print(result)
            B -= 1
            
            if L<=R and T<=B:
                for row in range(B, T-1, -1):
                    result.append(matrix[row][L])
                    print(result)
            L += 1
            
        
            
        return result