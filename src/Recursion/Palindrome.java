package Recursion;

public class Palindrome {
    public static void main(String []args){
        String s = "aabaa";

        System.out.println(Check(s, 0, s.length()-1));
    }

    static boolean Check(String s, int i, int j){
        if(i >= j) return true;

        if(s.charAt(i) != s.charAt(j)) return false;

        return Check(s, i+1, j-1);
    }
}
