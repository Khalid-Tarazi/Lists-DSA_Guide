public class QueueArray {
    private int first, last;             // because there is index
    private int capacity = 10;         // this will be the default.
    private int[] arrQ = new int[capacity];
    private int size;                    // will tell us how much we used from the array.

    public QueueArray() {
        first = last = -1;   // this means the queue is empty.
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;       // 2 possible outcomes will be returned, true if size == 0 OR false size != 0
    }

    public boolean isFull() {
        return size == capacity;        // there are more than one code to try.  // or if last has stopped on last index.
    }

    private void resize() {      // What are the advantages and disadvantages? (BTEC)

        capacity = capacity * 2;
        int[] newArray = new int[capacity];         // I make new array, not the same array, and move everything to it.

        for (int i = 0; i < arrQ.length; i++) {
            newArray[i] = arrQ[i];              // send from old to new array.
        }
        arrQ = newArray;           // I need to rename it, so I don't get confused everytime I use this method.
    }

    public void enqueue(int val) {

        if (isFull())
            resize();             // or I can resize capacity // I need to bring the resize method in stackArray class

        if (isEmpty()) {
            first = last = 0;
            arrQ[last] = val;
            size++;
            return;
        }

        last++;
        arrQ[last] = val;
        size++;
    }

    public int dequeue() {      // int because I will remove item from the queue.

        if (isEmpty())
            return -1;

        int out;                // Variable to store the value being dequeued
        if (size == 1) {        // If there is only one element in the queue
            out = arrQ[first];  // Retrieve the element from the front of the queue
            first = last = -1;  // Reset the pointers indicating an empty queue
        } else {                    // FIFO, if there is more than 1 element
            out = arrQ[first];  // Retrieve the element from the front of the queue
            first++;            // Move the 'first' pointer to the next element
        }
        return out;             // Return the dequeued element
    }

    public void displayQ() {

        for (int i = 0; i < size; i++) {    // choose size, so I don't print the full capacity.
            System.out.print(arrQ[i] + "  ");
        }
        System.out.println();
    }
}
