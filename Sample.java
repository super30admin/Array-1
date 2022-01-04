// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach



class Solution {
    public int[] productExceptSelf(int[] array) {
        int[] products = new int[array.length];
		
		int leftRunningProduct=1;
		for(int i=0;i<array.length;i++){
			products[i]=leftRunningProduct;
			leftRunningProduct*=array[i];
		}

		int rightRunningProduct=1;
		for(int i=array.length -1;i>=0;i--){
			products[i]*= rightRunningProduct;
			rightRunningProduct *= array[i];
		}
		return products;
    }
}



//Time complexity: O(M*N)
//Space complexity: O(1)

public int[] findDiagonalOrder(int[][] mat) {
   
     int m=mat.length,n=mat[0].length;
     int arr[]= new int[m*n];
      boolean up=true;  
      int rows=0,cols=0,i=0;
        
   while(rows<m && cols < n){
     if(up){
      while(rows>0 && cols< n-1 ){
         arr[i++]=mat[rows][cols]; 
          rows--;
          cols++;
      }
          arr[i++]=mat[rows][cols];
          if(cols==n-1){
              rows++;
          }else{
             cols++; 
          }
         
     }else{
             while(rows<m-1 && cols>0 ){
         arr[i++]=mat[rows][cols]; 
          rows++;
          cols--;
      }
          arr[i++]=mat[rows][cols];
          if(rows==m-1){
              cols++;
          }else{
             rows++; 
          } 
         
         
     }  
      up=!up;
   }
        
       return arr;

   }    







//Time complexity: O(M*N)
//Space complexity: O(1)




class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<>();
        
        if(matrix.length == 0)
            return res;
        
        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int leftCol = 0;
        int rightCol = matrix[0].length - 1;
        
        while(topRow <= bottomRow && leftCol <= rightCol){
            
            for(int i=leftCol; i<=rightCol; i++){
                res.add(matrix[topRow][i]);   
            }
            topRow++;
            
            for(int i=topRow; i<=bottomRow; i++){
                res.add(matrix[i][rightCol]);
            }
            rightCol--;
            
            
            if(topRow <= bottomRow){
                for(int i=rightCol; i>=leftCol; i--){
                    res.add(matrix[bottomRow][i]);
                }
            }
            bottomRow--;
            
            if(leftCol <= rightCol){
                for(int i=bottomRow; i>=topRow; i--){
                    res.add(matrix[i][leftCol]);
                }
            }
            leftCol++;
            
            
        }
        
        return res;
    }
}




































Spiral Matrix:


//Time complexity: O(M*N)
//Space complexit: O(1)



public List spiralOrder(int[][] matrix) {
        List res = new ArrayList();
        
        int beginRow = 0;
        int endRow = matrix.length-1;
        int beginCol = 0;
        int endCol = matrix[0].length-1;
        
        while(beginRow<=endRow && beginCol <= endCol){
            
            for(int i =beginCol; i<=endCol;i++){
                res.add(matrix[beginRow][i]);
            }
            beginRow++;
            
            
            for(int i =beginRow;i<=endRow;i++){
                res.add(matrix[i][endCol]);
            }
            endCol--;
            
            
            if(beginRow<=endRow){
             for (int i = endCol ; i>=beginCol ; i--){
                 res.add(matrix[endRow][i]);
                 
             }  }
                endRow--;
            if(beginCol<=endCol){
             for (int i = endRow ; i>=beginRow ; i--){
                 res.add(matrix[i][beginCol]);   
             }   
                beginCol++;
            }
        }
    return res;
    }
    
} 
