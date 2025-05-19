// Group Tutorial 13
// Group Members:
// Student 1: [Name] – Singly Linked List
// Student 2: [Name] – Indexed List
// Student 3: [Name] – Doubly Linked List with Cursor
// Student 4: Nurul Farzana Binti Anuar – Undo/Redo with Stack
// Student 5: [Name] – Testing
// Student X: [Name] – Absent


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

//=====Student 4=====
//Nurul Farzana Binti Anuar - Undo/Redo with Stack
public class UndoRedoManager {
    private final Stack <String> undo = new Stack<>();
    private final Stack <String> redo = new Stack<>();
    
    public void perform(String action){
        System.out.println("Perform: " + action);
        
        undo.push(action);
        redo.clear();
    }
    
    public String Undo(){
        if(!undo.isEmpty()){
            String action = undo.pop();
            redo.push(action);
            return action;
        }else{
            return null;
        }
     
    }
    
    public String Redo(){
        if(!redo.isEmpty()){
            String action = redo.pop();
            undo.push(action);
            return action;
        }else{
           return null;
        }
     
    }
    
    public void printStacks(){
        System.out.println("Undo Stack: " + undo);
        System.out.println("redo Stack: " + redo);
    }
    
    
}
    }
