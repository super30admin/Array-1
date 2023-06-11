class Solution {
    //Time Complexity:- O(m*n) Because you need to traverse through all the element so O(m*n)
    //Space Complexity:- O(1) Becuase you using result array as the final result array,So it will not get considered.(auxiliary memory)
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; int n=mat[0].length;
        int[] result = new int[m*n];
        int i=0;int j=0;
        int idx=0;
        boolean direction=true; // At 0th index it will be up
        while(idx<result.length){
            result[idx]=mat[i][j]; //you assigning the value to the result
            idx++; //Traversing through each and every element by incrementing index
            if(direction){ //if the direction is true then you need to traverse in upside direction 
                //upside arrow
                if(i==0 && j!=n-1){ // if it is not the first element of the array and the last column element
                    j++;direction = false;
                }else if(j==n-1){ //if it is last column element
                    i++; direction = false;
                }
                else{
                    i--;j++;//row decrease column increase
                }
            }else{//if the direction is false then you need traverse in downwards direction
                //downside arrow
                if(j==0 && i!=m-1){
                    i++;direction = true;
                }else if(i==m-1){
                    j++; direction = true;
                }
                else{
                    i++;j--;
                }
            }
        }
        return result;
    }
}