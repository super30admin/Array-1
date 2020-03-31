// Time Complexity: O(mn)
//Space Complexity: O(m)
// Few leetcode test cases are failing eg. [[3],[2]]
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int n = matrix.length;


        if(n == 0) {
            return new int[0];
        }

        int m = matrix[0].length;
        int[] res = new int[m*n];
        int index = 0, index2 = (m*n) -1;

        for(int j=0; j<m; j++) {
            List<Integer> list = new ArrayList<>();
            int col = j;
            list.add(matrix[0][col]);
            for(int i=1; i<n; i++) {
                col -= 1;
                if(col < 0) {
                    break;
                }
                list.add(matrix[i][col]);
            }

            List<Integer> list2 = new ArrayList<>();


            int col2 = m-j-1;
            list2.add(matrix[n-1][col2]);

            for(int i=(n-2); i>=0; i--) {
                col2 +=1;
                if(col2>=m) {
                    break;
                }
                list2.add(matrix[i][col2]);
            }


            if(j%2 == 0){
                Collections.reverse(list);
                Collections.reverse(list2);
            }

            for(int num : list) {
                res[index++] = num;
            }

            for(int num : list2) {
                res[index2--] = num;
            }

        }


        return res;
    }
}