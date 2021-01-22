package Rainbow;

import java.util.Scanner;

public class Colors {

    public static int ColorRequest;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String Red = "Red";
        final String Orange = "Orange";
        final String Yellow = "Yellow";
        final String Green = "Green";
        final String Blue = "Blue";
        final String Indigo = "Indigo";
        final String Violet = "Violet";
        System.out.println("Input color number from 1 to 7: ");
        int ColorRequest = input.nextInt();
        switch (ColorRequest) {
            case (1):
                System.out.println(ANSI_RED + Red + ANSI_RESET);
                break;
            case (2):
                System.out.println(ANSI_YELLOW + Orange + ANSI_RESET);
                break;
            case (3):
                System.out.println(ANSI_YELLOW + Yellow + ANSI_RESET);
                break;
            case (4):
                System.out.println(ANSI_GREEN + Green + ANSI_RESET);
                break;
            case (5):
                System.out.println(ANSI_BLUE + Blue + ANSI_RESET);
                break;
            case (6):
                System.out.println(ANSI_PURPLE + Indigo + ANSI_RESET);
                break;
            case (7):
                System.out.println(ANSI_CYAN + Violet + ANSI_RESET);
                break;
            default:
                System.out.println("Non-existent color");
                break;
        }
    }
}
