class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        hash_map=defaultdict(list)

        result = []

        for i in range(len(mat)):
            for j in range(len(mat[0])):

                hash_map[i+j].append(mat[i][j])



        limit = (len(mat)+len(mat[0]))
        for i in range(limit):
            curr_res = hash_map[i]

            if (i%2==0):
                curr_res= curr_res[::-1]

            for i in curr_res:
                    result.append(i)

        return result


