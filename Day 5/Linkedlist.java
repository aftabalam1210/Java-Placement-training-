import java.util.ArrayList;
import java.util.*;

class Linked <T>{
    Node head = null;
    class Node<T> {
        T data; // Use T instead of int
        Node<T> next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    


    void insertAtHead (int data){
        Node newNode = new Node(data);
        if(head == null){
            head =newNode;

        }
        else{
            newNode.next = head;
            head = newNode;
        }

    }

    void insertAtEnd (int data){
        Node newNode = new Node(data);
        if(head == null){
            head =newNode;

        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }
}
public class Linkedlist {
    public static void main(String[] args) {
        Linked <String>list = new Linked();
        
    }
}
