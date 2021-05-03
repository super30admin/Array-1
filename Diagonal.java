class Diagonal {
    public int[] findDiagonalOrder(int[][] mat) {
    
        //ArrayList<Integer> store = new ArrayList<>();
        if(mat == null || mat.length == 0) return new int[0];
         
        int d = 1;
        int m = mat.length;
        int n = mat[0].length;
        int [] store = new int [m*n];
        int r = 0;
        int c = 0;
        int a = m*n ;
        int b = 0;
        
        while(b < a){
        
            store[b] = mat[r][c];
        //    store.add(mat[r][c]);
            if(d == 1){    
                if(c == n - 1 ){
                    r++;
                    d = -1;
                }    
                else if(r == 0 ){
                    c++;
                    d = -1; 
                }else{
                    r--;
                    c++;
                }
            }else{
                
                if(r == m - 1){
                    c++;
                    d = 1; 
                }else if(c == 0){
                    r++;
                    d = 1;
                }else{
                    r++;
                    c--;
                }   
        
            }
            
            b++;
        }   
        return store;
    }
}
