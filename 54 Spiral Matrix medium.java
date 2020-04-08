class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0) 
            return new ArrayList<Integer>();
        int cols = matrix[0].length;
        int rows = matrix.length;
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < matrix.length; ++i){
            
            //process(i,i)
            //first row
            if(result.size() == matrix[0].length * matrix.length)
                return result;
            
            for(int count = i; count < cols; ++count){           
                //System.out.println("1");
                result.add(matrix[i][count]);
            }
            
            for(int count = i+1; count < rows; ++count){
              //System.out.println("2");
                result.add(matrix[count][cols-1]);
            }
            
            for(int count = cols-2; count >= i; --count){
             //System.out.println("3");
                if(i != rows-1)
                result.add(matrix[rows-1][count]);
            }
            
            
            for(int count = rows-2; count > i; --count){
              //System.out.println( "4");
                    if(i != cols-1)
                result.add(matrix[count][i]);
            }
            
            rows -= 1;
            cols -= 1;
            
        }
        return result;
    }
    
}