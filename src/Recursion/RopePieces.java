package Recursion;

public class RopePieces {
    public static void main(String[] args){
        int n = 5;
        int a = 2;
        int b = 5;
        int c = 1;

        System.out.print(MaxPieces(n, a,b,c));

    }

    static int MaxPieces(int n , int a, int b, int c){

        // returning 0 if the rope has been fully cut
        if( n == 0){
            return 0;
        }

        // if res goes in negative, the cutting permutation is invalid
        if( n < 0) return -1;

        // Getting max out of each scenario
        int res = Math.max(Math.max(MaxPieces(n-a, a, b, c),MaxPieces(n-b, a, b, c)), MaxPieces(n-c, a, b, c));

        // if rope cannot be cut because of a,b,c > n
        if(res == -1) return -1;

        // Returning res + 1, +1 because when each MaxPieces will be called it will return 0 when the rope is fully cut, and it will be return to  res + 1, and to verify that the rope was cut by this scenario we add 1
        return res+1;
    }
}
