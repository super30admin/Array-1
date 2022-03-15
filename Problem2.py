#  Time Complexity : O(m*n)
#  Space Complexity : O(m*n)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        d={}
		#loop through matrix
        for i in range(len(mat)):
            for j in range(len(mat[i])):
				#if no entry in dictionary for sum of indices aka the diagonal, create one
                if i + j not in d:
                    d[i+j] = [mat[i][j]]
                else:
				#If you've already passed over this diagonal, keep adding elements to it!
                    d[i+j].append(mat[i][j])
		# we're done with the pass, let's build our answer array
        ans= []
		#look at the diagonal and each diagonal's elements
        for entry in d.items():
			#each entry looks like (diagonal level (sum of indices), [elem1, elem2, elem3, ...])
			#snake time, look at the diagonal level
            if entry[0] % 2 == 0:
				#Here we append in reverse order because its an even numbered level/diagonal. 
                [ans.append(x) for x in entry[1][::-1]]
            else:
                [ans.append(x) for x in entry[1]]
        return ans