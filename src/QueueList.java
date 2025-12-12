public class QueueList {  // I will use DLL + DLLNode classes.
    DLLNode first;
    DLLNode last;
    DLL QList = new DLL();      // I will this list to add data to it. //the user who use queue... cannot see the type of queue (forming abstraction).

    QueueList() {                   // constructor.
        //first = last = null;        // queue still empty.  // I need to update manually after doing operation.
        first = QList.head;             // will update and connect automatically to Qlist head and tail. but I need to make the Qlist first.
        last = QList.tail;              // if the QList is empty, it will be null for both first and last.
    }

    public boolean isEmpty() {
        return (first == null && last == null); // I can () for less confusion.  // I can use this condition for security reasons.
    }

    public void enqueue(int value) {  // void, because it will take nothing, just enter data to the queue.

        QList.addToTail(value);  // I use method in DLL class.
        last = QList.tail;      // because I updated the tail, I need to point again to the tail. // I add this line of code to compare with QueueArray
    }
    // I don't to resize() , because the list is dynamic.

    public int dequeue() { // int because items in the queue are integers.
        // dequeue should give me the head.
        if (QList.isEmpty())
            return -1;

        int out = QList.head.value; //If the queue is not empty, the method retrieves the value of the head element and stores it in the out variable.
        QList.deleteFromHead();

        first = QList.head;         // Update first to point to the new head, which is now the next element in the queue.

        return out;              //returns the dequeued element, which was stored in the out variable.
    }

    public void displayQ() {

        DLLNode current = QList.head;

        while (current != null) {
            System.out.print(current.value + "  ");
            current = current.next;
        }
        System.out.println();
    }
}
