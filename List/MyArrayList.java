package List;

import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;

public class MyArrayList<E> implements MyList<E> {

    @Override
    public void add(int index, E obj) {

    }

    @Override
    public boolean addAll(int index, Collection<? extends E> col) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object obj) {
        return 0;
    }

    @Override
    public int lastlndexOf(Object obj) {
        return 0;
    }

    @Override
    public ListIterator<E> listiterator() {
        return null;
    }

    @Override
    public MyList<E> of() {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E obj) {
        return null;
    }

    @Override
    public void sort(Comparator<? super E> comp) {

    }

    @Override
    public MyList<E> subList(int start, int end) {
        return null;
    }
}
