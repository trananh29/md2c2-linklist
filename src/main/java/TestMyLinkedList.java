public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList lk1= new MyLinkedList(10);
        lk1.addFist(11);
        lk1.addFist(13);
        lk1.addFist(17);
        lk1.add(4,9);
        lk1.add(4,7);
        lk1.printList();
    }
}
