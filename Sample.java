// Time Complexity :O(N)
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//Product of Array Except Self
class Solution {
    public int[] productExceptSelf(int[] nums) {
     if(nums.length == 0){
         return new int[0];
     }   
        //make an array like [1,1,2,3] aab isko multple karo and result mei add karo 
        int temp=1,rp=1;
        int[] result = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            rp=rp*temp;
            result[i]=rp;
            temp=nums[i];
        }
        //now new array hogaya upar ka multiple array sei [1,1,2,6] isko multiple karna hai [2,3,4,1] sei tab result aayega [24,12,8,6]  
        temp=rp=1;
        for(int i=nums.length-1;i>=0;i--){
            rp=rp*temp;
            result[i]=result[i]*rp;
            temp =nums[i];
        }
        return result;
    }
}

//[1,2,3,4]
//[24,12,8,6]
//Diagonal Traverse

cclass Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if( matrix == null || matrix.length == 0){
            return new int[0];
        }
        int m = matrix.length, n = matrix[0].length;
        int[] result = new int[m * n];
        int i=0, j=0, dir=1,index = 0;
        while(index < m * n){
            result[index] = matrix[i][j];
            if(dir == 1){
                if(j == n-1){
                    dir=-1;
                    i++;
                }else if(i==0){
                    dir =-1;
                    j++;
                }else{
                    i--;
                    j++;
                }    
            }
            else{
                if(i==m-1){
                    dir=1;
                    j++;
                }else if(j==0){
                    dir =1;
                    i++;
                }else{
                    i++;
                    j--;
                }   
            }
            index++;
        }
        return result;
    }
}
//Spiral Matrix
class Solution {
    public List < Integer > spiralOrder(int[][] matrix) {
        List ans = new ArrayList();
        if (matrix.length == 0)
            return ans;
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) ans.add(matrix[r1][c]);
            for (int r = r1 + 1; r <= r2; r++) ans.add(matrix[r][c2]);
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) ans.add(matrix[r2][c]);
                for (int r = r2; r > r1; r--) ans.add(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ans;
    }
}