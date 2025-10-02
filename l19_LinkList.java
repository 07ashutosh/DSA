
public class l19_LinkList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add (AddFirst, AddLast)
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    //adding in last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }

        curNode.next = newNode;

    }

    //delete  first
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }


    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data +"->");
            curNode = curNode.next;
        }

        System.out.println("NULL");
    }



    public static void main(String[] args) {
        l19_LinkList list = new l19_LinkList();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("List");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }
}
