package main;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter any string here: ");
        String name = scanner.next();
        switch (name) {
            case "Name" -> System.out.println("String is Pascal case Name");
            case "name" -> System.out.println("String is name");
            default -> System.out.println("not found");
        }

    }
}
