class Solution {
    public int trap(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int w = 0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                int top = st.pop();
                if(st.isEmpty()) break;

                int left = st.peek();
                int width = i - left - 1;
                int h = Math.min(arr[i],arr[left]) - arr[top];
                w += h*width;
            }
            st.push(i);
        }
        return w;
    }
}
