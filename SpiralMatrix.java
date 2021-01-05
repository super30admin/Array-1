class Solution {
    List<Integer> res = new ArrayList<>();
    int total = 0;
    public List<Integer> spiralOrder(int[][] matrix) {
        helper(matrix, 0, matrix.length-1, 0, matrix[0].length-1);
        return res;
    }
    
    public void helper(int[][] matrix, int ru, int rl, int cl, int cr){
        
        if(ru>matrix.length-1 || rl<0 || cl>matrix[0].length-1 || cr<0)
            return;
        
        int ind = cl;
        while(ind<=cr && total!=matrix.length*matrix[0].length){
            res.add(matrix[ru][ind]);
            ind++;
            total++;
        }
        ind = ru+1;
        while(ind<=rl && total!=matrix.length*matrix[0].length){
            res.add(matrix[ind][cr]);
            ind++;
            total++;
        }
        ind = cr-1;
        while(ind>=cl && total!=matrix.length*matrix[0].length){
            res.add(matrix[rl][ind]);
            ind--;
            total++;
        }
        ind = rl-1;
        while(ind>=ru+1 && total!=matrix.length*matrix[0].length){
            res.add(matrix[ind][cl]);
            ind--;
            total++;
        }
        helper(matrix, ru+1, rl-1, cl+1, cr-1);
    }
}
