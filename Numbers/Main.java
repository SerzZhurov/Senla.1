package Numbers;


import java.util.*;

public class Main  {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            Counter SADM = new Counter();

            System.out.println("input first number: " );
            SADM.a = input.nextInt();
            System.out.println("input second number: " );
            SADM.b = input.nextInt();

            int resultAddition = SADM.counterAddition();
            System.out.println(resultAddition);

            int resultSubtraction = SADM.counterSubtraction();
            System.out.println(resultSubtraction);

            double resultDivision = SADM.counterDivision();
            System.out.println(resultDivision);



        }

    }

