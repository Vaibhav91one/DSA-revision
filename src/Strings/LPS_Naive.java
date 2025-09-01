package Strings;

import java.util.Arrays;

public class LPS_Naive {
    public static void main(String[] args){
        String s = "ababacab";
        int[] lps = new int[s.length()];


        for(int i = 0; i < s.length(); i++){
            lps[i] = LongPropPreSuff(s, i+1);
        }

        System.out.println(Arrays.toString(lps));
    }

    public static int LongPropPreSuff(String str,int n){
        for(int len = n-1; len > 0; len--){
            boolean flag = true;

            for(int i = 0; i < len; i++){
                if(str.charAt(i) != str.charAt(n - len + i) ){
                    flag = false;
                }
            }

            if(flag == true){
                return len;
            }
        }
        return 0;
    }
}

// Given input string: "ababacab"
// Index positions:     0 1 2 3 4 5 6 7

// Step 1: i = 0, substring = "a"
// n = 1
// len = 0 → loop does not run
// LPS[0] = 0

// Step 2: i = 1, substring = "ab"
// n = 2
// Checking len = 1
//   s[0] = 'a' != s[1] = 'b'  → No match
// LPS[1] = 0

// Step 3: i = 2, substring = "aba"
// n = 3
// Checking len = 2
//   s[0] = 'a', s[1] = 'b'  != s[1] = 'b', s[2] = 'a' → No match
// Checking len = 1
//   s[0] = 'a' == s[2] = 'a'  → Match
// LPS[2] = 1

// Step 4: i = 3, substring = "abab"
// n = 4
// Checking len = 3
//   s[0] = 'a', s[1] = 'b', s[2] = 'a' != s[1] = 'b', s[2] = 'a', s[3] = 'b' → No match
// Checking len = 2
//   s[0] = 'a', s[1] = 'b' == s[2] = 'a', s[3] = 'b' → Match
// LPS[3] = 2

// Step 5: i = 4, substring = "ababa"
// n = 5
// Checking len = 4
//   s[0] = 'a', s[1] = 'b', s[2] = 'a', s[3] = 'b' != s[1] = 'b', s[2] = 'a', s[3] = 'b', s[4] = 'a' → No match
// Checking len = 3
//   s[0] = 'a', s[1] = 'b', s[2] = 'a' == s[2] = 'a', s[3] = 'b', s[4] = 'a' → Match
// LPS[4] = 3

// Step 6: i = 5, substring = "ababac"
// n = 6
// Checking len = 5 → No match
// Checking len = 4 → No match
// Checking len = 3 → No match
// Checking len = 2 → No match
// Checking len = 1 → No match
// LPS[5] = 0

// Step 7: i = 6, substring = "ababaca"
// n = 7
// Checking len = 6 → No match
// Checking len = 5 → No match
// Checking len = 4 → No match
// Checking len = 3 → No match
// Checking len = 2 → No match
// Checking len = 1
//   s[0] = 'a' == s[6] = 'a' → Match
// LPS[6] = 1

// Step 8: i = 7, substring = "ababacab"
// n = 8
// Checking len = 7 → No match
// Checking len = 6 → No match
// Checking len = 5 → No match
// Checking len = 4 → No match
// Checking len = 3 → No match
// Checking len = 2
//   s[0] = 'a', s[1] = 'b' == s[6] = 'a', s[7] = 'b' → Match
// LPS[7] = 2

//[0, 0, 1, 2, 3, 0, 1, 2]
