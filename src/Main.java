public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println(linkedList.isEmpty());
        linkedList.insert(12);
        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.insert(24);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.hasLoop());
        linkedList.printNodeList();

        System.out.println(linkedList);

        LinkedList<Integer> linkedList02 = new LinkedList<>(3, 56, 78, 98, 3);
        System.out.println(linkedList02.hasLoop());
        linkedList02.printNodeList();

    }


}
