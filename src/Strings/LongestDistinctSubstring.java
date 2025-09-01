package Strings;

import java.util.Arrays;

public class LongestDistinctSubstring {
    public static void main(String[] args){
        String s = "abcadbd";
        System.out.println(DetermineLength(s));
    }

    // Based on the last index of the current character, maxEnd is calculated
    // The last index is stored in visited array
    static Integer DetermineLength(String s){
        int res = 0;
        int n = s.length();
        int[] visited = new int[256];
        Arrays.fill(visited, -1);
        int i = 0; // starting index of the substring

        for(int j = 0; j < s.length(); j++){
            i = Math.max(i, visited[s.charAt(j)] + 1); // Getting the starting index of the substring
            int maxEnd = j - i + 1; // Getting the last index of substring
            res = Math.max(res, maxEnd); // Comparing with max substring until j
            visited[s.charAt(j)] = j;  // marking current character as visited and inputting its index.
        }

        return res;
    }


}


