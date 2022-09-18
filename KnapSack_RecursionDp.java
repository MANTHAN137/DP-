class Solution 
{ 
   static int[][]t=new int[1003][1003];
   Solution()
   {
       for(int i=0;i<1002;i++)
       {
           for(int j=0;j<1002;j++)
           {
               t[i][j]=-1;
           }
       }
   }
    
   
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        
        if(W==0|| n==0)       
        return 0;
        else if(t[W][n-1]!=-1)
        return t[W][n-1];
        else if(wt[n-1]<=W)
        return t[W][n-1]= Math.max(val[n-1]+knapSack(W-wt[n-1],wt,val,n-1),knapSack(W,wt,val,n-1));
        
        else 
        return t[W][n-1]=knapSack(W,wt,val,n-1);
    } 
}


