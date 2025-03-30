import java.util.*;

public class AssignmentAds {

    // 1: Find Minimum
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    // 2: Find Average
    public static double findAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) sum += num;
        return sum / arr.length;
    }

    // 3: Check Prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 4: Factorial (Recursion)
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // 5: Fibonacci (Recursion)
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 6: Power Function
    public static long power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // 7: Permutations of String
    public static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            permute(ros, ans + ch);
        }
    }

    // 8: Check if String is Numeric
    public static boolean isNumeric(String s) {
        return s.matches("\\d+");
    }

    // 9: Binomial Coefficient
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    // 10: GCD (Recursion using Euclidean Algorithm)
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Min: " + findMin(new int[]{10, 1, 32, 3, 45}));
        System.out.println("Average: " + findAverage(new int[]{3, 2, 4, 1}));
        System.out.println("Is 7 Prime? " + isPrime(7));
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Fibonacci(5): " + fibonacci(5));
        System.out.println("2^10: " + power(2, 10));
        System.out.println("Is '123456' numeric? " + isNumeric("123456"));
        System.out.println("Binomial Coefficient (7,3): " + binomialCoefficient(7, 3));
        System.out.println("GCD of 32 and 48: " + gcd(32, 48));

        System.out.println("Permutations of IOX:");
        permute("IOX", "");

        scanner.close();
    }
}

