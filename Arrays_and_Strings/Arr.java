package Arrays_and_Strings;

import java.util.Scanner;


class Arr {
    int i;
    int j;
    int sc;
    int randSym;

    String[][] square() {
        Scanner input = new Scanner(System.in);
        String stringInArray = "";
        String stringChoice = "";
        String string = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        System.out.println("input array size:");
        int sz = input.nextInt();
        String SqAr[][] = new String[sz][sz];
        for (i = 0; i < SqAr.length; i++) {                                                                 //задаем цикл перебора строк
            for (j = 0; j < SqAr.length; j++) {                                                             //задаем цикл перебора столбцов
                for (sc = 0; sc < 6; sc++) {                                                                  //--------------------------
                    stringChoice = String.valueOf(string.charAt(randSym = (int) (52 * (Math.random()))));     //цикл создания строки длиной 6 с случайными символами
                    stringInArray = stringInArray + stringChoice;                                           //--------------------------
                }
                if ((i + j) % 3 != 0) {
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
                String print = new StringBuilder().append(SqAr[i][j]).toString();
                print = print.substring(0, 6);
                System.out.print(print + " ");
            }
            System.out.println("");
        }
        return square();
    }

//    void getMainDiag() {
//        i = 0;
//        j = 0;
//        String DiagSqAr[][] = square();
//        for (i = 0; i < DiagSqAr.length; i++) {
//            System.out.println(DiagSqAr[i][i]);
//            System.out.print(" ");
//        }
//
//    }
}

