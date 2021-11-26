package com.mark0wka.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList<E> implements ILinkedList<E>{

    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    public MyLinkedList() {
        this.last = new Node<>(null, first, null);
        this.first = new Node<>(null, null, last);
    }

    private class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    Node<E> node(int index) {
        if (index < (size >> 1)) {
            Node<E> x = first.getNext();
            for (int i = 0; i < index; i++)
                x = x.getNext();
            return x;
        } else {
            Node<E> x = last.getPrev();
            for (int i = size - 1; i > index; i--)
                x = x.getPrev();
            return x;
        }
    }

    @Override
    public void add(E element) {
        Node<E> temp = this.last;
        this.last = new Node<E>(null, temp, null);
        temp.setElement(element);
        temp.setNext(this.last);
        this.size++;

    }

    @Override
    public void add(int index, E element) {
        if (index >= 0 && index <= this.size) {
            if(index == size) {
                this.add(element);
            } else {
                Node<E> temp = node(index);
                final Node<E> pred = temp.getPrev();
                final Node<E> newNode = new Node<E>(element, pred, temp);
                temp.setPrev(newNode);
                if (pred == null) {
                    first = new Node<E>(null, null, newNode);
                }
                else {
                    pred.setNext(newNode);
                }
                this.size++;
            }
        }

    }

    @Override
    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.getNext();
            x.setElement(null);
            x.setNext(null);
            x.setPrev(null);
            x = next;
        }
        this.first = this.last = null;
        this.size = 0;
    }

    @Override
    public E get(int index) {
        return node(index).getElement();
    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        if (element == null) {
            for (Node<E> x = first.getNext(); x != null; x = x.getNext()) {
                if (x.getElement() == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first.getNext(); x != null; x = x.getNext()) {
                if (element.equals(x.getElement()))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        Node<E> temp = node(index);
        E element = temp.getElement();
        Node<E> prev = temp.getPrev();
        Node<E> next = temp.getNext();
        if(prev == null) {
            this.first = new Node<>(null, null, next);
        } else {
            prev.setNext(next);
            temp.setPrev(null);
        }

        if(next == null) {
            this.last = new Node<>(null, prev, null);
        } else {
            next.setPrev(prev);
            temp.setNext(null);
        }
        temp.setElement(null);
        this.size--;
        return element;
    }

    @Override
    public E set(int index, E element) {
        Node<E> x = node(index);
        E oldVal = x.getElement();
        x.setElement(element);
        return oldVal;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        String str = "MyLinkedList contains: ";
        for (Node<E> x = first.getNext(); x != last; x = x.getNext()) {
            str += x.getElement() + ", ";
        }
        return str.substring(0, str.length() - 2);
    }

    @Override
    public Object[] toArray(){
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.getNext())
            result[i++] = x.getElement();
        return result;
    }

    @Override
    public <T> T[] toArray(T[] array) {
        int i = 0;
        if(array.length < size) {
            array = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), size);
        }

        Object[] tempArray = array;
        for (Node<E> x = this.first.getNext(); x != this.last; x = x.getNext()) {
            tempArray[i++] = x.getElement();
        }

        if (array.length > size) {
            array[size] = null;
        }
        return array;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                return get(index + 1);
            }
        };
    }
}
