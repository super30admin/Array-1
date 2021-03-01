class DiagonalTraverse {
    
    // Time Complexity: O(nm)
    // Space Complexity: O(nm)
    
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[]{};
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows*cols];
        
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(!map.containsKey(i+j))
                    map.put((i+j), new ArrayList());
                
                map.get((i+j)).add(matrix[i][j]);
            }
        }

        int index = 0;
        for(int key : map.keySet()){
            if(key % 2 == 0){
                int size = map.get(key).size() - 1;
                while(size >= 0)
                    result[index++] = map.get(key).get(size--);
            }else{
                int size = map.get(key).size();
                for(int i = 0; i < size; i++){
                    result[index++] = map.get(key).get(i);
                }
            }
        }
        return result;
    }
}