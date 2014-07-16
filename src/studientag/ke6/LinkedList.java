/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studientag.ke6;

/**
 *
 * @author Gösta Ostendorf <goesta.o@gmail.com>
 */
public class LinkedList {

    private ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int value) {
        ListNode newNode = new ListNode(value, this.head);
        this.head = newNode;
    }

    public int size() {
        ListNode current = this.head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}
