class Fibonacci_Number_509 {
    public int fib(int n){
        if(n <= 1) return n;

        int a = 0;
        int b = 1;

        while(n-- > 1) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
