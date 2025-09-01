package Strings;

public class RotationCheck {
    public static void main (String [] args){
        String s1 = "ABCD";
        String s2 = "CDAB";

        System.out.println(isRotated(s1, s2));
    }

    public static boolean isRotated(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        String Combined = s1+s1;

        return Combined.contains(s2);
    }

}

