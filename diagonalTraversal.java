
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0)
            return new int[0];
        
        Map<Integer, List<Integer>> map = new HashMap();
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                
                int indexSum = i + j;
                
                if(!map.containsKey(indexSum)) {
                    map.put(indexSum, new ArrayList());
                }
                map.get(indexSum).add(matrix[i][j]);
                
            }
        }
        
        int[] result = new int[matrix.length * matrix[0].length];
        
        int k = 0;
        
        for(Map.Entry<Integer,List<Integer>> entry: map.entrySet()) {
            List<Integer> tempList = entry.getValue();
            if(entry.getKey() % 2 == 0){
                Collections.reverse(tempList);
            }
            for(int j : tempList)
                result[k++] = j;
        }
        return result;
    }
}
