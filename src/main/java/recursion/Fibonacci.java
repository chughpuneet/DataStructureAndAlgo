package main.java.recursion;

public class Fibonacci {
    public int fibonacciRec(int n){
        if(n == 1) return 1;
        if(n == 0) return 0;

        return fibonacciRec(n-2) + fibonacciRec(n-1);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacciRec(6));
    }
}
