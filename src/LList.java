import java.util.Random;

public class LList {
    private MyNode head;    // a list is a head node and any linked nodes

    /**
     * parameterized constructor that takes an int
     * @param data the value of the head node
     */
    public LList(int data) {
        head = new MyNode(data);
    }

    /**
     * parameterized constructor that converts a MyNode object to a LList
     * @param node the value of the head node
     */
    public LList(MyNode node) {
        head = node;
    }

    public LList() {
        head = null;
    }

    public MyNode getHead() {
        return head;
    }

    public LList initialize(int numOfNodes, int maxValue) {
        Random rand = new Random();
        LList newList = new LList(new MyNode(rand.nextInt(maxValue + 1)));
        for (int i = 1; i < numOfNodes; i++) {
            int num = rand.nextInt(maxValue + 1);
            newList.append(num);
        }
        return newList;
    }

    /**
     * attach an int to the back of the linked list
     * @param data the value to be appended to the list
     */
    public void append(int data) {
        MyNode temp = head;

        while(temp.next != null)
            temp = temp.next;

        temp.next = new MyNode(data);
    }

    /**
     * the list without the head node
     * @return the rest of the list
     */
    public LList next() {
        if(head.next == null)
            return null;
        return new LList(head.next);
    }

    /*
    public int size() {
        if (head == null) {
            return 0;
        }

        else {
            MyNode tempHead = head;
            int count = 1;
            while (tempHead.next != null) {
                tempHead = tempHead.next;
                count++;
            }
            return count;
        }
    }
    */

    public int size(MyNode head) {
        if (head == null) {
            return 0;
        }
        return 1 + size(head.next);
    }


    public void prepend(int value) {
        MyNode newNode = new MyNode(value);
        // set old head to equal the next of the newNode
        newNode.next = head;
        // set the head to be the newNode
        head = newNode;
    }


    // assuming list is indexed starting with 0
    public void insert(int value, int position) {
        MyNode newNode = new MyNode(value);
        if (position > size(head) || position < 0) {
            System.out.println("The index is out of bounds.");
        }
        else if (position == 0 ) {
            prepend(value);
        }
        else if (position == size(head)) {
            append(value);
        }
        else {
            int count = 0;
            MyNode tempHead = head;
            while (tempHead.next != null) {
                if (count == position - 1) {
                    newNode.next = tempHead.next;
                    tempHead.next = newNode;
                }
                count++;
                tempHead = tempHead.next;
            }
        }
    }




    public void remove(int position) {
        if (position >= size(head) || position < 0) {
            System.out.println("The index is out of bounds.");
        }
        else if (position == 0) {
            head = head.next;
        }
        else {
            if (head != null) {
                if (head.next != null) {
                    int count = 0;
                    MyNode tempHead = head;
                    MyNode tempPointer = head.next;
                    while (tempHead.next != null && tempPointer.next != null) {
                        if (count == position - 1) {
                            break;
                        }
                        tempHead = tempHead.next;
                        tempPointer = tempPointer.next;
                        count++;
                    }
                    MyNode nodeToBeDeleted = tempPointer;
                    tempHead.next = nodeToBeDeleted.next;
                }
            }
        }
    }



    /*
    public boolean search(int value) {
        boolean isItInList = false;
        MyNode tempHead = head;
        while (tempHead != null) {
            if (tempHead.value == value) {
                isItInList = true;
                break;
            }
            tempHead = tempHead.next;
        }
        return isItInList;
    }
    */

    public boolean search(MyNode head, int value) {
        if (head == null) {
            return false;
        }
        else if (head.value == value) {
            return true;
        }
        return search(head.next, value);
    }

    /**
     * pretty-print my linked list object
     * @return the linked list represented as a String
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("(" + this.size(head) + ") ");
        MyNode tempHead = head;
        while (tempHead != null) {
            if (tempHead.next == null) {
                str.append(Integer.toString(tempHead.value));
            }
            else {
                str.append(Integer.toString(tempHead.value) + "-");
            }
            tempHead = tempHead.next;
        }
        return str.toString();
    }
}
