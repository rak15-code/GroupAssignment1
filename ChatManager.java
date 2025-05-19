/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GA2;

/**
 *
 * @author User
 */
public class ChatManager {
    // ===== Student 1 =====
    // [NUR ZARITH SOFIA BINTI SHARIN] – Singly Linked List

    static class SinglyLinkedList {

        static class Node {

            String data;
            Node next;

            Node(String data) {
                this.data = data;
            }
        }
        Node head, tail;

        void addFirst(String msg) {
            // TODO: implement
            Node one = new Node(msg);
            one.next = head;
            head = one;
            if (tail == null) {
                tail = head;
            }
        }

        void addLast(String msg) {
            // TODO: implement
            Node one = new Node(msg);
            if (tail == null) {
                head = tail = one;
            } else {
                tail.next = one;
                tail = one;
            }
        }

        String removeFirst() {
            // TODO: implement
            if (head != null) {
                String removed = head.data;
                head = head.next;
                if (head == null) {
                    tail = null;
                }
                return removed;
            } else {
                return null;
            }
        }

        void print() {
            // TODO: implement
            Node point = head;
            while (point != null) {
                System.out.print(point.data + " = ");
                point = point.next;
            }
            System.out.println("null");

        }

        public static void main(String[] args) {
            SinglyLinkedList list = new SinglyLinkedList();
            list.addFirst("Hello"); // Safe to write now
            list.addLast("Meow");
            list.removeFirst();
            list.print();
        }
    }
