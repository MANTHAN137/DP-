class Solution {
    public long count(int coins[], int N, int sum) {
        long dp[][]=new long[sum+1][N];
        return bac(dp,coins,N-1,sum);
    }
    private long bac(long[][]dp,int[]coins,int N,int sum)
    {
        if(sum<0|| N<0)
        return 0;
        if(sum==0)
        return (long)1;
        if(dp[sum][N]!=0)
        return dp[sum][N];
        
        return dp[sum][N]=(bac(dp,coins,N,sum-coins[N])+bac(dp,coins,N-1,sum));
        
    }
}
