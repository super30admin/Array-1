//Using direction to travel

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0)
            return new int[] {};
        
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int r = 0, c = 0;
        int index = 0;         // to keep track of elements in result
        int dir = 1;       //1 = upward & -1 = downward
        
        while(index < m*n){
            result[index] = mat[r][c];
            index++;
            
            if(dir == 1){
                if(c == n-1){
                    dir = -1;
                    r++;
                }
                else if(r == 0){
                    dir = -1;
                    c++;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r == m -1){
                    dir = 1;
                    c++;
                }
                else if(c == 0){
                    dir = 1;
                    r++;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}

//Time Complexity :O(m*n)
//Space Complexity :O(1)