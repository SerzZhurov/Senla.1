package List;

import java.util.Collections;

public interface MyList <E> {
                        //Собственная реализация ArrayList
                        //МЕТОДЫ
    void add(int index, E obj);                                     //: добавляет в список по индексу index объект obj
    boolean addAll(int index, Collections <? extends E> col);       // добавляет в список по индексу index все элементы коллекции col. Если в результате добавления список был изменен, то возвращается true, иначе возвращается false
    Е get (int index);                                              //: возвращает объект из списка по индексу index
    int indexOf(Object obj);                                        //: возвращает индекс первого вхождения объекта obj в список. Если объект не найден, то возвращается -1
    int lastlndexOf(Object obj);                                    //: возвращает индекс последнего вхождения объекта obj в список. Если объект не найден, то возвращается -1 ListIterator<E> listiterator (): возвращает объект Listiterator для обхода элементов списка static <Е> List<E> of(элементы): создает из набора элементов объект List
    Е remove(int index);                                            //: удаляет объект из списка по индексу index, возвращая при этом удаленный объект
    Е set (int index, Е obj);                                       //: присваивает значение объекта obj элементу, который находится по индексу index
    void sort(Comparators < super E> comp);                           //: сортирует список с помощью компаратора comp
    List<E> subList(int start, int end);
                        //КОНСТРУКТОРЫ
    ArrayList();                                                    //: создает пустой список
    ArrayList(Collection <? extends E> col);                        //: создает список, в который добавляются все элементы коллекции col.
    ArrayList (int capacity);                                       //: создает список, который имеет начальную емкость capacity
}
