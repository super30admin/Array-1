//Time: O(m*n)

//Space = O(m+n) space for hashmap + O(min(m,n)) Space for list ==> O(m+n)

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null|| matrix.length == 0) return new int[0];
        
        //as row+col is same for the all the elements in diagonal
        //create hashmap of the sum, list of elements        
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        //O(m*n)
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!map.containsKey(i+j))
                    map.put(i+j, new ArrayList<>());
                map.get(i+j).add(matrix[i][j]);
            }
        }
        
        int k = 0;
        //if key is even reverse the list & add each element to result array
        int[] result = new int[n*m];
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            List<Integer> list = new ArrayList<>();
            list = entry.getValue();
            
            if(entry.getKey() % 2 == 0)                
                Collections.reverse(list);
            
            for(int i = 0; i < list.size(); i++)
                result[k++] = list.get(i);
        }
        
        return result;
    }
}