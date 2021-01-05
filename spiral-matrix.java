// Time Complexity : O(n) n: number of elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : No

// Your code here along with comments explaining your approach
// tranverse in one direction untill you reach end or an element already visited then clockwise.


public List<Integer> spiralOrder(int[][] matrix) {
    int i = 0;
    int j = 0;
    boolean left = true;
    boolean right = false;
    boolean up = false;
    boolean down = false;
    int m = matrix.length;
    int n = 0;
    if(m>0) n = matrix[0].length;
    int[][] done = new int[m][n];
    List<Integer> output = new ArrayList<Integer>();
    int k = 0;
    while(k < m*n){
        output.add(matrix[i][j]);
        //System.out.println("while: "+ k+"  "+matrix[i][j]);
        done[i][j] = -1;
        k++;
        if(left){
            //System.out.println("l"+i+","+j+" -> "+output.toString());
            if(j<n-1 && done[i][j+1] != -1) j++;
            else if(i<m-1 && done[i+1][j] != -1){left = false; down = true; i++;}
            else return output;
        }
        else if(down){
            //System.out.println("d"+i+","+j+" -> "+output.toString());
            if(i<m-1 && done[i+1][j] != -1) i++;
            else if(j>0 && done[i][j-1] != -1){down = false; right = true; j--;}
            else return output;
        }
        else if(right){
            //System.out.println("r"+i+","+j+" -> "+output.toString());
            if(j>0 && done[i][j-1] != -1) j--;
            else if(i>0 && done[i-1][j] != -1){right = false; up = true; i--;}
            else return output;
        }
        else if(up){
            //System.out.println("u"+i+","+j+" -> "+output.toString());
            if(i>0 && done[i-1][j] != -1) i--;
            else if(j<n-1 && done[i][j+1] != -1){up = false; left = true; j++;}
            else return output;
        }
    }
    return output;
}