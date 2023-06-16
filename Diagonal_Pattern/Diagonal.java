package Diagonal_Pattern;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int n= scanner.nextInt();
        int sp=1;
        for (int i=1; i<=n; i++) {

            System.out.print("*\n");
            for(int j=1; j<=sp; j++) {
            System.out.print("\t");
            }
            sp++;
        }
    }
    }
}
