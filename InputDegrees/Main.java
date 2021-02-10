package InputDegrees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String FirstAngle = scanner.nextLine();
        String SecondAngle = scanner.nextLine();
        FirstAngle = FirstAngle.replaceAll(",",".");
        SecondAngle = SecondAngle.replaceAll(",",".");
        Double a = Double.parseDouble(FirstAngle);
        Double b = Double.parseDouble(SecondAngle);
        System.out.println(a+b);


    }


}
