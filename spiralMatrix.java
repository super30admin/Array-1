//time complexity: O(n)
//space complexity : O(1) if result list isnt considered, else O(n)
//executed on leetcode: yes

class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        if(matrix==null || matrix.length==0) return list;
        char dir= 'r'; //specifies direction of traveral u=up,r=right,d=down,l=left
        int m=matrix.length;
        int n=matrix[0].length;
        int count = 0; //number of elements traversed
        int row=0;
        int col=0;
        boolean[][] visited = new boolean[m][n]; //used to mark whether element has been visited or not
        while(count<m*n)
        {
            list.add(matrix[row][col]);
            visited[row][col] = true; //after traversing we mark element as visited. this prevents traversing it for the second time
            count++;
            if(dir=='r')
            {
                if(col==n-1 || visited[row][col+1]==true)
                {
                    dir='d';
                    row++;
                }
                else
                {
                    col++;
                }
            }
            else if(dir=='d')
            {
                if(row==m-1 || visited[row+1][col]==true)
                {
                    dir='l';
                    col--;
                }
                else
                {
                    row++;
                }
            }
            else if(dir=='l')
            {
                if(col==0 || visited[row][col-1]==true)
                {
                    dir='u';
                    row--;
                }
                else
                {
                    col--;
                }
            }
            else
            {
                if(row==0 || visited[row-1][col]==true)
                {
                    dir='r';
                    col++;
                }
                else
                {
                    row--;
                }
            }
            
        }
        return list;
        
        
    }
}