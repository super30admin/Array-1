// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int r = 0;
        int c = 0;
        int iteration = 0;
        List<Integer> result = new ArrayList<>();
        /*  1 - right
            2 - down
            3 - left
            4 - up
        */
        int direction = 1;
        int pivot_r = 0;
        int pivot_c = 0;

        //while(row>0&&col>0){
            
            
            int total_iet = row*col;
            //if(total_iet==0) total_iet = 1;

            for(int i = 0;i<total_iet;i++){
                result.add(matrix[r][c]);
                if(r==1&&c==1){
                    System.out.println(row);
                    System.out.println(col);
                    System.out.println(pivot_r);
                    System.out.println(pivot_c);

                }
                if(direction==1){
                    c++;
                    if(c>col-pivot_c-1){
                        c--;
                        r++;
                        direction++;
                    }
                }
                else if(direction==2){
                    r++;
                    if(r>row-pivot_r-1){
                        r--;
                        c--;
                        direction++;
                    }
                }
                else if(direction==3){
                    c--;
                    if(c<0+pivot_c){
                        c++;
                        r--;
                        direction++;
                    }
                }
                else if(direction==4){
                    r--;
                    if(r==pivot_r){
                        direction = 1;
                        c++;
                        r++;
                        pivot_r++;
                        pivot_c++;
                    }
                }

                
            }

        
        return result;
    }
}
