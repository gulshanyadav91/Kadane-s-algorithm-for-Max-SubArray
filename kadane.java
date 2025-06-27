public class kadane {
    public static void main(String[] args) {

        int arr[] = { 1, -3, 2 };

        int currSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);

        }
        System.out.println(maxSum);

    }
}