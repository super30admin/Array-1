public class Solution{

public int[] diagnol(int[][] nums){
           int[] finalResult= new int[nums.length * nums[0].length];
           int counter =0;
           boolean ascOrder=false;
           int maxRowIndex= nums.length-1;
           int maxColIndex= nums[0].length-1;
           for(int ct=0;ct<=maxColIndex+2;ct++){
               if(ascOrder){
                   for(int i=Math.max(0,ct-maxRowIndex);i<=Math.min(ct,maxRowIndex) && ct-i<=maxColIndex;i++){
                      finalResult[counter] = nums[i][ct-i]; 
                      counter++;
                   }
               }else{
                    for(int i=Math.min(ct,maxRowIndex);i>=Math.max(0,ct-maxRowIndex)&& ct-i<=maxColIndex;i--){
                      finalResult[counter] = nums[i][ct-i]; 
                      counter++;
                   }                  
               }
               
               ascOrder= !ascOrder;
               
           }
           
           return finalResult;
       }
       
  
}
