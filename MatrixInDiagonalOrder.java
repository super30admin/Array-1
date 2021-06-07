/*TC - O(N*M) - where m - numbe rof rows, n - number of columns
 * SC  - O ( M+N-1)  + O(M*N)  = first one for the hashmap of size -number of diagonals , second one for the 1d array 
 * Ran on leetcode  - yes
 * */
// this approach seems to be very inefficient as both TC and SC is on the order of N*N



// idea is the elements lying on the same diagonal will always have their location summation same (i1+j1) == (i2+j2), we use the same property to construct 
// the hash map with key (i+j) and arraylist of the elements that lie along the diagonal
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        Map<Integer, List<Integer>>hm = new HashMap<Integer, List<Integer>>();
        
        for (int i = 0 ; i <mat.length ; i++){
            for(int j = 0 ; j <mat[0].length; j++){
                if (!hm.containsKey(i+j)){
                    hm.put(i+j, new ArrayList());
                }
               
                hm.get(i+j).add(mat[i][j]);
            }
            
           } 
        
        int k = 0 ; 
	// Here I check whether the diagonal needs to traversed in reverse direction, as the directions alternate with diagonals
        int[] ans = new int[mat.length*mat[0].length];
        for (Map.Entry<Integer, List<Integer>> entry:hm.entrySet()){
            if (entry.getKey() %2 !=0){
                for(int i = 0 ; i < entry.getValue().size(); i++){
                    ans[k++] = entry.getValue().get(i);
                }
            } else {
		    // reverse order 
                for(int i = entry.getValue().size()-1 ; i >=0; i--){
                    ans[k++] = entry.getValue().get(i);
                }
            }
        }
        
        return ans;
    }
}
