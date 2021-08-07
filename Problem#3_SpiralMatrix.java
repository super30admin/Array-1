class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // List<Integer> spiral = new ArrayList<Integer>(r*c);
        List<Integer> spiral = new ArrayList<Integer>();
        
        if (matrix.length==0){
            return spiral;
        }
        int r = matrix.length-1;
        int c = matrix[0].length-1;
        
        
        int rowBegin=0, colBegin=0;
        int rowEnd=r, colEnd=c;
        
//        System.out.println(spiral);
        
        while (rowBegin<=rowEnd && colBegin<=colEnd){
            for (int i=colBegin; i<=colEnd; i++){
                spiral.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for (int j=rowBegin; j<=rowEnd; j++){
                spiral.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            if(rowBegin<=rowEnd){
                for(int i=colEnd; i>=colBegin; i--){
                    spiral.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            if(colBegin<=colEnd){
                for(int j=rowEnd; j>=rowBegin; j--){
                    spiral.add(matrix[j][colBegin]);
                }
                colBegin++;
            }
        }
        
        return spiral;
    }
}