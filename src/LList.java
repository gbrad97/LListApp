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

    public void prepend(int value) {
        MyNode newNode = new MyNode(value);
        // set old head to equal the next of the newNode
        newNode.next = head;
        // set the head to be the newNode
        head = newNode;
    }
    /**
     * pretty-print my linked list object
     * @return the linked list represented as a String
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("(" + this.size() + ") ");
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
