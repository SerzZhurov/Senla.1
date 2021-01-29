package Arrays_and_Strings;

import java.util.Scanner;

public class Arr {

    @Override
    public String toString() {
        return "Arr{}";
    }

    public void square() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int sc;
        int randSym;
        String stringInArray = "";
        String stringChoice = "";
        String string = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        System.out.println("input array size:");
        int sz = input.nextInt();
        String SqAr[][] = new String[sz][sz];
        for (i = 0; i < SqAr.length; i++) {
            for (j = 0; j < SqAr.length; j++) {
                for (sc = 0; sc<6; sc++) {
                    stringChoice = String.valueOf(string.charAt(randSym = (int) (52*(Math.random()))));
                    stringInArray = stringInArray + stringChoice;
                }
                if ((i+j)%3 == 0) {
                    SqAr[i][j] = stringInArray;
                    stringInArray = "";
                    } else {
                    double result = 10 * (double) Math.random();
                    SqAr[i][j] = String.valueOf(result);
                            }

            }
        }

            System.out.println("Array size " + SqAr.length + " x " + SqAr.length);
            for (i = 0; i < SqAr.length; i++) {
                for (j = 0; j < SqAr.length; j++) {
                String print =new StringBuilder().append(SqAr[i][j]).toString();
                print = print.substring(0,6);
                System.out.print(print + " ");
                }
                System.out.println("");


            }

        }
    }
