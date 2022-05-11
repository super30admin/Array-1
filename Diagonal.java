// Time Complexity :O(m*n)
// Space Complexity :O(1)
public class Diagonal {
        public int[] findDiagonalOrder(int[][] mat) {
            int row = mat.length;
            int col = mat[0].length;
            int[] res = new int[col * row];
            int i = 0;
            int x = 0, y = 0;
            while(x < col && y < row){
                res[i] = mat[y][x];
                int indexSum = x + y;
                if((indexSum % 2) == 0){
    
                    if(x < col - 1 && y > 0 ){
                        x++;
                        y--;
                    }
    
                    else if(x < col - 1){ 
                        x++;
                    }
    
                    else{ 
                        y++;
                    }
    
                }
                else{
                    if(y < row - 1 && x > 0){
                        x--;
                        y++;
                    }
                    else if(y < row - 1){
                        y++;
                    }
                    else{
                        x++;
                    }
    
                }
    
                i++;
            }
    
            return res;
            
        }
}
