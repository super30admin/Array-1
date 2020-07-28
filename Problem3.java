// Leetcode 498. Diagonal Traverse
/** 3 Pointer Approach: 
 *  1. Define four directions of movement L R U D (left right up down).
 *  2. While loop runs M*N timee.
 *  3. Move from first element towards Right, once competed increase U by 1, similarly
 *     go from U to D once done decrease R by 1 and simlarly decrease D and increse L.
 *  4. increase and eacrese col and row value as per move.
 */ 
//
//time Complexity :
// O(M*N)

// Space Complexity :
// O(1) since we don't make use of any additional data structure and output array should not be consider as extra space.

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.

class Problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix == null ||  matrix.length == 0){
            return new ArrayList();
        }
        
        
        int rlen = matrix.length-1,clen = matrix[0].length-1;
        
        int L = 0, R = clen, U = 0, D = rlen, r=0, c=0, count =0;
       
        ArrayList<Integer> list = new ArrayList();
        
        int size  = (rlen+1)*(clen+1);
        
        while(count < size){
            
            //right
            while(c<=R && count < size){
                list.add(matrix[r][c]);  
                count++;
                c++;
            }
            c--;
            r++;
            U++;
            
            //down
            while(r<=D && count < size){
                list.add(matrix[r][c]);   
                count++;
                r++;
            }
            r--;
            c--;
            R--;
            
            //left
            while(c>=L){
                list.add(matrix[r][c]);
                count++;
                c--;
            }
            
            c++;
            r--; 
            D--;
            
            //up
            while(r>=U && count < size){
                list.add(matrix[r][c]);
                count++;
                r--;
            }
            
            L++;
            r++;
            c++;
        }
        
        return list;
    }
}