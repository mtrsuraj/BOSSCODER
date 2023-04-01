public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = { -2, -3, -5, 4, -1, -2, 1, 5, -3 };
        System.out.println("max sum of subarray: " + maxFindSumSubArray(arr));
    }

    public static int maxFindSumSubArray(int[] arr) {
        int maxSum = 0;
        // int[] subarray = new int[arr.length];
        int setMinValue = 0, frstIndex = 0, s = 0, lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            setMinValue = setMinValue + arr[i];
            if (maxSum < setMinValue) {
                maxSum = setMinValue;
                frstIndex = s;
                lastIndex = i;
                // subarray[i] = maxSum;
            }
            if (setMinValue < 0) {
                setMinValue = 0;
                s = i + 1;

            }
        }
        // for (int i : subarray) {

        // System.out.println(i);
        // }
        for (int i = frstIndex; i < lastIndex + 1; i++) {
            if (i == lastIndex)
                System.out.print(arr[i] + ".");
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println("1st index: " + frstIndex + " \n" + "last index: " + lastIndex);
        return maxSum;
    }
}