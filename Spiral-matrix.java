// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

import java.util.*;
class Main{
  public static void main(String []args){
    int [][]matrix={{1,2,3,4},
                    {5,6,7,8},  
                    {9,10,11,12}};
    System.out.println(findSpiral(matrix));
  }
  public static List<Integer> findSpiral(int [][]matrix){
    if(matrix==null || matrix.length==0){
      return new ArrayList<>();
    }
    List<Integer> al=new ArrayList<>();
    int m=matrix.length; int n=matrix[0].length;
    int top=0; int bottom=m-1;
    int left=0; int right=n-1;
    while(top<=bottom && left<=right){
      //top row
      for(int i=left;i<=right;i++){
        al.add(matrix[top][i]);
      }
      top++;

      //right column
      for(int i=top;i<=bottom;i++){
        al.add(matrix[i][right]);
      }
      right--;

      //bottom row
      if(top<=bottom && left<=right){
        for(int i=right;i>=left;i--){
          al.add(matrix[bottom][i]);
        }
      }
      bottom--;
      

      //left column
      if(top<=bottom && left<=right){
        for(int i=bottom;i>=top;i--){
          al.add(matrix[i][left]);
        }
      }
      left++;
    }
    return al;
  }
}