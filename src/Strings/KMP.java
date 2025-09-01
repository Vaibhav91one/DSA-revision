package Strings;

public class KMP {
    public static void main(String [] args){
        String txt = "ababcababaad";
        String pat = "babc";

        KMP(pat, txt);
    }

    static void KMP(String pattern, String txt){
        int n = txt.length();
        int m = pattern.length();
        int lps[] = new int[m];
        fillLPS(pattern, lps);

        int i = 0; int j = 0;

        while ( i < n){
            if(pattern.charAt(j) == txt.charAt(i)){
                i++;
                j++;
            }
            if(j == m){
                System.out.println(i - j);
                j = lps[j-1]; // because we are incrementing j before we get to this incase the whole string matches the pattern.
            }
            else if(i < n && pattern.charAt(j) != txt.charAt(i)){
                if(j == 0){
                    i++;
                }
                else{
                    j = lps[j-1];
                }
            }
        }
    }

    static void fillLPS(String pattern , int[] Lps){
        int i = 1;
        Lps[0] = 0;
        int j = 0;
        int N = pattern.length();
        while(i < N){
            if(pattern.charAt(i) == pattern.charAt(j)){
                j++;
                Lps[i] = j;
                i++;
            }
            else{
                if(j == 0){
                    Lps[i] = 0;
                    i++;
                }
                else{
                    j = Lps[j - 1];
                }
            }
        }
    }
}
