public class kadane {
    public static void main(String[] args) {

        int arr[] = { 1, -3, 2 }; // given array

        int currSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) { // traverse the whole array
            currSum = currSum + arr[i];
            if (currSum < 0) { // if sum is less than 0 then consider it 0
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum); // this will give the max-sum

        }
        System.out.println(maxSum);

    }
}