package Recursion;

public class SumOfDigits {
    public static void main(String[] args){
        int n = 123;

        System.out.println(Sum(n));
    }

    static Integer Sum(int n){
        if(n < 10){
            return n;
        }

        return Sum(n/10) + n % 10;
    }
}
