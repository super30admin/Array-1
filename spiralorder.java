/*Time Complexity:O(m*n)
Space Complexity:O(1)
*/
class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int m= mat.length, n= mat[0].length;
        List<Integer> l= new ArrayList<>();
        int top=0, bot=m-1, lef=0, rig=n-1;
        
        while(true){
            //top -> left to right
            for(int i=lef;i<=rig;i++) l.add(mat[top][i]);
            top+=1;
            if(top>bot) break;
            
            //right -> top to bottm
            for(int i=top;i<=bot;i++) l.add(mat[i][rig]);
            rig-=1;
            if(lef>rig) break;
            
            
            //bottm -> right to left
            for(int i=rig;i>=lef;i--) l.add(mat[bot][i]);
            bot-=1;
            if(top>bot) break;
            
            
            //left -> bottom to top
            for(int i=bot;i>=top;i--) l.add(mat[i][lef]);
            lef+=1;
            if(lef>rig) break;
            
        }
        return l;
    }
}