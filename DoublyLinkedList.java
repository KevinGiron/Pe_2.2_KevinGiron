public class DoublyLinkedList {
    private DDL_Node head;
    private DDL_Node tail;

    // tail null
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    // head null
    public boolean isEmpty() {
        return head == null;
    }

    //Insertar un nodo al final
    public void insertAtEnd(int data){
        DDL_Node newNode = new DDL_Node(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    public void display(){
        if (isEmpty()) {
            System.out.println("Lista vacía");
        }

        DDL_Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if(current.next != null){
                System.out.print(" <-> ");
            }
            current = current.next;
        }


        System.out.println();
        // print 1 2 3 <-> 4 5 6
    }

    public void reverse(){
        if (isEmpty() || head.next == tail) {
            return;
        }
        DDL_Node current = head;
        DDL_Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next; 
            current.next = temp; 
            current = current.prev;
        }

        temp = head;
        head = tail;
        tail = temp;
    }

    public boolean deleteByValue(int data){
        if (isEmpty()) {
            return false;
        }

        DDL_Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null) return false; // no pudimos retornar por que no encontramos un valor

            //caso 1 valor de eliminar es el head
        if (current == head){
            head = head.next;
            if (head != null){
                head.prev = null;
            } else {
                tail = null; // lista queda vacia
            }
        }else if (current == tail){
            //caso 2 eliminar tail
            tail = tail.prev;
            tail.next = null;
        } else {
            //si el nodo a eliminar es intermedio
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        return true;

    }
}
