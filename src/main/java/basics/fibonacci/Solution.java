package basics.fibonacci;

public class Solution {
    // 0 1 1 2 3 5 8
    public static void main(String[] args) {
        System.out.println(fibonacciUsingRecursion(9));
        System.out.println(fibonacciUsingIteration(9));
    }

    //fn = fn-1 + fn-2
    private static int fibonacciUsingRecursion(int num)
    {
        if(num == 0 || num == 1)
            return num;
        return fibonacciUsingRecursion(num-1) + fibonacciUsingRecursion(num-2);
    }

    //fn = fn-1 + fn-2
    private static int fibonacciUsingIteration(int num) {
        int a = 0;
        int b = 1;
        int c;

        if (num == 0)
            return a;

        for (int i = 2; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
