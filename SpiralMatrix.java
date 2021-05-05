// Time Complexity :O(m*n), m=no. of rows, n=no. of columns
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
/*
 Three line explanation of solution in plain english
we will use four pointers to store left, right, top and bottom boundary. while top and bottom boundary doesn't cross each other
 and left and right boundary pointer doesn't cross each other, We will first iterate through the top most row
then increement the top pointer boundary, iterate through the right most column then decreement the right pointer boundary,
iterate through the bottom most row and decreement the bottom pointer, finally iterate through the left most column and
increement left ponter.
*/
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        // list to store result
        List<Integer> res = new ArrayList<>();
        //initializing top, left,right and bottom markers
        int t=0, b=matrix.length-1;
        int l=0, r=matrix[0].length-1;

        //while top and bottom pointer doesn't cross each other and left and right pointer doesn't cross each other
        while(t<=b && l<=r){

            if(t<=b && l<=r){
                //loop through top most row
                for(int j=l; j<=r; j++){
                    //add to result
                    res.add(matrix[t][j]);
                }
                //increement top pointer
                t++;
            }
            //loop through right most row
            if(t<=b && l<=r){
                for(int j=t; j<=b; j++){
                    //add to result
                    res.add(matrix[j][r]);
                }
                //move right pointer one unit left
                r--;
            }

            //loop through bottom most row
            if(t<=b && l<=r){
                for(int j=r; j>=l; j--){
                    //add to result
                    res.add(matrix[b][j]);
                }
                //decreement bottom pointer
                b--;
            }

            //loop through left most row
            if(t<=b && l<=r){
                for(int j=b; j>=t; j--){
                    //add to result
                    res.add(matrix[j][l]);
                }
                //move left pointer to one unit right
                l++;
            }

        }
        //return result
        return res;
    }
}