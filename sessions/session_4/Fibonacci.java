import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        long[] fibonacciList = new long[n + 1];
        long start = System.currentTimeMillis();  // start time
        long f = fib(n, fibonacciList);
        long end = System.currentTimeMillis();  // end time
        System.out.printf("fib(%d): %d\n", n, f);
        System.out.printf("time: %f seconds", (end - start) / 1000.0);
    }

    public static long fib(int n, long[] fibonacciList) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (fibonacciList[n] == 0)
            fibonacciList[n] = fib(n - 1, fibonacciList) + fib(n - 2, fibonacciList);
        return fibonacciList[n];
    }
}
