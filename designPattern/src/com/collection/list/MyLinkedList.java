package com.collection.list;


/**
 *
 * Created by Administrator on 2016/8/31 0031.
 */
public class MyLinkedList<T> {

    private int size;

    private Node<T> first;
    private Node<T> last;

    private class Node<T>{
        T data;
        private Node<T> per;
        private Node<T> next;
        Node(Node<T> per, T data, Node<T> next) {
            this.data = data;
            this.per = per;
            this.next = next;
        }
    }

    private boolean addFirst(T data) {
        Node<T> f = first;
        Node<T> node = new Node<>(null, data, first);
        first = node;
        if (f == null) {
            last = node;
        } else {
            f.per = node;
        }
        size++;
        return true;
    }


}
