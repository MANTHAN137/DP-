public class Solution {
    public static int demo(int n,int height[],int ar[])
    {
       if(n==0) 
           return 0;
        
        if(ar[n]!=0)
            return ar[n];
        int left=demo(n-1,height,ar)+Math.abs(height[n]-height[n-1]);
        int right=Integer.MAX_VALUE;
        if(n>1)
            right=demo(n-2,height,ar)+Math.abs(height[n]-height[n-2]);
        
        ar[n]=Math.min(left,right);
        return ar[n];
    }
    public static int frogJump(int n, int heights[]) {
        
        return demo(n-1,heights,new int[n]);
    }

}
