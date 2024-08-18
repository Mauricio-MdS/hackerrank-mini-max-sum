import java.util.List;

class Result {

    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : arr) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        System.out.printf("%d %d", sum - max, sum -min);
    }

}