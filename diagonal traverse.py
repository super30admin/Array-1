# // Time Complexity : O(nm)
# // Space Complexity : o(nm)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english:
# Since the sum of indicies are all same in the matrix, using hashmap 
# we store the sum and the elements and reverse the odd diagonals which is 
# the even sum of indicies and append it to the result array


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
       
        d = {}
        
        # iterate through each cell
        for i in range(len(mat)):
            for j in range(len(mat[i])):
                
                # check for the sum of indices and add to hashmap
                if i+j not in d:
                    d[i+j] = [mat[i][j]]
                    
                # append the upcoming sum of indicies(diagonals)
                else:
                    d[i+j].append(mat[i][j])
                    
        result = []
        
        # reverse the even sum (odd diagonals)
        for kv in d.items():
            
            if kv[0] % 2 == 0:
                [result.append(x) for x in kv[1][::-1]]
                
            else:
                [result.append(x) for x in kv[1]]
                
        return result
    
    