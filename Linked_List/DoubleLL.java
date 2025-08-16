public class DoubleLL {
    public class Node{
        Node next;
        Node prev;
        int data;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
        public static Node tail;
        public static int size;
        
        //add
        public void addFirst(int data) {
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        public void addLast(int data) {
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        //print
        public void print() {
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data+ "<->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        //remove
        public int removeFirst() {
            if(head == null) {
                System.out.println("DLL is empty");
                return Integer.MIN_VALUE;
            }
            if(head.next == null) {
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }

        public int removeLast() {
            Node curr = head;
            Node prev = null;
            if(head == null) {
                System.out.println("DLL is empty");
                return Integer.MIN_VALUE;
            }
            if(head.next == null){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            while(curr.next != null){
                prev = curr;
                curr = curr.next;
            }
            int val = curr.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();

        dll.addLast(5);
        dll.print();
    }
}
