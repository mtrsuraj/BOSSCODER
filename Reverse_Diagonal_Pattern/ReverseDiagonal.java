package Reverse_Diagonal_Pattern;

import java.util.Scanner;

public class ReverseDiagonal {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int n= scanner.nextInt();
        int sp=1;
        for (int i=1; i<=n; i++) {
            
            for(int j=5; j>=sp; j--) {
            System.out.print("\t");
            }
            System.out.print("*\n");
            sp++;
        }
    }
    }
}
