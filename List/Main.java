package List;

import java.util.*;
import java.util.Comparator;

public class Main {
    public static <E> void main(String[] args) {
int i;
        List arlTest = new ArrayList<>();
        System.out.println("Размер созданного массива на начальном этапе " + arlTest.size());
        for (i = 1;i<=10; i++) {
            arlTest.add(i);
        }
//---------------------------------------------------------------------------------------
        System.out.println("Размер созданного массива на втором этапе " + arlTest.size());
        System.out.println("элементы массива" + arlTest);
        arlTest.add(5,1000);
        System.out.println("Размер созданного массива на третьем этапе " + arlTest.size());
        System.out.println("элементы массива" + arlTest);
        arlTest.addAll(5,arlTest);
        System.out.println("Размер созданного массива на четвертом этапе " + arlTest.size());
        System.out.println("элементы массива" + arlTest);
        System.out.println(arlTest.get(9));
        System.out.println(arlTest.indexOf(30));
        System.out.println(arlTest.lastIndexOf(1000));
//---------------------------------------------------------------------------------------
        Iterator iterator = arlTest.listIterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + "-");
            }
//---------------------------------------------------------------------------------------
        System.out.println();
        arlTest.remove(10);
        arlTest.remove(15);
        System.out.println(arlTest);
//---------------------------------------------------------------------------------------
        System.out.println();
        arlTest.set(5,25);
        arlTest.set(10,30);
        System.out.println(arlTest);
//---------------------------------------------------------------------------------------
        System.out.println();
        arlTest.sort(null);
        System.out.println(arlTest);
//---------------------------------------------------------------------------------------
            System.out.println();
            System.out.println(arlTest.subList(5,15));
//---------------------------------------------------------------------------------------

        ArrayList <String> arrayList = new ArrayList<>();
        String CommonString = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        String stringInArray = "";
        String stringChoice = "";
        int sc;
        int randSym;
        System.out.println("-----------------------------------------------------------------");
            System.out.println(arrayList);
            System.out.println(arrayList.size());
        for (int j = 0; j < 10; j++) {

            for (sc = 0; sc < 6; sc++) {
                stringChoice = String.valueOf(CommonString.charAt(randSym = (int) (52 * (Math.random()))));
                stringInArray = stringInArray + stringChoice;
            }
            arrayList.add(j, stringInArray);
            stringInArray = "";
            stringChoice = "";
        }
        System.out.println(arrayList);


    }
}
