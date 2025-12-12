public class Lists {        // here I will use SLL, DLL, stack , Queue.

//    public static DLLNode copyLists(DLLNode L1, DLLNode L2) {       //Question 8: from practice papers, Copy 2 lists into new list
//        DLLNode newHead = null;
//        DLLNode tail = null;
//
//        // Copy elements from the first list
//        DLLNode current = L1;
//        while (current != null) {
//            DLLNode newNode = new DLLNode(current.value);
//            if (newHead == null) {
//                newHead = newNode;
//                tail = newNode;
//            } else {
//                tail.next = newNode;
//                newNode.prev = tail;
//                tail = newNode;
//            }
//            current = current.next;
//        }
//
//        // Copy elements from the second list
//        current = L2;
//        while (current != null) {
//            DLLNode newNode = new DLLNode(current.value);
//            tail.next = newNode;
//            newNode.prev = tail;
//            tail = newNode;
//            current = current.next;
//        }
//        return newHead;
//    }

    public static void main(String[] args) {

//        DLL List1 = new DLL();
//        List1.addToTail(5);
//        List1.addToTail(7);
//        List1.addToTail(4);
//        List1.addToTail(8);
//
//        DLL List2 = new DLL();
//        List2.addToTail(7);
//        List2.addToTail(9);
//        List2.addToTail(3);
//        List2.addToTail(2);

//        int key = 9;                                        //Question: 10: count divisors in DLL
//
//        int result = List2.count_divisors(key);
//
//        if (result == -1) {
//            System.out.println("DLL is empty.");
//        } else {
//            System.out.println("Number of elements divisible by " + key + ": " + result);
//        }
//-------------------------------------------------------------

//        List1.append(List2);                                //Question 9: append new list
//
//        // Print the elements of the combined list
//        List1.printList();
//

//-----------------------------------------------------------    //Question 8: Copy 2 lists into new list
//        // Copy lists into one complete list
//        DLLNode newHead = copyLists(List1.head, List2.head);
//
//        // Print the elements of the new list
//        DLLNode current = newHead;
//        while (current != null) {
//            System.out.print(current.value + " ");
//            current = current.next;
//        }

//-----------------------------------------------------
//        DLL newList1 = new DLL();

//        int[] arr = new int[10];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i * 2;
//        }
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);
//----------------------------------------------------- Q: arrays question, reverse the elements of an array.
//        int first = 0, last = arr.length - 1;
//
//        while (first != last || last != first + 1) {   //if single or double array
//
//            int temp = arr[first];      // this is  how to flip array numbers
//            arr[first] = arr[last];
//            arr[last] = temp;
//
//            first++;
//            last--;
//        }
//-------------------------------------------------------

//        System.out.println(newList.isEmpty());

//        for (int k = 1; k <= 10; k++) {
//            newList.addToHead(k);
//        }
//        System.out.println(newList.checkNumbers()); //will give false, first 2 numbers != last 2 numbers.
//
        /*
        newList.deleteHead();
        newList.addToHead(17);
        newList.deleteTail();
        newList.deleteNode(4); */

//       newList.printList();

        //-------------------------------------------------------   Q: Adding from list to array

//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//
//            arr[i] = newList.deleteTail();
//            System.out.print(" [ " + arr[i] + " ] ");
//        }
//        System.out.println("");

        //-------------------------------------------------------      Q: Adding from array to list
//
//       for (int j = 0; j < arr.length; j++) {
//           newList.addToTail(arr[j]);
//        }
//
//       newList.printList();        // to check if the numbers are added to list again.
//
// ------------------------testing QueueList Class-------------------------------
//        QueueList myQ = new QueueList();
//
//        myQ.enqueue(1);
//        myQ.enqueue(2);
//        myQ.enqueue(3);
//        myQ.enqueue(4);
//        myQ.enqueue(5);
//        myQ.enqueue(6);
//
//        myQ.displayQ();
////let's try dequeue method and print
//        System.out.println(myQ.dequeue());
//        System.out.println(myQ.dequeue());
//        System.out.println(myQ.dequeue());
//        System.out.println(myQ.dequeue());
//        System.out.println(myQ.dequeue());
//        System.out.println(myQ.dequeue());
//
//        // ------------------------testing QueueArray Class-------------------------------
//        QueueArray myQ = new QueueArray();
//
//        myQ.enqueue(1);
//        myQ.enqueue(2);
//        myQ.enqueue(3);
//        myQ.enqueue(4);
//        myQ.enqueue(5);
//        myQ.enqueue(6);
//
//        myQ.displayQ();
////let's try dequeue method and print
//        System.out.println(myQ.dequeue());
//        System.out.println(myQ.dequeue());
//        System.out.println(myQ.dequeue());
//        System.out.println(myQ.dequeue());
//        System.out.println(myQ.dequeue());
//        System.out.println(myQ.dequeue());
    }
}