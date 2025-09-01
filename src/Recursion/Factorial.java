package Recursion;

public class Factorial {
    public static void main(String[] args){
        int n = 6;

        System.out.println(Fact(n));
    }

    static Integer Fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        return n * Fact(n-1);
    }
}
