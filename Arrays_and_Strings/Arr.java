package Arrays_and_Strings;

import java.util.Scanner;

public class Arr {

    @Override
    public String toString() {
        return "Arr{}";
    }

    public void square() {
        Scanner input = new Scanner(System.in);
        System.out.println("input array size:");
        int sz = input.nextInt();
        int i = 0;
        int j = 0;
        double SqAr[][] = new double[sz][sz];
        for (i = 0; i < SqAr.length; i++) {
            for (j = 0; j < SqAr.length; j++) {
                double result = 10 * (double) Math.random();
                //result = (int)Math.floor(result);
                //result = result/10000;
                SqAr[i][j] = result;
            }
        }

            System.out.println("Array size " + SqAr.length + " x " + SqAr.length);
            for (i = 0; i < SqAr.length; i++) {
                for (j = 0; j < SqAr.length; j++) {

                    System.out.print(SqAr[i][j] + " ");
                }
                System.out.println("");


            }

        }
    }
