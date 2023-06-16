package Diagonal_Pattern;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int n= scanner.nextInt();
        for (int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i==j){
                    System.out.print("*\n");
                }else System.out.print("\t");
            }
            System.out.println();
            
        }
    }
    }
}
