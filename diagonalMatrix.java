// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


public class diagonalMatrix {

    nt rI=0 ; int cI=0; int dir=1;
            int i=0;
        
        while(i<row*colomn){
            result[i]=mat[rI][cI];
            
            if(dir==1){
                if(cI==colomn-1){
                    rI++;
                    dir=-1;
                }else{
                    if(rI==0){
                        cI++; dir=-1;
                        
                    }else{
                        rI--;
                        cI++;
                        
                    }
                }
                
            }else{
                
                if(rI==row-1){
                    cI++;
                    dir=1;
                }else{
                    if(cI==0){
                        rI++; dir=1;
                    }else{
                        rI++;
                        cI--;
                        
                    }
                }
                
            }
            
            
            
            i++;
        }
        
        return result;
        
    }
    
}
