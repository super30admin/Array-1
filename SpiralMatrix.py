#TC: O(n)
#SC: O(1)
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        t=w1=0
        f=len(matrix)-1
        w2=len(matrix[0])-1
        
        li=[]
        
        while(t<f or w1<w2 ):
            
            if f==t :
                for i in range(w1,w2+1):
                    li.append(matrix[t][i])
                    print (t,f)
                return li
            
            if w1==w2  :
                for i in range(t,f+1):
                    li.append(matrix[i][w2])
                return li
                
            for i in range(w1,w2+1):
                li.append(matrix[t][i])
                print ("t",t)
            t+=1
            
            for i in range(t,f+1):
                li.append(matrix[i][w2])
                print ("w2",w2)
            w2-=1
            if t==f==1:
                for i in range(w2,w1-1,-1):
                    li.append(matrix[1][i])
                return li
            for i in range(w2,w1-1,-1):
                li.append(matrix[f][i])
            f-=1
            if w1==w2==0:
                for i in range(f,t-1,-1):
                    li.append(matrix[i][0])
                return li
            for i in range(f,t-1,-1):
                li.append(matrix[i][w1])
            w1+=1
        
        if t==f==w1==w2:
            li.append(matrix[t][w1])
       
        
        print ("w1",w1)
        return li
        