package com.example.stack;

import java.util.EmptyStackException;

public class MyStack<E> {

    private Element<E> last;

    public MyStack() {
    }

    public E push(E element) {
        if (last == null) {
            last = new Element<>(element, null);
        } else {
            last = new Element<>(element, last);
        }
        return element;
    }

    public E pop() {
        E toRemove = peek();
        last = last.previous;
        return toRemove;
    }

    public E peek() {
        if (last == null) {
            throw new EmptyStackException();
        }
        return last.value;
    }

    public boolean empty() {
        return last == null;
    }

    private static class Element<E> {

        E value;
        Element<E> previous;

        public Element(E value, Element<E> previous) {
            this.value = value;
            this.previous = previous;
        }
    }

}