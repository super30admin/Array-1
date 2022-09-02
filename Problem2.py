class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        ans= []
        dict1 = defaultdict(list)
        
        for i in range (len(mat)):
            for j in range(len(mat[0])):
                dict1[i+j+1].append(mat[i][j])
        for k in sorted(dict1.keys()):
            if k%2==1:
                dict1[k].reverse()
            ans += dict1[k]
            
        return ans
