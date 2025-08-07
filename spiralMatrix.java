import java.util.ArrayList;
import java.util.List;


// Idea is to use boolean array to mark the elements as visited and avoid them adding them again.
// Traversal follows right->bottom -> left-> top order for rows/2 times . This covers entire matrix.
// Time Complexity: O(rows*columns)
// Space Complexity: O(rows*columns)
public class spiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {
       int rows = matrix.length;
       int columns = matrix[0].length;
       boolean [][] visited = new boolean[rows][columns];
       List<Integer> li = new ArrayList<Integer>();
 
       int count =0;
        int m = rows;
        int n = columns;
    while(count<=rows/2){
        for(int i=count,j=i;j<n;j++){
            if(visited[i][j]==false){
             li.add(matrix[i][j]);
             visited[i][j] = true;  
            }
        }
        for(int j=n-count-1,i=0;i<m&&j>=0;i++){
             if(visited[i][j]==false){
             li.add(matrix[i][j]);
             visited[i][j] = true;  
            }
        }
         for(int i=m-count-1,j=n-1;j>=0&&i>=0;j--){
            if(visited[i][j]==false){
             li.add(matrix[i][j]);
             visited[i][j] = true;  
            }
        }
        for(int j=count,i=m-1;i>=0&&j<n;i--){
            if(visited[i][j]==false){
             li.add(matrix[i][j]);
             visited[i][j] = true;  
            }
        }
        count=count+1;
        
    }
        return li;
    }
}
