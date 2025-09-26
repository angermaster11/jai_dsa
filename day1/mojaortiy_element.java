class Solution {
    int majorityElement(int arr[]) {
        // code here
        int vote = 1;
        int elect = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==elect){
                vote++;
            }else{
                vote--;
                if(vote==0){
                    vote=1;
                    elect = arr[i];
                }
            }
        }
        
        int c = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==elect){
                c++;
            }
        }
        
        return c>(arr.length/2) ? elect : -1;
    }
}
