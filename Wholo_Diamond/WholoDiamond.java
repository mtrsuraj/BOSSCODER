package Wholo_Diamond;

import java.util.Scanner;

public class WholoDiamond {
    public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)){
        System.out.println("Enter col No: ");
        int col = scanner.nextInt();
        int sp = 1;
        int st = col/2+1;
        for(int i=1; i<=col; i++){
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }
        if(i<=col/2){
            sp+=2;
            st--;
        }else {
            sp-=2;
            st++;
        }
        System.out.println();
    }
}
}
}
