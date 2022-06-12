package main;

import java.util.Scanner;

public class Decisions {
    public static void main(String[] args) {


        // Tenary Operator ?:

        //TODO :::::::>>>>> first you write the condition then question mark
        // ? the value if the condition is true then colon : final value if
        // the condition is false.

        Scanner scanner = new Scanner(System.in);

        System.out.print("X : ");
        int x = scanner.nextInt();
        System.out.print("Y : ");
        int y = scanner.nextInt();


        int num = x > y ? 50 : 100;

        System.out.println("Num : " + num);

        int multiple = x > y ? (30 < 19 ? 10 : 89) : 50;

        // TODO ::: > > > The above example evaluates the first condition and
        //  only enters the bracket if the condition is true. else it move to
        //  the last result.

        System.out.println(multiple);
    }
}
