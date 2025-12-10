public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Lista vacia: " + list.isEmpty());

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAtEnd(70);
        list.insertAtEnd(80);
        list.insertAtEnd(90);
        list.insertAtEnd(99);

        System.out.print("Lista creada: ");
        list.display();


        System.out.println("Parte Dos ");
        System.out.println("Lista Original: ");
        list.display();
        System.out.println("Lista Reversa: ");
        list.reverse();
        list.display();

        DoublyLinkedList Singlelist = new DoublyLinkedList();

        System.out.println("Un solo elemento (caso borde)");
        Singlelist.insertAtEnd(60);
        Singlelist.display();
        System.out.println("Reversa");
        Singlelist.reverse();
        Singlelist.display();

        System.out.println("Parte Tres ");
        System.out.println("Parte 3.1 ");
        System.out.println("lista original: ");
        list.display();
        System.out.println("nodo eliminado: ");
        list.deleteByValue(30);
        list.display();

    }


}
