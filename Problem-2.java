// Time Complexity : O(M*N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        
        boolean up=true;
        int i=0,j=0;
        
        while(i<mat.length && j<mat[0].length){
            list.add(mat[i][j]);
            if(up){
                if(j==mat[0].length-1){
                    i++;
                    up=false;
                }
                else if(i==0){
                    up=false;
                    j++;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(i==mat.length-1){
                    j++;
                    up=true;
                }
                else if(j==0){
                    up=true;
                    i++;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        
        int[] result= new int[list.size()];
        for(int k=0;k<result.length;k++)
            result[k]=list.get(k);
        return result;
        
        
        
    }
}