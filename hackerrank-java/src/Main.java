import java.util.Scanner;
public class Main {
// Phan fuction in space
    // static void inspace(int space) {
        // int a = space;
        // for(int i=1; i <= a; i++) {
            // System.out.print(" ");
        // }
    // }
// Phan main
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("================================");
    for(int i=0; i < 3; i++) {
        String a = input.next();
        int b = input.nextInt();
        int lengthtext = a.length();
        int space = 15 - lengthtext;

        if(b >= 100) {
            System.out.print(a);
            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.print(b);
            System.out.println("");
        }

        if(b >= 10 && b < 100) {

            System.out.print(a);
            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.print("0"+b);
            System.out.println("");
        }

        if(b < 10) {

            System.out.print(a);
            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.print("00"+b);
            System.out.println("");
        }
    }
    System.out.println("================================");
    }
}