package Lab2;

public class tsk2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 , 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int max1 = Math.max(arr[1] + arr[16], arr[2] + arr[15]);
        int max2 = Math.max(arr[3] + arr[14],arr[4] + arr[13]);
        int max3 = Math.max(arr[5] + arr[12], arr[6] + arr[11]);
        int max4 = Math.max(arr[7] + arr[10], arr[8] + arr[9]);
        int maxN1 = Math.max(max1, max2);
        int maxN2 = Math.max(max3, max4);
        int maxN = Math.max(maxN1, maxN2);
        System.out.println("Max: " + maxN);
    }
}
