//Twitch interview question
//Time complexity = O(m*n)
//Space complexity = O(1)
//Greedy approach:only in one direction it wont work
//optimize approach: so going in 2 direction upwords and downwords.The initail it starts from upwords=1 consider direction and it goes to downwards after completing upward.the downward = -1 direction based on rows and colums checking here.
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[] {};
        
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int r = 0,c=0;
        int index = 0;
        int dir = 1; // upward direction checking for rows and colums
            while(index<m*n){
                result[index] = mat[r][c];
                index++;
                if(dir == 1){
                    if(c == n-1){//upward direction
                        dir = -1;
                        r++;
                    } else if(r==0){
                        dir = -1;
                        c++;
                    } else{
                        r--;
                        c++;
                    }
                }
                else{
                    if(r == m-1){// downward direction checking for rows and colums
                        dir = 1;
                        c++;
                    } else if(c==0){
                        dir = 1; r++;
                    } else {
                        r++;
                        c--;
                    }
                }
            }
        return result;       
        
    }
}