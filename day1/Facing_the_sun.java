// User function Template for Java

class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        Stack<Integer> st = new Stack<>();
        int c = 0;
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() && height[i]>height[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                c++;
            }
            st.push(i);
        }
        return c;
    }
}
