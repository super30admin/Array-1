//Time: O(m*n)

//Space = O(1)


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return answer;
        
        //initialise pointers
        int R1 = 0; //top row pointer
        int R2 = matrix.length - 1; //bottom row pointer
        int C1 = 0; //left col pointer
        int C2 = matrix[0].length - 1; //right row pointer
        
        //traverse until pointers cross
        while(R1 <= R2 && C1 <= C2){
            //traverse top row, left to right
            for(int col = C1; col <= C2;col++)
                answer.add(matrix[R1][col]);
            R1++;
            
            //traverse last column for row range
            for(int row = R1; row <= R2; row++)
                answer.add(matrix[row][C2]);
            C2--;
            
            //now, may be R1 > R2 and C1 > C2
            if(R1 <= R2 && C1 <= C2){
                //traverse bottom row for all column 
                for(int col = C2; col >= C1; col--)
                    answer.add(matrix[R2][col]);
                R2--;
                
                //traverse 1st column for row range
                for(int row = R2; row >= R1; row--)
                    answer.add(matrix[row][C1]);
                C1++;                
            }
        }
        return answer;        
    }
}