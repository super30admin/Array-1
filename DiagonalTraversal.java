// Time Complexity :  O(N) where N is length of final matrix to fill elements.
// Space Complexity : O(1) - No extra space is used
// Did this code successfully run on Leetcode : Yes

class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int[] res= new int[mat.length*mat[0].length];
        
        int k=0;
        int a=0;
        int i=0,j=0;
        while(a<res.length){
                
             res[a]=mat[i][j];  // fill matrix at i,j position
                if(k==0){ // top - pattern for every alternate columns starting from 0 follow an upward or top traversal
                    if(i==0 && j<mat[0].length-1){ // i is 0 and j is within bounds, increment col.
                        j++;
                        k=1;
                    }
            
            else if(j==mat[0].length-1){ // j is out of bounds increment row
                i++;
               k=1;
                }   
            else{   // move upwards
                 i=i-1;
                        j=j+1;
                
            }
        }
                else { // down - - pattern for every alternate columns starting from 1 follow an downward or down traversal
                    
                   if(i<mat.length-1 && j==0){ // j is 0 and i is out of bounds, increments row
                        i++;
                       k=0;
                    }
                    else if(i==mat.length-1){ // if i is out of bounds move to next column
                        j++;
                        k=0;
                    }
                        
                    else{  // move downwards
                        
                        i=i+1;
                       j=j-1;
                    }
                }
            
            a++; // increment index position of final array
                
            }
          
          return res; // return final array
        }
        
}