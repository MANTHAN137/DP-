
class Solution{

     static Boolean isSubsetSum(int N, int arr[], int sum){
       Boolean[][] memo = new Boolean[N+1][sum+1];
       return isSubsetSum(N,arr,sum,memo);
    }
    
    static Boolean isSubsetSum(int N, int arr[], int sum,Boolean[][] memo){
        if(sum==0) return true;
        if(N==0 || sum < 0) return false;
        if(memo[N][sum] != null) return memo[N][sum];
        if(sum >= arr[N-1]) 
            return memo[N][sum]= isSubsetSum(N-1,arr,sum-arr[N-1],memo) || isSubsetSum(N-1,arr,sum,memo) ;
        
        return memo[N][sum] = isSubsetSum(N-1,arr,sum,memo);
    }
}
