package assignment10;

import java.util.NoSuchElementException;

class Node<Type> {
    Type data;
    Node next;

    Node(Type ele) {
        this.data = ele;
    }
}

class SListIterator<Type> {
    private Node curr;
    private Node head;

    SListIterator(Node head) {
        this.curr = head;
        this.head = head;
    }

    public boolean hasNext() {
        return (curr.next != null);
    }

    public Node retCurr() {
        return this.curr;
    }

    public void setCurr() {
        this.curr=head;
    }

    public Node next() {
        if (hasNext()) {
            curr = curr.next;
        } else {
            throw new NoSuchElementException();
        }
        return curr;
    }

    public void remove() {
        // remove the curr element.
        if (curr != null) {
            Node temp = head;
            if (temp == curr) {
                curr = curr.next;
            } else {
                while (temp.next != curr) {
                    temp = temp.next;
                }
                // remove the current
                temp.next = curr.next;
                // update the current
                curr = temp;
            }
        }
    }

    public void add(Type ele) {
        if (head == null) {
            head = new Node(ele);
            curr = head;
        } else {
            Node temp = new Node(ele);
            temp.next = curr.next;
            curr.next = temp;
        }
    }
}

public class SList<Type> {
    private Node head;
    private SListIterator iterator;

    public SList() {
        this.iterator = new SListIterator(head);
    }

    public SListIterator getIterator() {
        // set the curr
        this.iterator.setCurr();
        return iterator;
    }

    public String toString() {
        String out = " ";
        while (iterator.hasNext()) {
            out += iterator.retCurr().data + " -> ";
            iterator.next();
        }
        return out + iterator.retCurr().data;
    }

    public static void main(String[] args) {
        SList<Integer> sList = new SList<>();
        sList.getIterator().add(1);
        sList.getIterator().add(2);
        sList.getIterator().add(3);
        sList.getIterator().add(4);
        System.out.println(sList.toString());
        sList.getIterator().remove();
        System.out.println(sList.toString());
    }
}
