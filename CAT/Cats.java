package CAT;
//        Задание 1
//        Создаем два класса.
//        Класс Cat и класс для запуска приложения.
//        У кота есть имя и возраст.
//        Есть дефолтное значение имени и возраста.
//        При запуске приложения используем три цикла.
//        Первый while создает 10 котиков и выводит дефолтное имя и возраст.
//        Во втором цикле for создаем 10 котиков, вводим им возраст и имя через геттер, сеттер, и выводим в консоль.
//        Третий цикл do while создает 10 котиков вводит имя и возраст через конструктор.
//        Выводим в консоль.
//        Четвертый цикл foreach. Массив из пяти котиков, у них выводим имя и возраст.
//        Способ инициализации возраста и имени - на ваше усмотрение.
//        Задание 2
//        Сгенерировать метод equals и toString для класса Cat.




// первый метод

public class Cats {

    final String nameOfCat = "Tetris";  // работает как private так и final
    final int ageOfCat = 4;             // работает как private так и final
    //    public String getName() {return nameOfCat;
    //        }
    //    public void setNameOfCat(String nameOfCat) {
    //        this.nameOfCat = nameOfCat;
    //    }
    //    public int getAgeOfCat() {
    //        return ageOfCat;
    //    }
    //    public void setAgeOfCat(int ageOfCat) {
    //        this.ageOfCat = ageOfCat;
    //    }
    public void catMethod() {                                           // объявили метод
        int count = 1;
        while (count <= 10) {
            System.out.println("#" + count + " Кот " + nameOfCat + " и его возраст " + ageOfCat + " года");
            count++;
        }
    }


}