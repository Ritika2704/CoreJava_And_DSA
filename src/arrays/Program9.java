package arrays;

public class Program9 {
    public static int trapWater(int height[]){
        int n= height.length;
        //calculate left most boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i=1; i<n; i++){
            //here current height(height[i] is comparing with till left most
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculating rightmost boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--){
            //here current height(height[i] is comparing with till left most
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater =0;
        //loop
        for(int i=0; i<n; i++){
            int waterLevel =Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trapWater(height));
    }
}
