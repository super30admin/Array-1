//Time complexity O(N) and space complexity O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] L = new int[nums.length];
        int[] R = new int[nums.length];

        L[0] =1;
        R[nums.length-1] = 1;

        for(int i=1;i<nums.length;i++){
            L[i] = L[i-1] * nums[i-1];
            // System.out.println("L"+L[i]);
        }

        for(int i=nums.length-2;i>=0;i--){
            R[i] = R[i+1] * nums[i+1];
            // System.out.println("R"+R[i]);
        }

        for(int i=0;i<nums.length;i++){
            nums[i]= L[i] *R[i];
        }


        return nums;
        
    }
}

//Diagonal traverse Time Complexity O(NM) and space complexity O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int idx = 0;
        int i = 0;
        int j = 0;

        int[] res = new int[m * n];
        boolean up = true;
        while (i < m && j < n) {

            if (up) {

                while (i > 0 && j < n - 1) {
                    res[idx] = mat[i][j];
                    idx++;
                    i--;
                    j++;
                }

                res[idx++] = mat[i][j];
                if (j == n - 1) {
                    i++;
                } else {
                    j++;
                }
                up = false;

            } else {

                while (j > 0 && i < m - 1) {
                    res[idx] = mat[i][j];
                    idx++;
                    i++;
                    j--;
                }
                res[idx++] = mat[i][j];
                if (i == m - 1) {
                    j++;
                } else {
                    i++;
                }
                up = true;
            }

        }


        return res;

    }
}


//Spiral matrix 
//time complexity O(N) and space complexity O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0;
        int right = m - 1;
        int bottom = n - 1;
        int top = 0;

        List<Integer> res = new ArrayList<>();

        while (res.size() < m * n && top<=bottom ) {

            // move from left to right

            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            // move from right to bottom

            for (int j = top; j <= bottom; j++) {
                System.out.println("j" + matrix[j][right]);
                res.add(matrix[j][right]);
            }
            right--;
            // move from right to left

            if(left<=right && top<=bottom){

                for (int k = right; k >= left; k--) {
                    res.add(matrix[bottom][k]);
                }
                bottom--;
            

            

            // move from bottom to top

            
                for (int l = bottom; l >= top; l--) {
                    res.add(matrix[l][left]);
                }
                left++;


            }
                
            

            
        }

        return res;
    }
}
