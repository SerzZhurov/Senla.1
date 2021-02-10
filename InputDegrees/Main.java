package InputDegrees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String FirstAngle = scanner.nextLine();
        String SecondAngle = scanner.nextLine();
        FirstAngle = FirstAngle.replaceAll(",",".");
        SecondAngle = SecondAngle.replaceAll(",",".");
        Double FirstAngleNumber = Double.parseDouble(FirstAngle);
        Double SecondAngleNumber = Double.parseDouble(SecondAngle);
        Double DegMinSec = FirstAngleNumber + SecondAngleNumber;
        int Deg = DegMinSec.intValue();
        double MinSec = (DegMinSec - Deg)/60;
        int Min = (int) MinSec;
        double SecDec = (MinSec-Min)/60;
        System.out.println("Angl: " + Deg + "-" + Min + "-" + SecDec);



    }


}
