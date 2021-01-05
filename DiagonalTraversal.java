//Problem 27 : Diagonal Traverse
// Time Complexity : O(n*m), where n & m are rows and columns
// Space Complexity : (O(n*m))
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach 
/*
  Steps:
  1) Initialize a map with Integer as key and List<Integer> as values
  2) Store sum of row(i) and column(j) indices as key and then store their corresponding values in list of elements.
  3) Iterate over the map and insert values in the output array. Before inserting values, check if key is even or odd.
  4) If key is even then just reverse the elemnets of the list before inserting those elements into the output array.  
*/


import java.util.*;

class Solution27 {
    public int[] findDiagonalOrder(int[][] matrix) {
         
        if(matrix==null || matrix.length==0){
              return new int[0];    
        }
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                List<Integer> list = map.get(i+j);
                
                if(list==null){
                    list = new ArrayList<>();
                }
                
                /*if((i+j)%2==0)
                   list.add(0,matrix[i][j]);
                else*/
                    list.add(matrix[i][j]);
                
                map.put(i+j,list);
            }
        }
        
        //System.out.println(map);
        
       int[] res = new int[matrix.length*matrix[0].length]; 
       int i=0;
       for(int key : map.keySet()){
           
           List<Integer> list = map.get(key);
           
           if(key%2==0)
                Collections.reverse(list); 
               
           for(int elem: list){
               res[i++] = elem;
           }
           
       }
        
        return res;
    }
}