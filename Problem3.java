public class Solution{
       
       public int[] spiral(int[][] nums){
           int maxloopsIndex=0;

           if(nums.length%2==1) maxloopsIndex = nums.length/2;
           else maxloopsIndex = nums.length/2-1;
           
           int maxRowIndex=nums.length-1;
           int maxColIndex=nums[0].length-1;
           
           int[] finalResult =new int[(maxRowIndex+1)*(maxColIndex+1)];
           int counter=0;
           
           for(int i=0;i<=maxloopsIndex;i++){
               int j=i;
               int row = i;
               while(j<=maxColIndex-i){
                   finalResult[counter]=nums[row][j];
                   j++;
                   counter++;
               }
               j--;row++;
               while(row<=maxRowIndex-i){
                   finalResult[counter]=nums[row][j];
                   row++;
                   counter++;
               }
               row--;j--;
               while(j>=i){
                   finalResult[counter]=nums[row][j];
                   j--;
                   counter++;
               }
               j++;row--;
               while(row>i){
                   finalResult[counter]=nums[row][j];
                   row--;
                   counter++;
               }
           }
           
           return finalResult;
       }
}
