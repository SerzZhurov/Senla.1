package Numbers;


import java.util.*;

public class Main  {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Counter SADM = new Counter();

            System.out.println("input first number: " );
            double a = scanner.nextInt();
            SADM.a = a;
            System.out.println("input second number: " );
            SADM.b = scanner.nextInt();

            double resultAddition = SADM.counterAddition();
            System.out.println(resultAddition);

            double resultSubtraction = SADM.counterSubtraction();
            System.out.println(resultSubtraction);

            double resultDivision = SADM.counterDivision();
            System.out.println(resultDivision);



        }

    }

