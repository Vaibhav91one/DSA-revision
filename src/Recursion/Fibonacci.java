package Recursion;

public class Fibonacci {
    public static void main(String[] args){
        int n = 10;

        System.out.println(Fibo(n));
    }

    static Integer Fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return Fibo(n - 1) + Fibo( n - 2);

    }
}
