package general_team_tasks.variant_07;

import java.util.*;

public class TaskClass<E> extends Vector<E> {
    public E push(E item) {
        addElement(item);

        return item;
    }

    public E pop() {
        E obj;
        int len = size();

        obj = peek();
        removeElementAt(len - 1);

        return obj;
    }

    public E peek() {
        int len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void clear() {
        removeAllElements();

    }
}