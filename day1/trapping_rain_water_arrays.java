class Solution {
    public int trap(int[] arr) {
        int[] prev = new int[arr.length];
        int[] next = new int[arr.length];

        int max1 = arr[0];
        int max2 = arr[arr.length-1];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max2){
                max2 = arr[i];
            }else{
                next[i] = max2;
            }
            if(arr[j]>max1){
                max1 = arr[j];
            }else{
                prev[j] = max1;
            }
            j++;
        }
        int w = 0;
        for(int i=0;i<arr.length;i++){
            int h = Math.min(prev[i],next[i]);
            if(h!=0){
                w += h - arr[i];
            }
        }
        return w;
    }
}
