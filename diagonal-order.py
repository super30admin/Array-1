# TC: O(m*n)
# SC: O(size of hashmap)


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        d={}
        
        for i in range(len(mat)):
            for j in range(len(mat[0])):
                
                if i+j not in d:
                    d[i+j]=[mat[i][j]]
                else:
                    d[i+j].append(mat[i][j])
                    
        ans=[]
        
        for entry in d.items():
            if entry[0]%2==0:
                [ans.append(x) for x in entry[1][::-1]]
            else:
                [ans.append(x) for x in entry[1]]
        return ans
            
            