package practice_homework;
/*Display left angle triangle of * using nested for loops*/

import java.util.Scanner;

public class programme_15_Lefttriangle {

    public static void leftTriangle1(int x) {
        int i, j;
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int a = scanner.nextInt();
        leftTriangle1(a);
        // closing the scanner object
        scanner.close();
    }

}
