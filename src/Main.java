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


        System.out.println("Size of 10-20-30 (3): " + llist.size());
        System.out.println("what if remove head?:\t" + llist.next().size());
    }
}
