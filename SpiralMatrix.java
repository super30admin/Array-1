import java.util.ArrayList;
import java.util.List;

//Time complexity- O(m*n)
//Space Complexity- O(1)
//Successfully ran on leetcode


class Solution {
 public List<Integer> spiralOrder(int[][] matrix) {
     
     int m= matrix.length;
     int n= matrix[0].length;
     List<Integer> result= new ArrayList<>();
     int t= 0;
     int b= m-1;
     int l=0;
     int r= n-1;
     
     while(l<=r && t<= b){
         
         for(int i=l; i<=r; i++){
             
             result.add(matrix[t][i]);
         }
         t++;
         
         //for right column
         if(l<=r){
             for(int i= t; i<= b; i++){
                 result.add(matrix[i][r]);
             }
                 r--;
         }
        
         //for b row
         
         if(t<=b){
             for(int i=r; i>=l; i--){

                 result.add(matrix[b][i]);
             }
                 b--;
         }
         
         //for l col
         if(l<=r){
             for(int i=b; i>=t;i--){
                 result.add(matrix[i][l]);
             }
             l++;
             }
     }
     
     return result;
 }
}