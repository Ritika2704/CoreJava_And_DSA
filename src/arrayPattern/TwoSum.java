package arrayPattern;

public class TwoSum {
    public int[] arraySol(int arr[], int target) {
        int n = arr.length;
        int j;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            j = n - 1; // Reset j for each i
            while (j > i) {
                sum = 0;
                sum = arr[i] + arr[j];
                if (sum == target) {
                    return new int[]{i, j};
                } else{
                    j--; // Decrease j instead of increase
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;

        TwoSum ts = new TwoSum();
        int[] result = ts.arraySol(arr, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
