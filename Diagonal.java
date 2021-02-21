class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
            if (matrix == null || matrix.length == 0) return new int[0];
            	int m = matrix.length;
	        int n = matrix[0].length;
	        HashMap<Integer,  List<Integer>> hp = new HashMap<>();
	        List<Integer> result = new ArrayList<>();
	    
	        
	        for(int i=0; i<m; i++){
	            for(int j=0; j<n; j++){
	                if(hp.containsKey(i+j)){
	                	List<Integer> list = hp.get(i+j);
	                	list.add(matrix[i][j]);
	                    hp.put(i+j,list);
	                }else{
	                	List<Integer> secondList = new ArrayList<>();
	                	secondList.add(matrix[i][j]);
	                    hp.put(i+j, secondList);
	                }
	            }
	        }
	        
	        for(Map.Entry<Integer, List<Integer>> map:hp.entrySet()) {
	        	if(map.getKey()%2 == 0) {
                    Collections.reverse(map.getValue());
	        		result.addAll(map.getValue());
	        	}else {
	        		result.addAll(map.getValue());
	        	}
	        }
	        
	        int[] array = new int[result.size()];
	        for(int i = 0; i < result.size(); i++) array[i] = result.get(i);
	        return array;

    }
}