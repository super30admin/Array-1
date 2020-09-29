"""
Name: Srinidhi Bhat
Time Complexity: O(n^2) - Going through it once
Space Complexity: O(N x M) - Avergae length of list x number of lists(hashmap)

Did it run on LC: Yes

Logic: In sprial form, we see that in the same diagnol, the sum of positions is same
Hence we can make the dictionary as the key and append the numbers belonging to same diagnol as valu as list
if diagnol pos is odd, reverse it, else same
"""
from collections import defaultdict
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        my_list = defaultdict(list)
        
        if not matrix or len(matrix[0])==0:
            return []
        
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if i+j not in my_list:
                    my_list[i+j] = [matrix[i][j]]
                
                else:
                    my_list[i+j].append(matrix[i][j])
        ans = []
        count = 0
        for it in my_list.items():
            if count%2==0:
                [ans.append(x) for x in it[1][::-1]]
            else:
                [ans.append(x) for x in it[1]]
            count+=1
        return ans