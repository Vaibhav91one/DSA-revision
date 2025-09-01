package Strings;

public class LexicographicRank {
    public static void main(String[] args){
        String s = "STRING";
        System.out.println(LexioRank(s));
    }

    static Integer fact(int n){
        int fact = 1;

        for(int i = 2; i <= n; i++){
            fact *= i;
        }

        return fact;
    }

    static Integer LexioRank(String txt){
        // calculate factorial of length of the string
        int rank = 0;

        // Count the frequency of each element
        int[] freqCount = new int[256];

        for(int i = 0; i < txt.length(); i++){
            freqCount[txt.charAt(i)]++;
        }

        // Get the cumulative frequency

        for(int i = 1; i < 256; i++){
            freqCount[i] += freqCount[i-1];
        }

        // Use the computation done until now to find the lexiographic rank
        int mul = fact(txt.length());
        for(int i = 0; i < txt.length(); i++){
            mul /= (txt.length() - i);

            rank += mul * freqCount[txt.charAt(i)-1];

            for(int j = txt.charAt(i); j < 256; j++){
                freqCount[j]--;
            }
        }

        return rank+1;
    }
}
