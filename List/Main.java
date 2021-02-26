package List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
int i;
        ArrayList arlTest = new ArrayList();
        System.out.println("Размер созданного массива на начальном этапе " + arlTest.size());
        for (i = 0;i<10; i++) {
            arlTest.add(i);
        }
        System.out.println("Размер созданного массива на втором этапе " + arlTest.size());
        System.out.println("элементы массива" + arlTest);
    }
}
