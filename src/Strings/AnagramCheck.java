package Strings;

public class AnagramCheck {
    public static void main(String[] args){
        String s1 = "geeks";
        String s2 = "ekegs";

        System.out.println(isAnagram(s1,s2));
    }

    public static boolean isAnagram(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        int[] count = new int[256];

        for(int i = 0; i < s1.length(); i++){
            count[s1.charAt(i)]++;
        }

        for(int i = 0; i < s2.length(); i++){
            count[s2.charAt(i)]--;
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] != 0){
                return false;
            }
        }

        return true;
    }
}
