//Time COmplexity: O(m*n)
//Space complexity: O(1). 
//Compiled on leetcode

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        int top = 0, left =0, bottom = matrix.length-1, right = matrix[0].length-1;
        while(left<=right && top<=bottom)
        {
            //right
            for(int i =left; i<=right;i++)          //we take four pointers for each side of the matrix. 
                list.add(matrix[top][i]);                
            top++;                                   //Travers till we meet the each side left, right, top or bottom, once we reach the pointer, change the side pointer value based on where we reached.
            for(int i=top;i<=bottom;i++)
                list.add(matrix[i][right]);         // if reached right increment top. if reached bottom decrement right.
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)        //if reached left, decrement bottm, if top increment left. if left crosses right or top crosses bottom stop the loop. return the list.
                    list.add(matrix[bottom][i]);               
            }
             bottom--;
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                    list.add(matrix[i][left]);   
            }
            left++;
            
        }
        
        return list;
    }
}