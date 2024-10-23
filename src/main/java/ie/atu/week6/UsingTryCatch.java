package ie.atu.week6;

import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0 - 9 :");
        try(Scanner sc = new Scanner(System.in)) {
            boolean active = true;
            try {
                while (active) {
                    String input = sc.nextLine();

                    int myNum = Integer.parseInt(input);

                    if (myNum >= 0 && myNum <= 9) {
                        System.out.println("You entered " + myNum);
                        active = false;
                    } else {
                        System.out.println("Please enter a number between 0 - 9 .");
                    }
                }
            }
            catch(NumberFormatException ae){
                    System.out.println("Not a valid number, please enter a number between 0 - 9.");
            }
        }
    }
}
