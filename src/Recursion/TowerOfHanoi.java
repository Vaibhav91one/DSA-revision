package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args){
        int n = 3;
        Move(n, 'A', 'C', 'B');
    }

    static void Move(int n, char Source, char Destination, char Auxilary){
        if(n == 1){
            System.out.println(Source + "to" + Destination);
            return;
        }

        // Moving all disks to Auxilary
        Move(n-1, Source, Auxilary, Destination);

        System.out.println(Source + "to" + Destination);

        Move(n-1, Auxilary, Destination, Source);
    }
}
