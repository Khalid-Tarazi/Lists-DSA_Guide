public class DLL {
    DLLNode head;
    DLLNode tail;

    public DLL() {

        head = tail = null;
    }

    public boolean isEmpty() {

        return head == null;
    }

    public void addToTail(int newVal) {

        DLLNode newNode = new DLLNode(newVal);      // Step 1: Create a new node with the specified value

        if (head == null)                // Step 2: Check if the list is empty
            head = tail = newNode;      // If the list is empty, set both head and tail to the new node
        else {                         // Step 3: Add to the tail of the list
            newNode.prev = tail;        // Set the prev pointer of the new node to the current tail
            tail.next = newNode;        // Set the next pointer of the current tail to the new node
            tail = newNode;             // Update the tail to be the new node, making it the new tail of the list
        }
    }

    public void addToHead(int val) {

        DLLNode newNode = new DLLNode(val);

        if (head == null)
            head = tail = newNode;
        else {
            newNode.next = head;    // Set the next pointer of the new node to the current head
            head.prev = newNode;    // Set the prev pointer of the current head to the new node
            head = newNode;         // Update the head to be the new node, making it the new head of the list
        }
    }

    public int deleteFromHead() {

        if (isEmpty())                       // Check if the list is empty
            return -1;                        // Return -1 to indicate that the list is empty

        if (head != null && head.next == null) {                // Check if there's only one node in the list
            // Only one node in the list
            int delVal = head.value;        // Store the value of the head node
            head = tail = null;             // Set both head and tail to null, as there's only one node
            return delVal;                  // Return the value of the deleted node

        }
        // else, More than one node in the list
            DLLNode delNode = head;     // Create a reference to the current head node

            head = head.next;           // Move the head reference to the next node
            head.prev = null;           // Set the prev reference of the new head to null
            delNode.next = null;        // Set the next reference of the deleted node to null

            return delNode.value;       // Return the value of the deleted node

    }

    public int deleteFromTail() {

        if (isEmpty())
            return -1;

        if (head.next == null) {           // Check if there's only one node in the list
            return deleteFromHead();    // code reusability.
        } else {                         // More than one node in the list
            DLLNode delNode = tail;     // Create a reference to the current tail node
            tail = tail.prev;           // Move the tail reference to the previous node
            tail.next = null;           // Set the next reference of the new tail to null , disconnect
            delNode.prev = null;        // Set the prev reference of the deleted node to null, disconnect

            return delNode.value;
        }
    }

    public int deleteNode(int delValue) {   // too many cases here

        if (isEmpty())
            return -1;  // Return -1 to indicate that the list is empty

        if (head.value == delValue) {
            deleteFromHead();
            return 1;       // Return 1 to indicate successful deletion
        }

        if (tail.value == delValue) {
            deleteFromTail();
            return 1;
        }

        if (head == tail && head.value != delValue) {   // Check if the node to delete is not in the list, in case there is 1 node in the list.
            return -1;          // Return -1 to indicate that the node with delValue is not found in the list.
        }

        DLLNode current = head.next; // Traverse the list to find the node with the specified value // head.next because I already checked head.

        while (current != null) {
            if (current.value == delValue) {
                break;           // Node with delValue found, exit the loop
            }
            current = current.next; // Move to the next node
        }

        if (current == null) {      // Check if the node with delValue is not found. just in case I add this, but not needed.
            return -1;

        } else if (current.value == delValue) {   // Node with delValue found, perform deletion (the important part).
            current.next.prev = current.prev;   //This line updates the prev reference of the node that comes after current to point to the node before current. It essentially removes the connection from the next node's prev to the current node.
            current.prev.next = current.next;   //This line updates the next reference of the node that comes before current to point to the node after current. It essentially removes the connection from the previous node's next to the current node.
            current.next = null;                //This effectively disconnects the current node from the list, ensuring that it no longer points to any other nodes.
            current.prev = null;
            return 1;
        }
        return 0;           // Return 0 (possibly if there are no nodes in the list)
    }

    public void displayList() {

        if (head == null) {
            System.out.println(" The list is empty ");
            return;
        }

        DLLNode current = head;

        while (current != null) {
            System.out.print(current.value + " <-> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public void printList() {
        DLLNode current = head;
        while (current != null) {
            System.out.print(current.value + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void append(DLL newList) {                           //Question 9: Append new list
        if (newList == null || newList.head == null) {
            return;
        }

        DLLNode current = head;

        while (current != null && current.next != null) {
            current = current.next;
        }

        // Append elements from the new DLL to the current DLL
        DLLNode newCurrent = newList.head;
        while (newCurrent != null) {
            DLLNode newNode = new DLLNode(newCurrent.value);

            if (current == null) {

                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                newNode.prev = current;
                current = newNode;
            }
            newCurrent = newCurrent.next;
        }
    }

    public int count_divisors(int key) {            //Question 10 : Count divisors in DLL

        DLLNode current = head;
        int count_divisors = 0; // I want to count specific numbers not all

        if (isEmpty()) {        //just to improve the code.
            return -1;
        }

        while (current != null) {

            if (current.value % key == 0) {
                count_divisors++;
            }
            current = current.next;
        }
        return count_divisors;
    }
}
