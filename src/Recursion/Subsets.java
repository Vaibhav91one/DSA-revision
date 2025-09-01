package Recursion;

public class Subsets {
    public static void main(String[] args){
        String s = "ABC";

        PrintSubset(s, "", 0);
    }


    static void PrintSubset(String s,
                            String res,
                            int index){
        if(index == s.length()){
            System.out.println(res);
            return;
        }


        //exclude the current character
        PrintSubset(s, res, index+1);

        //include the current character
        PrintSubset(s, res + s.charAt(index), index+1);


    }
}
