package Strings;

public class AnagramSearch {
    public static void main(String[] args){
        String txt = "geeksforgeeks";
        String pattern  = "egek";

        System.out.println(isAnagramInTxt(txt, pattern));
    }

    public static boolean isAnagramInTxt(String txt, String pattern){
        int[] countTxt = new int[256];
        int[] countPtrn = new int[256];

        for(int i = 0; i < pattern.length(); i++){
            countTxt[txt.charAt(i)]++;
            countPtrn[pattern.charAt(i)]++;
        }

        for(int i = pattern.length(); i < txt.length(); i++){

            if(isSame(countTxt, countPtrn)) return true;

            countTxt[txt.charAt(i)]++;
            countTxt[txt.charAt(i - pattern.length())]--;
        }

        return isSame(countTxt, countPtrn);
    }

    public static boolean isSame (int[] textCount, int[] pttrnCount){
        for(int i = 0; i < textCount.length; i++){
            if(textCount[i] != pttrnCount[i]){
                return false;
            }
        }

        return true;
    }
}
