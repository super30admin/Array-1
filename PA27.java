Leetcode: 54. Spiral Matrix
//Time Complexity : O(n) //n is the toatal no of elements in matrix
//Space Complexity: O(1) // as we are returning that list in result 

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l=0;
        if(matrix==null || matrix.length ==0){
            return new ArrayList<>();
        }      
        int r= matrix[0].length -1;
        int t=0;
        int b=matrix.length-1;
        int i=0;
            List<Integer> res= new ArrayList<>();
            while(l<=r && t<=b){
                //res.add(matrix[l])
                
                for(int k=l; k<=r;k++){
                    res.add(matrix[t][k]);
                }
                //r--;
                t++;
                for(int k=t; k<=b;k++){
                    res.add(matrix[k][r]);
                }
                r--;
                if(t<=b){
                    for(int k=r; k>=l;k--){
                        res.add(matrix[b][k]);
                    }
                    b--;
                }
                
                if(r>= l){
                    for(int k=b; k>=t;k--){
                        res.add(matrix[k][l]);
                    }
                    l++;
                }
                
                
                
                
                
            }
        return res;
    }
}