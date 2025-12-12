public class SLL {      // make a class to connect nodes together
    // I ask myself, what type of date to save? and what operations to use?
    SLLNode head;       // I need to declare the starting node only. // it's type SLLNode,has A relationship. composition... taken from another class  //The 1st pointer

    public SLL() {      // constructor

        head = null;    // a new list, it's first value is null... it means the list is empty.
    }

    public boolean isEmpty() {      // no parameters: only return value     //to check if the list is empty
        //composition... class using class
        return head == null;        //if head is null then list is empty
    }

    public void addToTail(int value) {

        SLLNode newNode = new SLLNode(value);               // first step: to define the object

        if (head == null) {             // 2nd step: if list is empty

            head = newNode;             // point head to newNode
            return;                     // because I finished , and return only, because its void
        }

        SLLNode current = head;         // I need to look for the end of the list , to connect node to it.

        while (current.next != null) {  //is the next of the current position not empty?
            current = current.next;     //old current = new current  // or it will stay in the same place.
        }
        current.next = newNode;     // the last one connect the value that we need to add to tail of the list.
    }

    public void addToHead(int value) {

        SLLNode newNode = new SLLNode(value);       // after creating object.. I give him value.

        newNode.next = head;                // just changing pointers.
        head = newNode;
    }

    public int deleteTail() {       //no input taken, I don't know where I will delete

        if (head == null) {           // if Empty list, nothing to delete
            return -1;                // indicate the list is empty
        }

        SLLNode current = head;          // I can call head easily, because it's in the same class.

        if (current.next == null) {      // if the list has only one node
            int value = current.value;
            head = null;                // Set head to null as there is no tail
            return value;
        }

        while (current.next.next != null) {        //I stop one node before the tail  current-> next(tail) -> next(null)
            current = current.next;                // I stopped before tail, in the correct position before delete.
        }

        SLLNode delNode = current.next; // Step 3: Identify the tail node to be deleted

        current.next = null;          // Step 4: Disconnect the tail node from the list  // I want the next one to be null, not the tail.

        return delNode.value;        // Step 5: Return the value of the deleted tail node
    }

    public int deleteHead() {

        SLLNode delNode = head;    // Step 1: Create a temporary node to store the head

        head = head.next;   // new head = old head.next // Step 2: Update the head to the next node in the list

        delNode.next = null; // Step 3: Disconnect the temporary node from the list

        return delNode.value; // Step 4: Return the value of the deleted head node
    }

    public boolean search(int key) {

        SLLNode current = head;  // I always write it

        while (current != null) {  // I always write it
            if (current.value == key) {         //don't write current == key because i need the value in it, not the position.
                return true;
            }
            current = current.next;  // I always write it //it's like i++
        }
        return false;   // did not find the number.
    }

    public boolean deleteNode(int delValue) {       // If we have a number(value) to be deleted from list

        if (head.value == delValue) {       //if i find it at the head.
            deleteHead();
            return true;
        }

        SLLNode prev = head;
        SLLNode current = head.next;

        while (current != null) {

            if (current.value == delValue) {
                prev.next = current.next;       // to connect pointer to the tail and skip the delValue
                current.next = null;            // to delete the delValue.
                return true;
            }
            prev = prev.next;       //prev++
            current = current.next;     //current++
        }
        return false;
    }

    public void printList() {

        SLLNode current = head;

        while (current != null) {

            System.out.print(current.value + "--> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int countNodes() {  // to count how many nodes in a list.

        SLLNode current = head;
        int counter = 0;
        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public void insert(int newValue, int position) {

        SLLNode newNode = new SLLNode(newValue);
        SLLNode current = head;
        int counter = 0;

        while (current != null) {

            if (counter == position - 1) {   // I should stop 1 position behind the node I want to insert newValue to it.
                break;                      // I found the position, break the loop and continue with the insert.
            }

            counter++;
            current = current.next;
        }

        newNode.next = current.next;  // here I will connect pointers,  and insert new node.
        current.next = newNode;         // I can draw to understand the logic.
    }

    public int count_divisors(int divisor) {

        SLLNode current = head;
        int count_divisors = 0; // I want to count specific numbers not all

        if (isEmpty()) {        //just to improve the code.
            return -1;
        }

        while (current != null) {

            if (current.value % divisor == 0) {
                count_divisors++;
            }
            current = current.next;
        }
        return count_divisors;
    }

    public boolean checkNumbers() {     // Question 7: check if 2 numbers in the beginning = 2 numbers in the end

        SLLNode current = head;         //check if the code correct

        if (countNodes() < 4) {         //we need to check at least 4 nodes available.
            System.out.println("False! The first two numbers are not the same as the last two numbers");
            return false;
        }

        while (current.next.next != null) {    //condition to continue with the loop
            current = current.next;
        }

        if (head.value == current.value && head.next.value == current.next.value) {
            System.out.println("True! The first two numbers are the same as the last two numbers");
            return true;
        }
        System.out.println("False! The first two numbers are not the same as the last two numbers");
        return false;
    }

    public int calculateSum() {

        int sum = 0;

        SLLNode current = head;

        while (current != null) {

            sum += current.value;
            current = current.next;
        }
        // I can add condition if sum > 20 then confirm it.
        return sum;
    }

    public void Count_Even_Odd() {      // Question 1: count even_odd

        SLLNode current = head;
        int countEven = 0;
        int countOdd = 0;

        while (current != null) {
            if (current.value % 2 == 0) {        //even
                countEven++;
            } else                               //odd
            {
                countOdd++;
            }
            current = current.next;
        }
        System.out.println("The number of odd numbers: " + countOdd);
        System.out.println("The number of even numbers: " + countEven);
    }

    public int find_unique_element() {   // Question 2: find unique element
        SLLNode current = head;
        int count = 1;

        if (head == null) {
            return -1;
        }

        while (current != null && current.next != null && current.next.next != null) {

            if (current.value != current.next.value && current.value != current.next.next.value) {
                return count;
            }
            current = current.next;
            count++;
        }
        if (current.value != current.next.value) {      //in case the unique number before the tail
            return count;
        }
        return -1; // not handling if unique # at tail.
    }

    public int findMiddle() {       // Question 6: find middle number.
        if (isEmpty()) {
            return -1;
        }

        int nodeCount = countNodes();
        SLLNode current = head;
        int middleIndex = nodeCount / 2;

        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }

        System.out.println("Middle element: " + current.value);
        return current.value;
    }
}
