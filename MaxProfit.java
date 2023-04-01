public class MaxProfit {
    public static void main(String[] args) {
        int[] a = { 100, 180, 260, 310, 40, 535, 695 };

        System.out.println("Max Profit: " + makeMaxProfitFactory(a));
    }

    private static int makeMaxProfitFactory(int[] a) {
        int maxProfit = 0;
        for (int i = 1; i < a.length; i++)
            if (a[i] > a[i - 1])
                maxProfit += a[i] - a[i - 1];

        return maxProfit;
    }
}
