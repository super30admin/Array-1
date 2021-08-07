def product(a, n):
      
    prod = 1
    flag = 0
      
    for i in range(n):
       
        if (a[i] == 0):
            flag += 1
        else:
            prod *= a[i]
      
    
    arr = [0 for i in range(n)]
      
    for i in range(n):
        
        if (flag > 1):
            arr[i] = 0
          
        
        elif (flag == 0):
            arr[i] = (prod // a[i])
        
        elif (flag == 1 and a[i] != 0):
            arr[i] = 0
          
        # If(flag == 1 && a[i] == 0)
        else:
            arr[i] = prod
              
    return arr
  

n = 5
array = [ 10, 3, 5, 6, 2 ]
ans = product(array, n)
  
print(*ans)


%TC : O(n)
%SC : O(n)
   