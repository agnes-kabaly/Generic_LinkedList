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
        System.out.println(linkedList.toString());
        System.out.println(linkedList);


        LinkedList<Integer> linkedList02 = new LinkedList<>(3, 56, 78, 98, 3);
        System.out.println(linkedList02.hasLoop());
        System.out.println(linkedList02.toString());

        linkedList02.remove(1);
        linkedList02.remove(0);
        System.out.println(linkedList02.toString());

        System.out.println(linkedList02.getNode(3));
        linkedList02.getNode(2).next = linkedList02.getNode(1);
        System.out.println(linkedList02.hasLoop());

        System.out.println(linkedList.stringify(linkedList));
        System.out.println(linkedList.stringify(linkedList.getFirst()));
    }


}
