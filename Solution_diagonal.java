import java.util.*;
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length ==0)
            return new int[0];
        HashMap<Integer,ArrayList> map = new HashMap<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(!map.containsKey(i+j)){
                    map.put(i+j,new ArrayList<Integer>());
                    map.get(i+j).add(matrix[i][j]);
                }
                else{
                    map.get(i+j).add(matrix[i][j]);
                }
            }
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        ArrayList<Integer> result = new ArrayList<Integer>();
         ArrayList<Integer> mylist = new ArrayList<Integer>();
        for(Integer i: map.keySet()){
            mylist = map.get(i);
            if(i%2 ==0){
                Collections.reverse(mylist);
              result.addAll(map.get(i));
              
            }
            else{
           result.addAll(map.get(i));
            }
        }
       

      // System.out.print(result);
      int[] ret = new int[result.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = result.get(i).intValue();
        }
        return ret;
        
    }
}

//Time Complexity: O(n * m) + O(n) ~~ O(n * m)
//O(n*m) for iterating through the matrix and O(n) for storing the arraylist result into the integer arraylist

