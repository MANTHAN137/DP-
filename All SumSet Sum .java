class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
    
            ArrayList<Integer>list=new ArrayList<>();
            
            
            BackTracking(list,arr,0,0);
            return list;
    
    
    }

    public void BackTracking(ArrayList<Integer>list,ArrayList<Integer>arr,int index,int sum)
    {
        if(index==arr.size())
        {
            list.add(sum);
            
            return ;
        }
        BackTracking(list,arr,index+1,sum+arr.get(index));
        BackTracking(list,arr,index+1,sum);
    }
}
