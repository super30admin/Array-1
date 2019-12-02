Time Complexity-O(n)
Space Complexity-O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix.length == 0 || matrix[0].length == 0) return result;
        
        int c1 = 0;
        int c2 = matrix.length-1;
        int r1 = 0;
        int r2 = matrix[0].length-1;
        
        while(true){
            for(int i = r1; i <= r2; i++) result.add(matrix[c1][i]);
            c1++;
            if(r1 > r2 || c1 > c2) break;
            
            for(int i = c1; i <= c2; i++) result.add(matrix[i][r2]);
            r2--;
            if(r1 > r2 || c1 > c2) break;
            
            for(int i = r2; i >= r1; i--) result.add(matrix[c2][i]);
            c2--;
            if(r1 > r2 || c1 > c2) break;
            
            for(int i = c2; i >= c1; i--) result.add(matrix[i][r1]);
            r1++;
            if(r1 > r2 || c1 > c2) break;
        }
        
        return result;
    }
    
