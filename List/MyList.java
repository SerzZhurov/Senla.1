package List;

import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;

public interface MyList<E> {
                        //Собственная реализация ArrayList
                        //МЕТОДЫ
    void add(int index, E obj);                                     //: добавляет в список по индексу index объект obj
    boolean addAll(int index, Collection<? extends E> col);       // добавляет в список по индексу index все элементы коллекции col. Если в результате добавления список был изменен, то возвращается true, иначе возвращается false
    E get (int index);                                              //: возвращает объект из списка по индексу index
    int indexOf(Object obj);                                        //: возвращает индекс первого вхождения объекта obj в список. Если объект не найден, то возвращается -1
    int lastlndexOf(Object obj);                                    //: возвращает индекс последнего вхождения объекта obj в список. Если объект не найден, то возвращается -1
    ListIterator<E> listiterator ();                                 //: возвращает объект Listiterator для обхода элементов списка
    <E> MyList<E> of (Object);                                   //: создает из набора элементов объект List
    E remove(int index);                                            //: удаляет объект из списка по индексу index, возвращая при этом удаленный объект
    E set (int index, E obj);                                       //: присваивает значение объекта obj элементу, который находится по индексу index
    void sort(Comparator <? super E> comp);                           //: сортирует список с помощью компаратора comp
    MyList<E> subList(int start, int end);
                        //КОНСТРУКТОРЫ
    ArrayList();                                                    //: создает пустой список
    ArrayList(Collection <? extends E> col);                        //: создает список, в который добавляются все элементы коллекции col.
    ArrayList (int capacity);                                       //: создает список, который имеет начальную емкость capacity
}
