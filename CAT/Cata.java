package CAT;

public class Cata {
    public Cata(String catName, int catAge) {
    }

    public Cata() {

    }

    String nameOfCata = "BadCat ";

    public String getNameOfCata() {
        return nameOfCata;
    }

    public void setNameOfCata(String nameOfCata) {
        this.nameOfCata = nameOfCata;
    }


    public void catMethoda() {


        int countCat;
        int countAge = 3;
        for (countCat = 1; countCat<=10; countCat++) {
            if (countAge == 5) {
                countAge = 3;
            } else {
                countAge++;
            }
            System.out.println(nameOfCata + "Age= " + countAge + " it's cat number " + countCat);
        }
    }
    public void catMethodb(){
        int count = 0;
        String [] catNames = { "Pushok", "Murzik", "Barsik", "Vaska", "Mitka"};
        int [] catAges = { 3, 4, 5, 6, 7};
        Cata [] catArray = new Cata[5];

        for (Cata cat:catArray
        ) {
            cat = new Cata (catNames [count], catAges[count]);
            System.out.println(catNames[count] + " " + catAges[count]);
            count++;

        }



    }
}
