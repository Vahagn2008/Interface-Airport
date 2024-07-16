package room;

public class Fibonachi {

    public int fib(int n) { // Number of Fibonacci numbers to print
        if (n <= 0 || n == 1)
            return 1;

        int first = 0, second = 1, next = 0;

        for (int i = 2; i <= n; ++i) {
            next = first + second;
            first = second;
            second = next;
        }

        return next;
    }

    public static void main(String[] args) {

        Fibonachi fibonachi = new Fibonachi();
        System.out.println(fibonachi.fib(3));
    }
}
// 1 1 2 3 5 8 13 21 34 55