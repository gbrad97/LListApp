public class Main {

    public static void main(String[] args) {
        System.out.println("\n=====  Hello, LListApp!  =====\n");

        LList llist = new LList( 10 );
        System.out.println("\ninitial list is 10?:\t" + llist);
        System.out.println("what if remove head?:\t" + llist.next());

        llist.append(20);
        System.out.println("\nappend 20 so 10-20?:\t" + llist);
        System.out.println("what if remove head?:\t" + llist.next());

        llist.append(30);
        System.out.println("\nappend 30 so 10-20-30?:\t" + llist);
        System.out.println("what if remove head?:\t" + llist.next());


        System.out.println("\nSize of 10-20-30 (3):\t" + llist.size());
        System.out.println("what if remove head?:\t" + llist.next().size());

        llist.prepend(5);
        System.out.println("\nprepend 5 so 5-10-20-30?:\t" + llist);

        llist.prepend(0);
        System.out.println("\nprepend 0 so 0-5-10-20-30?:\t" + llist);


        LList newList1 = new LList();
        newList1 = newList1.initialize(5, 50);
        System.out.println("\nNew List made from random values (5): " + newList1);

        LList newList2 = new LList();
        newList2 = newList2.initialize(10, 100);
        System.out.println("\nNew List of made from random values (10): " + newList2);

        llist.insert(-5, 0);
        System.out.println("\ninsert -5 at position 0 so -5-0-5-10-20-30?:\t" + llist);

        llist.insert(3, 2);
        System.out.println("\ninsert 3 at position 2 so -5-0-3-5-10-20-30?:\t" + llist);

        llist.insert(40, llist.size());
        System.out.println("\ninsert 40 at the end of the list so -5-0-3-5-10-20-30-40?:\t" + llist);

        llist.insert(50, llist.size() + 1);
        System.out.println("\ninsert 50 at position size + 1:\t" + llist);

        llist.insert(-25, -111);
        System.out.println("\ninsert -25 at position -111:\t" + llist);

        llist.insert(2000, 2222);
        System.out.println("\ninsert 2000 at position 2222:\t" + llist);






    }
}
