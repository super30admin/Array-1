class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        pair minmax = new pair(0,0);
        if(a.length == 0 || a == null) return minmax;
        minmax.first=a[0];
        minmax.second=a[0];
        for(int i=1;i<n;i++){
            if(a[i]<minmax.first) minmax.first = a[i];
            if(a[i]>minmax.second) minmax.second = a[i];
        }
        return minmax;
    }
}
