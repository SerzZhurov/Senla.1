package Learning;

import java.util.*;

public class Array {
    public static void main(String[] args) {



        //-------------- bubble array sorting--------------------
        //-------------------------------------------------------
        Scanner input = new Scanner(System.in);
        System.out.println("input array size: ");
        int sz = input.nextInt();
        int i=0;
        int mass[]= new int [sz];
        while (i<sz) {
            double a= (double) Math.random();
            mass[i]= (int) Math.floor(a*100);
            i = i+1;}
        // -------------- printing unsorted array ---------------
        for (i=0;i<sz;i++) {
            System.out.print (mass[i]+",");
        }
        //----------------- sorting-----------------------
        boolean isSorted = false;
        int buffer;
        while( ! isSorted) {
            isSorted = true;
            i = 0;
            while (i < mass.length-1) {
                if(mass[i] > mass[i + 1]){
                    isSorted = false;
                    buffer = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = buffer;
                }
                i++;
            }
        }
        // -------------- printing sorted array ---------------
        System.out.println ();
        for (i=0;i<sz;i++) {
            System.out.print (mass[i]+",");}
    }


}
