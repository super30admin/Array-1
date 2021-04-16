class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        i,j = 0,0
        m,n = len(mat), len(mat[0])
        result = []
        direction = 1
        
        while i<m and j<n:
            result.append(mat[i][j])
            
            ### Going Upwards
            if direction == 1:
                
                # Go down if we reach last column
                if j==n-1:
                    i+=1
                    direction = -1

                # Go right if we reach first row
                elif i==0:
                    j+=1
                    direction = -1
                
                # Move diagonally upwards
                else:
                    i-=1
                    j+=1
            
            ### Going Downwards
            else:
                
                # Go right if we reach last row
                if i==m-1:
                    j+=1
                    direction=1

                # Go down if we reach first column
                elif j==0:
                    i+=1
                    direction=1
                
                # Move diagonally downwards
                else:
                    i+=1
                    j-=1
                    
        return result

### Time Complexity:

# Time Complexity: O(MxN) --> Traversing the entire 2D matrix
# Space Complexity: O(1) --> Other than returning array, we just use pointers
